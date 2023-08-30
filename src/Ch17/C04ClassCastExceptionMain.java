package Ch17;

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}

public class C04ClassCastExceptionMain {
	
	
	public static void changeDog(Animal animal) {
		
		try {
			
			Dog down = (Dog) animal;
		}catch(ClassCastException e) {
			System.out.println("Cast예외발생!");
		}
	}

	public static void main(String[] args) {
		
		Animal d = new Dog();
		
		Animal c = new Cat();
		
		changeDog(d);
		changeDog(c);


	}

}
