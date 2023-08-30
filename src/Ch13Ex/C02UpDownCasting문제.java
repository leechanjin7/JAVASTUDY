package Ch13Ex;

class Employee{
	String name;
	String age;
	String addr;
	public Employee(String name, String age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
}
class Parttimer extends Employee{
	int hourpay;
	Parttimer(String name, String age, String addr, int hourpay) {
		super(name, age, addr);
		this.hourpay = hourpay;
	}
	@Override
	public String toString() {
		return "Parttimer [hourpay=" + hourpay + ", name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
	
	
}

class Regular extends Employee{
	int salary;

	Regular(String name, String age, String addr, int salary) {
		super(name, age, addr);
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Regular [salary=" + salary + ", name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
	
	
	
}

public class C02UpDownCasting문제 {
	public static void ShowInfo(Employee emp)
	{
		if(emp instanceof Regular) {
			Regular down = (Regular) emp;
			System.out.println(down.toString());
		}else if(emp instanceof Parttimer) {
			Parttimer down = (Parttimer) emp;
			System.out.println(down.toString());
		}
	}
	public static void main(String[] args) {
		Parttimer emp1 = new Parttimer("이찬진","31","서울",20000);
		Regular emp2 = new Regular("이찬진","33","서울",70000000);
		ShowInfo(emp1);
		System.out.println("-----------------------");
		ShowInfo(emp2);
		
	}

}
