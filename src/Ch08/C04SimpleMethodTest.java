package Ch08;

import java.util.Scanner;

class Sum{
	Scanner sc = new Scanner(System.in);
	
	int sum1(int x, int y) {
		System.out.println("int sum1(x,y) 호출!");
		return x+y;
	}
	int sum2() {
		System.out.println("int sum2() 호출!");
		int x = sc.nextInt();
		int y = sc.nextInt();
		return x+y;
	}
	void sum3(int x, int y) {
		System.out.println("void sum3(int x, int y) 호출!");
		System.out.printf("%d + %d = %d\n", x,y,x+y);
	}
	void sum4() {
		System.out.println("void sum4() 호출!");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.printf("%d + %d = %d\n", x,y,x+y);
	}
}

public class C04SimpleMethodTest {
	
	public static void main(String[] args) {
		
		Sum calc = new Sum();
		int result1 = calc.sum1(10, 20);
		System.out.println("result1 : " + result1);
		int result2 = calc.sum2();
		System.out.println("result2 : " + result2);
		calc.sum3(200,300);
		calc.sum4();
	}
}
