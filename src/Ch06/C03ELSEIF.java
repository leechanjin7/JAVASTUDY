package Ch06;

import java.util.Scanner;

public class C03ELSEIF {

	public static void main(String[] args) {
		
		// 90점이상 : A				x >= 90
		// 80 이상 90점 미만 : B		80<=x<90
		// 70 이상 80점 미만 : C		70<=x<80
		
		// 국어(40점) / 영어(40점) / 수학(40점)
		// 국어<40 -불합격
		// 영어<40 -불합격
		// 수학<40 -불합격
		// 평균<60 -불합격
		// 그외 : 합격
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("국어점수 : ");
//		int a = sc.nextInt();
//		System.out.print("영어점수 : ");
//		int b = sc.nextInt();
//		System.out.print("수학점수 : ");
//		int c = sc.nextInt();
//		int avg = (a+b+c)/3;
//		System.out.println("평균은 : "+avg);
//		
//		if(a<40)
//		{
//			System.out.println("불합격");
//		}else if(b<40){
//			System.out.println("불합격");
//		}else if(c<40) {
//			System.out.println("불합격");
//		}else if(avg<60) {
//			System.out.println("불합격");
//		}else {
//			System.out.println("합격");
//		}
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("점수는요 : ");
//		int n = sc.nextInt();
//		
//		if(n>=90)
//		{
//			System.out.println("A");
//		}else if(n>=80) {
//			System.out.println("B");
//		}else if(n>=70) {
//			System.out.println("C");
//		}else if(n>=60) {
//			System.out.println("D");
//		}else {
//			System.out.println("E");
//		}
		
		//나이별로 요금을 부과하는 else if문을 만드세요
		//8세 미만  : 요금은 1000원
		//14세미만 : 요금은 2000원
		//20세미만 : 요금은 2500원
		//20세이상 : 요금은 3000원
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("나이를 입력하세요 : ");
//		int age = sc.nextInt();
//		int charge = 0;
//		
//		if(age<8) {
//			charge=1000;
//		}else if(age<14) {
//			charge=2000;
//		}else if(age<20) {
//			charge=2500;
//		}else if(age>=20) {
//			charge=3000;
//		}
//		System.out.println("나이는 "+ age + "이고 "+ "요금은 " + charge + "입니다.");
	
		//문제
		
		//시험 점수를 입력받아 90 ~ 100점은 A, 
		//80 ~ 89점은 B, 70 ~ 79점은 C, 
		//60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
		
		// score >= 90 A
		// score >= 80 B
		// score >= 70 C
		// score >= 60 D
		// 그외 F
		//or
		// score <60 F
		// score <70 D
		// score <80 C
		// score <90 B
		// 그외 A
		
		Scanner sc = new Scanner(System.in);
		System.out.print("시험점수를 입력하세요 : ");
		int n = sc.nextInt();
		
		if(n>=90) {
			System.out.println("A");
		}else if(n>=80) {
			System.out.println("B");
		}else if(n>=70) {
			System.out.println("C");
		}else if(n>=60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
	
	
	
	}
}
