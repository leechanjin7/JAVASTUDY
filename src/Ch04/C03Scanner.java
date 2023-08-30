package Ch04;

import java.util.Scanner;

public class C03Scanner {

	public static void main(String[] args) {
		
		//이름을 입력하세요
		//홍길동님의 나이를 입력하세요
		//홍길동님의 주소를 입력하세요
		//홍길동님의 나이는 35세 주소는 대구광역시 ~~ 입니다
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.print(name + "님의 나이를 입력하세요 : ");
		
		int age = sc.nextInt();
		System.out.print(name + "님의 주소를 입력하세요 : ");
		sc.nextLine();
		String addr = sc.nextLine();
		System.out.print(name+"님의 나이는 "+age+"세 "+"주소는 "+addr+"입니다.");
		

	}

}
