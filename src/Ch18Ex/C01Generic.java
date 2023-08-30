package Ch18Ex;

class 재료{
	
}

class 캬라멜 extends 재료{

	@Override
	public String toString() {
		return "캬라멜";
	}
}
class 버터옥수수 extends 재료{

	@Override
	public String toString() {
		return "버터옥수수";
	}
	
}

class 민초 extends 재료{

	@Override
	public String toString() {
		return "민초";
	}
	
}

class PopCorn<T extends 재료>{
	private T meterial;

	PopCorn(T meterial) {
		this.meterial = meterial;
	}
	public void ShowInfo() {
		System.out.println(meterial + "맛 팝콘");
	}
	
}

public class C01Generic {
	public static void main(String[] args) {
		
		PopCorn<캬라멜> o1 = new PopCorn<캬라멜>(new 캬라멜());
		o1.ShowInfo();
		
		PopCorn<버터옥수수> o2 = new PopCorn<버터옥수수>(new 버터옥수수());
		o2.ShowInfo();
		
		//민초는 제너릭으로 선택되지 않도록 합니다
		PopCorn<민초> o3 = new PopCorn<민초>(new 민초());
		o3.ShowInfo();
	}

}
