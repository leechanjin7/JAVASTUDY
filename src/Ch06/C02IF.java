package Ch06;

import java.util.Scanner;

public class C02IF {

	public static void main(String[] args) {
		
		//입력한수가 짝수이고, 3의 배수라면 출력
		//입력한수가 홀수이고, 5의 배수라면 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자하나를 입력하세요 : ");
		int n = sc.nextInt();
		
		if(n%2==0) 
		{
			if(n%3==0) 
			{
				System.out.println(n + " 은 짝수이면서 3의배수이다.");
			}
		}else
		{
			if(n%5==0)
			{
				System.out.println(n+" 은 홀수면서 5의배수이다.");
			}
		}
		sc.close();
	}
}
