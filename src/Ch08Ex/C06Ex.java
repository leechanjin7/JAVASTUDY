package Ch08Ex;

class C06Computer {
    String SerialNo;
    String CPUSpec;
    String RAMSpec;
    String DISKSpec;

    public C06Computer(String serialNo, String cpuSpec, String ramSpec, String diskSpec) {
        SerialNo = serialNo;
        CPUSpec = cpuSpec;
        RAMSpec = ramSpec;
        DISKSpec = diskSpec;
    }

    public void PowerON() {
        System.out.println(SerialNo + "의 전원을 켭니다.");
    }

    public void PowerOFF() {
        System.out.println(SerialNo + "의 전원을 끕니다.");
    }

    public void ShowInfo() {
        System.out.println("Serial No: " + SerialNo);
        System.out.println("CPU Spec: " + CPUSpec);
        System.out.println("RAM Spec: " + RAMSpec);
        System.out.println("DISK Spec: " + DISKSpec);
    }
}

public class C06Ex {

	public static void main(String[] args) {
		C06Computer LGGram1010 = new C06Computer("1010", "I7", "16G", "2TB");
		LGGram1010.PowerON();
		LGGram1010.ShowInfo();
		LGGram1010.PowerOFF();

	}

}