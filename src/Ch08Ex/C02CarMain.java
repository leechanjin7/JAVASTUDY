package Ch08Ex;

class C02Car{
	String owner;
	int speed;
	int fuel;
	
	public void Accel() {
		speed += 5;
		System.out.println(owner + "님이 현재속도 "+speed+"에서("+(speed+5)+")로 가속합니다.");
	}
	public void Break() {
		speed -= 5;
		System.out.println(owner + "님이 현재속도 "+speed+"에서("+(speed-5)+")로 감속합니다.");
		
	}
	public void ShowInfo() {
		System.out.println("차주 : " + owner);
		System.out.println("현재 속도 :" + speed);
		System.out.println("연료량 : "+ fuel);
	}
	
}



public class C02CarMain {

	public static void main(String[] args) {
		
		C02Car c = new C02Car();
		c.owner = "이찬진";
		c.speed = 100;
		c.fuel = 80;
		c.Accel();		//owner + 님이 현재속도 + speed +에서 (speed+5)로 가속합니다가 출력
		c.Break();		//owner + 님이 현재속도 + speed +에서 (speed-5)로 감속합니다가 출력
		c.ShowInfo();	//owner, speed, fuel이 출력
		
	}

}
