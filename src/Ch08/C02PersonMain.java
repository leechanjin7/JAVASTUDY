package Ch08;


class C02Person{
	String name;
	int age;
	float height;
	double weight;
}

public class C02PersonMain {
	
	public static void main(String[] args) {
		
		C02Person h = new C02Person();
		h.name = "홍길동";
		h.age = 55;
		h.height = 177.5f;
		h.weight = 70.4;
		System.out.printf("%s %d %f %f\n", h.name,h.age,h.height,h.weight);
	}

}
