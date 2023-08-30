package Ch17;

public class C03NumberFormatExceptionMain {

	public static void main(String[] args) {
		
		String d1 = "100";
		String d2 = "200";
		int value1 = 0;
		int value2 = 0;
		try {
			value1 = Integer.parseInt(d1);
			value2 = Integer.parseInt(d2);
		}catch(NumberFormatException e) {
			System.out.println("예외발생시 실행코드");
		}finally {
			System.out.println("예의발생과는 상관없이 무조건 실행코드");
		}

		int result = value1 + value2;
		System.out.println(d1 + "+" + d2 + "=" + result);
	}

}
