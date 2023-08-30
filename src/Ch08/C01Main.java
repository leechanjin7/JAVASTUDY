package Ch08;

public class C01Main {

	public static void main(String[] args) {
		
		C01Person h = new C01Person();
		h.name = "홍길동";
		h.age = 55;
		h.height = 177.5f;
		h.weight = 70.4;
		System.out.printf("%s %d %f %f\n", h.name,h.age,h.height,h.weight);

	}

}
