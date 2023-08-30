package Ch09;

class 라면Recipe{
	private void step1() {System.out.println("1 step");}
	private void step2() {System.out.println("2 step");}
	private void step3() {System.out.println("3 step");}
	private void step4() {System.out.println("4 step");}
	
	public void cooking() {
		step1();
		step2();
		step3();
		step4();
	}
}

class Cook{
	라면Recipe r = new 라면Recipe();
	
}

public class C03Capsulation {
	public static void main(String[] args) {
		Cook c = new Cook();
		c.r.cooking();
	}
}
