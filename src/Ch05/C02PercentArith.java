package Ch05;

import java.util.Random;

public class C02PercentArith {
	
	public static void main(String[] args) throws InterruptedException {
		
		// %연산자
		
		//01 홀수 / 짝수
		
		//Scanner 객체 생성 후 정수를 num1에 저장한 다음 짝홀수를 확인
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자를 입력하세요 : ");
//		int num1 = sc.nextInt();
//		
//		String result = (num1%2==0) ? "짝수입니다." : "홀수입니다.";
//		System.out.println("결과 : " + result);
		
		//02 배수 구하기
		//세 정수를 받아서 세 수의 합이 5의 배수인 경우 5의 배수입니다를 출력 아닌경우 5의 배수가 아닙니다를 출력
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("숫자를 입력하세요 : ");
//		int a = sc.nextInt();
//		System.out.print("숫자를 입력하세요 : ");
//		int b = sc.nextInt();
//		System.out.print("숫자를 입력하세요 : ");
//		int c = sc.nextInt();
//		
//		int sum = 0;
//		sum = a + b + c;
//		String result = (sum%5==0)? "5의배수입니다." : "5의배수가 아닙니다.";
//		System.out.println("RESULT : " + result);
		
		
		//03 수의 범위
		
		//난수 생성
//		Random rnd = new Random();
//		
//		while(true) {
//			System.out.println(rnd.nextInt(5));
//			Thread.sleep(500);
//		}
		
		//02 Math.random();
//		while(true) {
//			System.out.println((int)(Math.random()*100)%16);
//			Thread.sleep(500);
//		}
		
		
		// 04 끝자리수

//		int num = 56789;
//
//		System.out.println("오른쪽 끝 1자리 : " + (num % 10));
//		System.out.println("오른쪽 끝 2자리 : " + (num % 100));
//		System.out.println("오른쪽 끝 3자리 : " + (num % 1000));
//		System.out.println("오른쪽 끝 4자리 : " + (num % 10000));
//		System.out.println();
//		System.out.println("왼쪽 끝 1자리 : " + (num / 10000));
//		System.out.println("왼쪽 끝 2자리 : " + (num / 1000));
//		System.out.println("왼쪽 끝 3자리 : " + (num / 100));
//		System.out.println("왼쪽 끝 4자리 : " + (num / 10));
		
		//정수 하나를 입력받아 거꾸로 저장해보세요(반복문법 이후 풀어보기)%,/연산 동시이용할 것
		//예
		
//		입력: 1234
//		저장
//		int reverse = 4321;
//		출력 : 4321
		
		
	}

}
