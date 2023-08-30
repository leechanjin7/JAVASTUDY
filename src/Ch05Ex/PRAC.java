package Ch05Ex;

import java.util.Scanner;

public class PRAC {
	
	public static void main(String[] args) {
		
		// 문제(삼항연산자)

		// 조건식 : 국어>=40&&영어>=40&&수학>=40&&평균>=70 -> 합격
		// 키보드로 국어/영어/수학 점수를 입력받아 각각의부분점수가 40점이상이고
		// 총점수 평균이 70점이상이면 '합격'
		// 미만이면 '불합격'을 출력합니다
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("국어점수를 입력하세요 : ");
//		int a = sc.nextInt();
//		System.out.print("영어점수를 입력하세요 : ");
//		int b = sc.nextInt();
//		System.out.print("수학점수를 입력하세요 : ");
//		int c = sc.nextInt();
//		
//		int avg = (a+b+c)/3;
//		System.out.println("평균 : " + avg);
//		String result = (a>=40 && b>=40 && c>=40 && avg>=70)?"합격" : "불합격";
//		
//		System.out.println("결과 : " + result);
//		sc.close();
		
		
		//미니문제(%연산자)
		//키보드로부터 정수값 2를 입력받아 두수의 합이 짝수이면 "짝수입니다"
		//홀수이면 "홀수입니다"를 출력하세요
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("첫번째 정수 입력 : ");
//		int a = sc.nextInt();
//		System.out.print("두번째 정수 입력 : ");
//		int b = sc.nextInt();
//		
//		int sum = a + b;
//		System.out.println("두 수의 합 : " + sum);
//		
//		String result = (sum%2==0) ? "짝수입니다" : "홀수입니다";
//		System.out.println("결과는 : " + result);
		
		
		//국어 / 영어 / 수학 점수를 입력받아서
		//국어 점수가 40점이상
		//영어 점수가 40점이상
		//수학 점수가 40점이상이면서 전체평균이 60점이상이면 합격을 출력
		//아니면 불합격을 출력하세요
		//삼항연산자와 논리연산자를 이용합니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수는요 : ");
		int a = sc.nextInt();
		System.out.print("영어점수는요 : ");
		int b = sc.nextInt();
		System.out.print("수학점수는요 : ");
		int c = sc.nextInt();
		
		int avg = (a+b+c)/3;
		System.out.println("평균은요 : "+ avg);
		
		String result = (a>=40 && b>=40 && c>=40 && avg>=60) ? "합격" : "불합격";
		System.out.println("결과는 : " + result);
	}

}
