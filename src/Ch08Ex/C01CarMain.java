package Ch08Ex;

class C01Car{
	String owner;
	int speed;
	int fuel;
	
	
	@Override
	public String toString() {
		return "C01Car [owner=" + owner + ", speed=" + speed + ", fuel=" + fuel + "]";
	}
	
	
	
}

public class C01CarMain {

	public static void main(String[] args) {
		//다음 main함수의 코드가 실행될 수 있도록 C01Car 클래스를 만드세요
		C01Car c = new C01Car();
		c.owner = "이찬진";
		c.speed = 120;
		c.fuel = 80;
		System.out.println(c.toString());
	}

}
