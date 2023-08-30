package Ch18;

class 재료{
	
}

class 팥 extends 재료{
	String meterial;

	public 팥(String m) {
		this.meterial = m;
	}

	@Override
	public String toString() {
		return "팥 [meterial=" + meterial + "]";
	}

}

class 야채 extends 재료{
	String meterial;

	public 야채(String m) {
		this.meterial = m;
	}

	@Override
	public String toString() {
		return "야채 [meterial=" + meterial + "]";
	}

}
class 피자 extends 재료{
	String meterial;

	public 피자(String m) {
		this.meterial = m;
	}

	@Override
	public String toString() {
		return "피자 [meterial=" + meterial + "]";
	}

}

class 민초{
	String meterial;

	public 민초(String m) {
		this.meterial = m;
	}

	@Override
	public String toString() {
		return "민초 [meterial=" + meterial + "]";
	}
}

class 호빵<T extends 재료>{	//T extends 재료 : 제너릭타입에 들어올 자료형은 재료의 하위클래스만
	
	private T meterial;

	public 호빵(T meterial) {
	
		this.meterial = meterial;
	}
	void ShowInfo() {
		System.out.println(meterial.toString()+" 으로 만든 호빵!");
	}
	
}

public class C01GenericMain {
	
	public static void main(String[] args) {
		
		호빵<팥> o1 = new 호빵<팥>(new 팥("단팥"));
		o1.ShowInfo();
		
		호빵<피자> o2 = new 호빵<피자>(new 피자("불고기맛"));
		o2.ShowInfo();
		
		호빵<야채> o3 = new 호빵<야채>(new 야채("부추가많이 들어간"));
		o3.ShowInfo();
	}

}
