package Ch11;


class C04Person{
	String name;
	int age;
	
	@Override
	public String toString() {
		return "C04Person [name=" + name + ", age=" + age + "]";
	}
	
	
}
public class C04ClassArrayMain {
	
	public static void main(String[] args) {
		
		C04Person list[] = new C04Person[3];
		list[0] = new C04Person();
		list[0].name = "강동원";
		list[0].age = 41;
		
		list[1] = new C04Person();
		list[1].name = "박서준";
		list[1].age = 35;
		
		list[2] = new C04Person();
		list[2].name = "이승우";
		list[2].age = 25;
		
		System.out.println(list[0]);
		System.out.println(list[1]);
		System.out.println(list[2]);
		
	}

}
