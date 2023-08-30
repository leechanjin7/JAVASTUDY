package Ch08;

import java.util.Scanner;

class C03Person{
	String name;
	int age;
	float height;
	double weight;
	
	void talk() {
		System.out.println(name + " 님이 말합니다.");
	}
	void walk() {
		System.out.println(name + " 님이 걷습니다.");
	}
	void showInfo() {
		System.out.printf("%s %d %f %f\n", name,age,height,weight);
	}
}

public class C03PersonMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		C03Person h = new C03Person();
		h.name = sc.next();
		h.age = sc.nextInt();
		h.height = sc.nextFloat();
		h.weight = sc.nextDouble();
		System.out.printf("%s %d %f %f\n", h.name,h.age,h.height,h.weight);
		h.talk();
		h.walk();
		h.showInfo();
	}
}
