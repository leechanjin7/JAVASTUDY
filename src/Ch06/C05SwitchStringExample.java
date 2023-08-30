package Ch06;

import java.util.Scanner;

public class C05SwitchStringExample {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("직책을 입력하세요 : ");
		String position = sc.next();
		
		switch(position) {
		
		case "대리" :
			System.out.println("300만원");
			break;
		case "과장" :
			System.out.println("500만원");
			break;
		case "부장" :
			System.out.println("700만원");
			break;
		default :
			System.out.println("230만원");
		}
	}

}
