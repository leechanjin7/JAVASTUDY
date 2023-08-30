package Ch06;

import java.util.Scanner;

public class C01IF {

	public static void main(String[] args) {
		
		//단순 IF
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("나이 : ");
//		int age = sc.nextInt();
//		if(age>=8)
//			System.out.println("학교에 다닙니다.");
//		
//		System.out.println("첫번째 IF 블럭 종료");
//		if(age < 8)
//			System.out.println("학교에 다니지 않습니다.");
//		
//		System.out.println("두번째 IF 블럭 종료");
//		System.out.println("프로그램을 종료합니다.");
		
		
		
		//IF - ELSE
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("나이를 입력하세요 : ");
//		int age = sc.nextInt();
//
//		if(age >= 8){
//			System.out.println("학교에 다닙니다.");
//		}else {
//			System.out.println("학교에 다니지 않습니다.");
//		}
		
		
		//입력값 받기 + if
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("정수 하나 입력 : ");
//		int a = sc.nextInt();
//		
//		if(a%2==0) {
//			System.out.println("입력한 정수는 짝수이다.");
//		}else {
//			System.out.println("입력한 정수는 홀수이다.");
//		}
		
		
		//문제
		//정수 한개 값을 입력받아 3의 배수이면 해당 수를 출력하세요
		//3의 배수이면서 5의 배수라면 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수하나 입력하세요 : ");
		int n = sc.nextInt();
		
		if(n%3==0 && n%5==0) {
			System.out.println(n +" 은 3의 배수이면서 5의배수입니다.");
		}else {
			System.out.println(n +" 은 3의 배수가 아닙니다.");
		}

	}

}
