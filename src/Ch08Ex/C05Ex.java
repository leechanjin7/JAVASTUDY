package Ch08Ex;

class C05Simple{
	String type;
	int intSum;
	long intSub;
	long intMul;
	

	@Override
	public String toString() {
		return "C05Simple [type=" + type + ", intSum=" + intSum + ", intSub=" + intSub + ", intMul=" + intMul + "]";
	}



	public void sum(String type, int ...arg) {
		this.type = type;
		intSum = 0;
		for(int n : arg) {
			intSum += n;
		}
	}
	public void sub(String type, int ...arg) {
		this.type = type;
		intSub = 0;
		for(int n : arg) {
			intSub -= n;
		}
	}
	public void mul(String type, int ...arg) {
		this.type = type;
		intMul = 1L;
		for(int n : arg) {
			intMul *=(long) n;
		}
	}
	
	
}

public class C05Ex {

	public static void main(String[] args) {
		
		C05Simple s = new C05Simple();
		
		s.sum("모든Int합 : ", 10,20,30,40,50,60,70);
		System.out.println(s.toString());
		s.sub("모든Int차 : ", 100,20,30,40,50);
		
		System.out.println(s.toString());
		s.mul("모든Int곱 : ", 10,20,30,40,50,60,70);
		System.out.println(s.toString());

	}

}
