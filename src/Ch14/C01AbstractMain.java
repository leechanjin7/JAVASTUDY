package Ch14;

class Par1{
	void Func() {}
}

class Son1 extends Par1{
	void Func() {
		System.out.println("Son1에서 자율적으로 재정의한 Func() 호출 !!");
	}
}

abstract class Par2{
	abstract void Func();
}

class Son2 extends Par2{

	@Override
	void Func() {
		System.out.println("Son2에서 강제로 재정의한 Func() 호출!!");
	}
	
}

public class C01AbstractMain {

	public static void main(String[] args) {
		Par1 o1 = new Par1();
		Son1 o2 = new Son1();
		Par1 o3 = o2;
		o3.Func();
		
		Son2 o5 = new Son2();
		Par2 o6 = o5;
		o6.Func();
	}
}
