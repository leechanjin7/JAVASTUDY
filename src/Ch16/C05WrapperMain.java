package Ch16;

public class C05WrapperMain {

	public static void main(String[] args) {
		
		//Boxing(기본자료형 -> wrapper Class)
		Integer o1 = new Integer(100);
		Integer o2 = new Integer("100");
		Integer o3 = Integer.valueOf("300");
		System.out.println(o1+o2+o3);
		
		//UnBoxing
		int n1 = o1.intValue();
		int n2 = o2.intValue();
		int n3 = o3.intValue();
		
		System.out.println(n1+n2+n3);
		
		//자동 Boxing
		Integer n4 = 100;
		int n5 = n4 + 200;

	}

}
