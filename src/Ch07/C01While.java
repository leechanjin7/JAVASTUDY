package Ch07;

import java.util.Scanner;

public class C01While {
	
	public static void main(String[] args) {
		
		//문제
		//N,M을 입력받아서 N부터 M까지의 합 구하기(N<M)
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("시작 숫자를 입력하세요 : ");
//		int n = sc.nextInt();
//		System.out.print("마지막 숫자를 입력하세요 : ");
//		int m = sc. nextInt();
//		
//		int sum =0;
//		int i = n;
//		while(i<=m) {
//			sum += i;
//			i++;
//		}
//		System.out.println("SUM : " + sum);
		
		//문제
		//프로그램 사용자로부터 양의 정수를 하나 입력 받은 다음 그 수만큼
		//3의 배수를 출력하는 프로그램을 작성
		// ex) 5를 입력 받았다면 3,6,9,12,15를 출력
		
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자하나를 입력해주세요 : ");
//		int n = sc.nextInt();
//		int i = 1;
//		while(i<=n) {
//			if(i<n) {
//				System.out.println(i*3 + ",");
//			}else {
//				System.out.println(i*3);
//			}
//			i++;
//		}
		
		
		//문제
		//1부터 100까지 수 중에 짝수의 합과 홀수의 합을 각각 구해서 출력
		
//		int i = 1;
//		int even = 0;
//		int odd= 0;
//		while(i<=100) {
//			if(i%2==0) {
//				even = even + i;
//			}else {
//				odd = odd + i;
//			}
//			i++;
//		}
//		System.out.println("짝수의 합 : " + even);
//		System.out.println("홀수의 합 : " + odd);
		
		
		//문제
		//1부터 N까지 수중에 짝수의 합과 홀수의 합을 각각 구해서 출력
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("마지막 숫자를 입력하세요 : ");
//		int n = sc.nextInt();
//		int i = 1;
//		int even = 0;
//		int odd = 0;
//		while(i<=n) {
//			if(i%2==0) {
//				even += i;
//			}else {
//				odd += i;
//			}
//			i++;
//		}
//		System.out.println("짝수의 합 : " + even);
//		System.out.println("홀수의 합 : " + odd);
		
		
		//문제
		//1부터 100까지 수중에 3의 배수를 제외한 합을 구해서 출력
		
//		int i = 1;
//		int sum =0;
//		while(i<=100) {
//			if(i%3==0) {
//				
//			}else {
//				sum += i;
//			}
//			i++;
//		}
//		System.out.println("SUM : " + sum);
		
		
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		
		int len = str1.length()-1;
		String r = "";
		System.out.println("길이 : " + len);
		while(len>=0) {
			r = r + str1.charAt(len);
			len--;
		}
		System.out.println(r);
	}

}
