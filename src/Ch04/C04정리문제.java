package Ch04;

import java.util.Scanner;

public class C04정리문제 {

	public static void main(String[] args) {

		// 1. Scanner를 이용해서 키보드로 입력한 두수를 덧셈하여 결과를 출력해보세요
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("첫번째 수를 입력하세요 : ");
//		int n1 = sc.nextInt();
//		
//		System.out.print("두번째 수를 입력하세요 : ");
//		int n2 = sc.nextInt();
//		
//		int result = n1 + n2;
//		System.out.print("덧셈 결과 : "+ result);
		
		
		//2. Scanner를 이용해서 이름, 주민번호 앞 6자리, 전화번호를 키보드에서 입력받고 출력하는 코드를 작성해보세요
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("이름은 : ");
		String name = sc.next();
		System.out.print("주민번호 앞 6자리 : ");
		String id = sc.next();
		System.out.print("전화번호 : ");
		String ph = sc.next();
		
		
	}

}
