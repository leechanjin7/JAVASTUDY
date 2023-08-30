package Ch11;

import java.util.Arrays;
import java.util.Scanner;

public class C01ArrayMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int [] arr1 = new int[4];	//idx 0,1,2,3
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		arr1[3] = 40;
		System.out.println("길이 : " + arr1.length);
		
		for(int i =0; i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		System.out.println();
		for(int el:arr1) {
			System.out.println(el);
		}
		System.out.println();
		
		Arrays.stream(arr1).forEach(el->System.out.println(el));
		System.out.println();
		
		double arr2[];
		arr2 = new double[5];
		
		//5개의 정수값을 입력받아 int형 배열에 저장하고
		//최대값, 최소값, 전체값을 출력합니다
		
		System.out.println(Arrays.stream(arr1).max().getAsInt());
		System.out.println(Arrays.stream(arr1).min().getAsInt());
		System.out.println(Arrays.stream(arr1).average().getAsDouble());

	}

}
