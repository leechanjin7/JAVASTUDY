package Ch08;

class C05Simple{
	int num;
	
	void Func1() {
		num = 5;
		System.out.println("변수 num : " + num);
		int num = 10;
		System.out.println("변수 num : " + num);
		num++;
		System.out.println("변수 num : " + num);
		this.num++;
		System.out.println("변수 num : " + this.num);
	}
	void Func2() {
		System.out.println("변수 num : " + num);
		if(true) {
			int num = 20;
			this.num++;
			System.out.println("변수 num : " + num);
		}
		System.out.println("변수 num : " + num);
	}
	void Func3() {
		System.out.println("변수 num : " + num);
		while(num>0) {
			int num = 100;
			System.out.println("변수 num : " + num);
			num++;
			break;
		}
		System.out.println("변수 num : " + num);
	}
	
	
}

public class C05LocalVar {
	
	public static void main(String[] args) {
		
		C05Simple obj = new C05Simple();
		obj.Func1();
		System.out.println();
		obj.Func2();
		System.out.println();
		obj.Func3();
	}

}
