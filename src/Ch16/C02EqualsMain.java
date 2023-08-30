package Ch16;

class C02Simple{
	int n;

	C02Simple(int n) {
		this.n = n;
	}
	//두 객체간의 n의 값이 일치하면 동등객체 equals 재정의 예정

	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof C02Simple) {
			C02Simple down = (C02Simple) obj;
			return this.n == down.n;
		}
		
		return false;
	}
	
	
}
class B{
	
}

public class C02EqualsMain {

	public static void main(String[] args) {
		
		C02Simple o1 = new C02Simple(10);
		C02Simple o2 = new C02Simple(10);
		C02Simple o3 = new C02Simple(20);
		
		B o4 = new B();
		System.out.println(o1==o2);
		System.out.println(o1.equals(o2));
		
		String a = "JAVA";
		String b = "JAVA";
		System.out.println();
		System.out.println(a==b);
		
		

	}

}
