package Ch19Ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1 {
	
	public static void func1(List<String> list) {
		list.add("AAAAAAAA");
		list.add("BB");
		list.add("CCCCC");
		list.add("CCCCAWEADWE");
		list.add("EFWC");
		//ArrayList에 있는 문자열 중에서 길이가 5보다 큰 문자열만 출력하는 코드를 작성하세요.
		
		for(String el : list) {
			if(el.length()>5) {
				System.out.println(el);
			}
		}

	}
	
	public static List<String> func2(List<String> list){
		Scanner sc = new Scanner(System.in);
		String el = null;
		System.out.print("입력하세요 : ");
		while(true) {
			el = sc.next();
			if(el.length()>5)
				break;
			System.out.print("다시입력 : ");
		}
		list.add(el);
		sc.close();
		return list;
	}
	
	public static void func3() {
		//ArrayList에 있는 정수값을 입력받는데 전달되는 수중에
		//짝수의 값만 입력받는 코드를 작성하세요.
		//func3함수 완성하기
		List<Integer> list = new ArrayList();
		Scanner sc = new Scanner(System.in);
		int n = 0;
		
		while(true) {
			n = sc.nextInt();
			if(n%2==0)
				break;
		}
		list.add(n);
	}
	
	public static void main(String[] args) {
		
		List<String> li = new ArrayList();
		func1(li);
		func2(li);
		func3();
	}

}
