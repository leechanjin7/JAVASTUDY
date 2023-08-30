package Ch08Ex;

class Computer{
	String SerialNo;
	String CPUSpec;
	String RAMSpec;
	String DISKSpec;
	
	public void PowerON(){
		System.out.println(SerialNo + " 의 전원을 켭니다!");
	}
	public void PowerOFF() {
		System.out.println(SerialNo + " 의 전원을 끕니다!");
	}
	public void ShowInfo() {
		System.out.println("SerialNo : " + SerialNo);
		System.out.println("CPUSpec : " + CPUSpec);
		System.out.println("RAMSpec : " + RAMSpec);
		System.out.println("DISKSpec : " + DISKSpec);
	}
}


public class C03ComputerMain {

	public static void main(String[] args) {
		
		Computer c = new Computer();
		c.SerialNo = "1010";
		c.CPUSpec = "I7";
		c.RAMSpec = "16G";
		c.DISKSpec = "2TB";
		c.PowerON();
		c.PowerOFF();
		c.ShowInfo();
		

	}

}
