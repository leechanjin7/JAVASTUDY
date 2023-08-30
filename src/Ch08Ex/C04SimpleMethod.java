package Ch08Ex;

class Sub{
	int sub1(int x, int y) {
		return x-y;
	}
	int sub2(int x, int y) {
		if(x>y) {
			return x-y;
		}
		return y-x;
	}
	int sub3(int x, int y, int z) {
		if(x>=y && y>=z) {	//n1이 제일큼
			return x-y-z;
		}else if(x>=y && y>=z) {	//n2가 제일큼
			return y-x-z;
		}
		return z-x-y;
	}
}
class Mul{
	
}

public class C04SimpleMethod {

	public static void main(String[] args) {
		Sub sc = new Sub();
		Mul mc = new Mul();
		
		int r1 = sc.sub1(200,100);
		int r2 = sc.sub2(120,300);
		int r3 = sc.sub3(200, 100, 500);
		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);
		System.out.println("r3 : " + r3);
		
	}
}
