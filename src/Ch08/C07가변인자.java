package Ch08;

class C07Simple{
	int sum(int ...arg) {
		int s = 0;
		for(int n : arg) {
			System.out.println("인자 값 : " + n);
			s += n;
		}
		return s;
	}
}

public class C07가변인자 {

	public static void main(String[] args) {
		
		C07Simple sp = new C07Simple();
		sp.sum(10);
		System.out.println();
		sp.sum(10,20);
		System.out.println();
		sp.sum(10,20,30);
		System.out.println();
		sp.sum(10,20,30,40);
		System.out.println();
		
		int r = sp.sum(10,20,30,40,50,60,70);
		System.out.println("합계 : " + r);
	}
}
