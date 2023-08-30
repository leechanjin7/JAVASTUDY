package Ch13;

//상속
//상위(부모,슈퍼)클래스의 속성과 기능을 하위(자식,서브)클래스에서 그대로 받아 사용할 수있도록 허용한 문법
//상속받은 하위를래스는 상위클래스의 속성과 기능 이외의 멤버를 추가할 수 있다.
//extends 예약어를 사용한다.

//상속 사용이유
//1 확장성
//2 유지보수
//3 가독성

class Parent{
	int x;
	int y;
	Parent(){
		System.out.println("Parent() 생성자 호출!");
	}
	Parent(int x){
		this.x = x;
		System.out.println("Parent(int x) 생성자 호출!");
	}
	Parent(int x,int y){
		this.x = x;
		this.y = y;
		System.out.println("Parent(int x, int y) 생성자 호출!");
	}
}
class Son extends Parent{
	int z;
	Son(){
		super();
		System.out.println("Son() 생성자 호출!");
	}
	Son(int x){
		super(x);
		System.out.println("Son(int x) 생성자 호출!");
	}
	Son(int x, int y){
		super(x,y);
		System.out.println("Son(int x, int y) 생성자 호출!");
	}
	Son(int x, int y, int z){
		super(x,y);
		this.z = z;
	}
	
	@Override
	public String toString() {
		return "Son [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
	
	
	
}


public class C02InheritanceMain {

	public static void main(String[] args) {
		
		Son ob = new Son();
		Son ob1 = new Son(10);
		System.out.println(ob.toString());
		System.out.println(ob1.toString());
		Son ob2 = new Son(10,20);
		Son ob3 = new Son(10,20,30);
		System.out.println(ob2.toString());
		System.out.println(ob3.toString());

	}

}
