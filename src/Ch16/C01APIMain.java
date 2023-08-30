package Ch16;

class A{
	int x;
	int y;
	@Override
	public String toString() {
		return "x="+x+" y=" +y;
	}
	
	
}

public class C01APIMain {
	
	public static void main(String[] args) {
		
		Object o = new Object();
		
		System.out.println(o);
		System.out.println(o.toString());
		
		
		A o2 = new A();
		System.out.println(o2);
		System.out.println(o2.toString());
	}

}
