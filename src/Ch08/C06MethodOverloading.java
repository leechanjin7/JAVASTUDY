package Ch08;

class C06Simple{
	String name;
	int sum(int x, int y) {
		System.out.println("sum(int,int)호출!");
		return x+y;
	}
	int sum(double x, double y) {
		System.out.println("sum(double, double)호출!");
		return (int) (x+y);
	}
	int sum(int x, int y,int z) {
		System.out.println("sum(int, int, int)호출!");
		return x+y+z;
	}
	int sum(String str1, int x, int y) {
		System.out.println("sum(String, int, int)호출!");
		name = str1;
		return x+y;
	}
}

public class C06MethodOverloading {

	public static void main(String[] args) {
		
		C06Simple s = new C06Simple();
		int r1 = s.sum(10,20);
		System.out.println("r1 :" + r1);
		int r2 = s.sum(12.2, 15.5);
		System.out.println("r2 : " + r2);
		int r3 = s.sum(10, 20,30);
		System.out.println("r3 : " + r3);
		int r4 = s.sum("홍길동", 20,30);
		System.out.println("r4 : " + r4);
		System.out.println(s.name);
	}
}
