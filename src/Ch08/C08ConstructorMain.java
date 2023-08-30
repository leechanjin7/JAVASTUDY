package Ch08;

//생성자 함수(메서드)
//객체 생성시에 하넌 호출되는 특수한 메서드
//객체 생성시에 1회 호출
//객체 생성시 필요한 초기값을 부여
//생성자 함수는 클래스이름과 동이랗며 반환자료형을 가지지 않는다.
//생성자 함수를 명시하지 않을때 기본적으로 컴파일러에 의해 주입되는 생성자가 있는데 이를 디폴트 생성자라고 한다.
//컴파일러에 의해 주입받는 디폴트 생성자는 모든 멤버의 초기값을 0(or false or null)로 지정한다.

class C08Simple{
	int m1;
	double m2;
	boolean m3;
	String m4;
	
	//디폴트 생성자
	C08Simple(){
		this.m1 = 10;
		this.m2 = 20.2;
		this.m3 = true;
		this.m4 = "이찬진";
	}
	C08Simple(int x){
		System.out.println("C08Simple(int x) 생성자 호출!");
		this.m1 = x;
	}
	C08Simple(int ...x){
		System.out.println("C08Simple(int ...x) 생성자 호출!");
		for(int arg : x) {
			this.m1 = arg;
		}
	}
	@Override
	public String toString() {
		return "C08Simple [m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + ", m4=" + m4 + "]";
	}
	
	
	
}


public class C08ConstructorMain {

	public static void main(String[] args) {
		
		C08Simple sp = new C08Simple();
		System.out.println(sp.toString());
		
		C08Simple sp2 = new C08Simple(20);
		System.out.println(sp2.toString());
		
		C08Simple sp3 = new C08Simple(10,20,30,100,40,50,60,70,10015);
		System.out.println(sp3.toString());
		

	}

}
