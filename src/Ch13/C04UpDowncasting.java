package Ch13;

class Super{
	int n1;
	
}

class Sub extends Super{
	int n2;
}

public class C04UpDowncasting {
	
	public static void main(String[] args) {
		
		//NoCasting
		Super ob1 = new Super();
		ob1.n1 = 10;
		Sub ob2 = new Sub();
		ob2.n1 =  20;
		ob2.n2 = 20;
		
		//Upcasting
		//상위클래스형 참조변수 = 하위객체
		//자동형변환
		Super ob3 = new Sub();
		ob3.n1 = 10;
		
		//Downcasting
		//하위클래스형 참조변수 = 상위클래스형 객체
		//강제형변화
		Sub down = (Sub)ob3;
		down.n1 = 100;
		down.n2 = 200;

		
	}

}
