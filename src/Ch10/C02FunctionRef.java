package Ch10;

class TV{
	BasicController bc;
	ExtraController ec;
	TV(){
		bc = new BasicController();
		ec = new ExtraController();
	}
	void TvInfo() {
		bc.showinfo();
	}
}
class BasicController{
	ONOFF onoff;
	Channel channel;
	Volumn volumn;
	
	
	void setOnoff(ONOFF onoff) {
		this.onoff = onoff;
	}
	void setChannel(Channel channel) {
		this.channel = channel;
	}
	void setVolumn(Volumn volumn) {
		this.volumn = volumn;
	}
	void showinfo() {
		System.out.println("현재 ONOFF : " + onoff.isOn);
		System.out.println("현재 Channel : " + channel.curChannel);
		System.out.println("현재 Volumn : " + volumn.curVolumn);
	}
	
}

class ONOFF{
	boolean isOn;
	void ON() {
		System.out.println("POWER ON");
		isOn = true;
		
	}
	void OFF() {
		System.out.println("POWER OFF");
		isOn = false;
	}
}
class Channel{
	int curChannel;
	void setChannel(int channel) {
		curChannel = channel;
	}
}
class Volumn{
	int curVolumn;
	void setVolumn(int volumn) {
		curVolumn = volumn;
	}
}
class ExtraController{}





public class C02FunctionRef {

	public static void main(String[] args) {

		TV t1 = new TV();
		t1.bc.setOnoff(new ONOFF());
		t1.bc.setChannel(new Channel());
		t1.bc.setVolumn(new Volumn());
		t1.TvInfo();
		
		t1.bc.onoff.ON();
		t1.bc.channel.setChannel(21);
		t1.bc.volumn.setVolumn(15);
		t1.TvInfo();
	}

}
