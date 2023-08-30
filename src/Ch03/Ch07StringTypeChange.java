package Ch03;

public class Ch07StringTypeChange {

	public static void main(String[] args) {
		//----------------------------------------
		//문자열 + 문자열
		//----------------------------------------
		System.out.println("문자열1" + "문자열2");
		System.out.println("문자열1" + ','+"문자열2");
		System.out.println("문자열1" + 2);
		System.out.println("문자열"+ ',' +'!');
		
		//----------------------------------------
		//문자열 -> 숫자형 반환
		//----------------------------------------
		//문자열 -> 숫자형으로 변환(정수)
		//int n1 = "10";
		
		System.out.println("10" + "20");
		
		int n1 = Integer.parseInt("10");
		int n2 = Integer.parseInt("20");
		System.out.println(n1+n2);
		
		//문자열 -> 숫자형으로변환(실수)
		double n3 = Double.parseDouble("10.5");
		double n4 = Double.parseDouble("20.4");
		System.out.println(n3+n4);
		
		short n5 = Short.parseShort("5");
		short n6 = Short.parseShort("6");
		System.out.println(n5+n6);
		
		
		//----------------------------------------
		//숫자형 -> 문자형 반환
		//----------------------------------------
		
		int value1 = 10;
		double value2 = 3.14;
		
		System.out.println(value1 + value2);	//연산
		
//		String str1 = String.valueOf(value1);
//		String str2 = String.valueOf(value2);
		String str1 = value1+"";
		String str2 = value2+"";
		
		System.out.println(str1 + str2);		//문자열 붙이기
	}

}