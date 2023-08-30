package Ch16;

import java.util.Objects;


class C03Simple{
	private int id;
	int n;
	
	C03Simple(int id, int n) {
		this.id = id;
		this.n = n;
	}

	@Override
	public int hashCode() {
		
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof C03Simple) {
			C03Simple down = (C03Simple) obj;
			return Objects.equals(this.id, down.id);
		}
		return false;
	}

	@Override
	public String toString() {
		
		return "C03Simple@" + hashCode();
	}
	
	
}

public class C03HashCodeMain {
	
	public static void main(String[] args) {
		
		C03Simple o1 = new C03Simple(1,5);
		C03Simple o2 = new C03Simple(1,6);
		System.out.println(o1.equals(o2));
		System.out.println(o1);
		System.out.println(o2);
		System.out.printf("%x\n",o1.hashCode());
		
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
		System.out.println(System.identityHashCode(o1));
		System.out.println(System.identityHashCode(o2));
	}

}
