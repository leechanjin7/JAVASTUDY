package Ch05;

import java.util.Scanner;

public class C01basic {
	
	public static void main(String[] args) {
		// 기본 산술 연산자
		
//		int a = 10, b = 20, c;
//		System.out.println("a+b="+(a+b));
//		System.out.println("a-b="+(a-b));
//		System.out.println("a*b="+(a*b));
//		System.out.println("b/a="+(b/a));
//		System.out.println("a%b="+(a%b));
//		System.out.println("-a="+ -a);
		
		//문제
		//두수를 입력 받아 두수의 합/곱/차를 출력하는 프로그램을 만들어보세요
//		Scanner sc = new Scanner(System.in);
//		System.out.println("두수입력하라");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		System.out.println(a+b);
//		System.out.println(a*b);
//		System.out.println(a-b);
		
		//대입연산자
		//LV = RV;
		//공간 = 값(우선처리);
		
		//복합대입 연산자(산술+대입)
//		int a = 10;
//		a += 10; // a = a + 10;
//		a -= 10; // a = a - 10;
//		a *= 3; // a = a * 3;
//		System.out.println("a = " +a);
		
		////비교연산자

//		int a =10;
//		int b=20;
//		System.out.println("A == B : "+ (a == b)); // a=b
//		System.out.println("A  > B : "+ (a > b));
//		System.out.println("A  < B : "+ (a < b));
//		System.out.println("A >= B : "+ (a >= b));
//		System.out.println("A <= B : "+ (a <= b));
//		System.out.println("A != B : "+ (a != b));
		
		
		
		////논리연산자 
		//AND 연산자	&& :  (true)&&(true) = true , 그외는 거짓
		//- &&기호를 기준으로 왼/오른쪽 둘다 true 이면 true
		//OR 연산자	|| :  t||t = t, t||f =t, f||t=t, f||f=f
		//- ||기호를 기준으로 왼/오른쪽 중 하나만 true 이면 true
		//! 연산자
		//- true이면 false, false 이면 true

//		int a=10;int b=20;
//		System.out.println((a>=b)&&(a>5));
//		System.out.println((a!=b)&&(b>15));
//		
//		System.out.println((a>=b)||(a>5));
//		System.out.println((a!=b)||(b>15));
//		System.out.println((a==b)||(a<=5));
//		
//		System.out.println("false AND false = " + (true && true));
//		System.out.println("false AND true = " + (false && true));
//		System.out.println("true AND false = " + (true && false));
//		System.out.println("true AND true =  " + (false && false));

		
		
		
		////논리부정연산자
//		boolean play = true;
//		System.out.println(play);
//
//		play = !play;
//		System.out.println(play);
//
//		play = !play;
//		System.out.println(play);
		
		
		//증감연산자
		//++a(--a) : 전치 연산자 : 먼저 값1증가(감소) 이후 다른 연산자 처리
		//a++(a--) : 후치 연산자 : 다른 연산자 처리 먼저 한 후 1증가(감소)
		
//		int a = 10, b = 10, c,d = 0;
//		
//		c = --a + b++;
//		d = a-- + ++b;
//		System.out.printf("a=%d, b=%d, c=%d, d=%d", a,b,c,d );
		
		
		
		//삼항연산자
		//(조건식)? 참인경우 실행코드 : 거짓인경우 실행코드;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("제 점수는요 : ");
		int score = sc.nextInt();
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		System.out.println(score + "점은 " + grade + "등급입니다.");
		
		
	}

}
