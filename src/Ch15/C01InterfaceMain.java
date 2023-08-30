package Ch15;

interface Remocon{
	void ON();
	void OFF();
	void ChangeChannel(int channel);
}

class TV implements Remocon{
	int channel;

	@Override
	public void ON() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void OFF() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void ChangeChannel(int channel) {
		System.out.println("TV채널 변경 : " + channel);
		this.channel = channel;
	}
	
	
}
interface Browser{
	void Searchable(String url);
}
class SmartTV extends TV implements Browser{

	@Override
	public void ON() {
		System.out.println("SmartTV를 켭니다");
	}
	@Override
	public void OFF() {
		System.out.println("SmartTV를 끕니다");
	}
	@Override
	public void ChangeChannel(int channel) {
		System.out.println("SmartTV채널 변경 " + channel);
		this.channel = channel;
	}



	@Override
	public void Searchable(String url) {
		System.out.println("브라우저에서 URL " + url + "접속요청합니다.");
	}
	
	
}

class Radio implements Remocon{
	int channel;

	@Override
	public void ON() {
		System.out.println("RADIO를 켭니다.");
	}

	@Override
	public void OFF() {
		System.out.println("RADIO를 끕니다.");
	}

	@Override
	public void ChangeChannel(int channel) {
		System.out.println("RADIO채널 변경 : " + channel);
		this.channel = channel;
	}
	
	
}

public class C01InterfaceMain {
	
	public static void TurnOn(Remocon controller) {
		controller.ON();
	}
	public static void TurnOff(Remocon controller) {
		controller.OFF();
	}
	public static void ChangeChannel(Remocon controller,int channel) {
		controller.ChangeChannel(channel);
	}
	public static void SearchBrowser(Browser browser, String url) {
		browser.Searchable(url);
	}
	
	public static void main(String[] args) {
		TV t = new TV();
		Radio r = new Radio();
		
		
//		TurnOn(t);
//		ChangeChannel(t,10);
//		TurnOn(r);
//		ChangeChannel(r,20);
//		TurnOff(t);
//		TurnOff(r);
		
		SmartTV t1 = new SmartTV();
		TurnOn(t1);
		
		ChangeChannel(t1,100);
		TurnOff(t1);
		SearchBrowser(t1,"www.naver.com");
		
	}



}
