package Ch10Ex;

class Buyer{
	private int MyMoney;
	private int AppleCnt;
	
	public Buyer(int mm, int ac) {
		MyMoney = mm;
		AppleCnt = ac;
	}
	
	public void payment(Seller seller, int mm) {
		MyMoney = MyMoney - mm;
		int cnt = seller.Receive(mm);
		AppleCnt = AppleCnt + cnt;
	}
	
	public void showInfo() {
		System.out.println("-------구매자정보--------");
		System.out.println("보유 금액 : " + MyMoney);
		System.out.println("보유 사과 개수 : " + AppleCnt);
	}
}
class Seller{
	private int MyMoney;
	private int AppleCnt;
	public int Price;
	
	public Seller(int mm, int ac, int p) {
		MyMoney = mm;
		AppleCnt = ac;
		Price = p;
	}

	public int Receive(int mm) {
		
		MyMoney = MyMoney + mm;
		int revcnt = mm/Price;
		AppleCnt = AppleCnt - revcnt;
		
		return revcnt;
	}
	public void ShowInfo() {
		System.out.println("--------판매자정보---------");
		System.out.println("보유 금액 : " + MyMoney);
		System.out.println("보유 사과 개수 : " + AppleCnt);
		System.out.println("개당 가격 : "+ Price);
	}
	
}

public class ExMain {

	public static void main(String[] args) {
		Seller 사과장수1 = new Seller(100000,100,100);
		Buyer 홍길동 = new Buyer(10000,0);
		홍길동.payment(사과장수1, 2000);
		사과장수1.ShowInfo();
		홍길동.showInfo();
	}
}
