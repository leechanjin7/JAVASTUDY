package Ch15;

interface Tire{
	void run();
}

class 한국타이어 implements Tire{

	@Override
	public void run() {
		System.out.println("한국타이어가 굴러갑니다.");
	}	
}
class 금호타이어 implements Tire{

	@Override
	public void run() {
		System.out.println("금호타이어가 굴러갑니다.");
	}
	
}

class Car{
	Tire FL;
	Tire FR;
	Tire BL;
	Tire BR;
	Car(){
		FL = new 한국타이어();	//upcasting
		FR = new 한국타이어();	//upcasting
		BL = new 한국타이어();	//upcasting
		BR = new 한국타이어();	//upcasting
	}
	void run() {
		FL.run();
		FR.run();
		BL.run();
		BR.run();
	}
	
}

public class C02InterfaceMain {

	public static void main(String[] args) {
		
		Car c = new Car();
		c.run();
		
		c.FR = new 금호타이어();
		System.out.println();
		c.run();
	}
}
