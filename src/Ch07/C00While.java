package Ch07;

import java.util.Scanner;

public class C00While {
	
	public static void main(String[] args) {
		
		//01 반복문 기본
		
//		int i = 1;
//		while(i<=10)
//		{
//			System.out.println("HELLO WORLD");
//			i++;
//		}
//		System.out.println("i : " + i);
		
		
		//02 1-10까지의 합
//		int i = 1;
//		int sum = 0;
//		
//		while(i<=10)
//		{
//			System.out.println("i : " + i);
//			sum += i ;  //(sum = sum +i;)
//			i++;
//		}
//		System.out.println("SUM : " + sum);
		
		//03 1 - N 까지의 합
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자를 입력하세요 : ");
//		int n = sc.nextInt();
//		int i = 1;
//		int sum = 0;
//		
//		while(i<=n)
//		{
//			System.out.println("i : " + i);
//			sum += i;
//			i++;
//		}
//		System.out.println("SUM : " + sum);
		
		//문제
		//N - M 까지의 합을 구하세요 (N<M)
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("시작 숫자를 입력하세요 : ");
//		int a = sc.nextInt();
//		System.out.print("마지막 숫자를 입력하세요 : ");
//		int b = sc.nextInt();
//		
//		int sum = 0;
//		int i = a;
//		while(i<=b) {
//			System.out.println("i : " + i);
//			sum = sum + i; //sum += i;
//			i++;
//		}
//		System.out.println("SUM : " + sum);
		
		
		//04 1 - N 까지 수중에 짝수/홀수의 합을 각각 출력
//		Scanner sc = new Scanner(System.in);
//		System.out.print("마지막 숫자를 입력하세요 : ");
//		int a = sc.nextInt();
//		int i = 1;
//		int sum = 0;
//		int odd = 0;
//		int even = 0;
//		while(i<=a) {
//			System.out.println("i : " + i);
//			sum += i;
//			if(i%2==0) {
//				even = even + i;
//			}else {
//				odd = odd + i;
//			}
//			i++;
//		}
//		System.out.println("SUM : " + sum);
//		System.out.println("짝수의 합 : " + even);
//		System.out.println("홀수의 합 : " + odd);
		
		//05 1 - N 까지의 수 중에 3의 배수만 출력하고 그합도 출력
//		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요 : ");
//		int a = sc.nextInt();
//		int i = 1;
//		int sum = 0;
//		
//		while(i<=a) {
//			if(i%3==0) {
//				System.out.println("i : " + i);
//				sum += i;
//			}
//			i++;
//		}
//		System.out.println("SUM : " + sum);
		
		//1-N까지 수 중에 4의 배수를 출력하고 4의 배수가 아닌 나머지의 합을 구하세요
		
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int i = 1;
//		int sum = 0;
//		while(i<=a) {
//			if(i%4==0) {
//				System.out.println("i : " + i);
//			}else {
//				sum += i;
//			}
//			i++;
//		}
//		System.out.println("SUM : " + sum);
		
		
		//구구단 2단 출력
		//구구단 N단 출력(N<=9)
		
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		System.out.println("단수를 입력하세요 : ");
		int dan = sc.nextInt();
		while(i<=9) {
			System.out.println(dan + "x" + i + "=" + (dan*i));
			i++;
		}
	}

}
