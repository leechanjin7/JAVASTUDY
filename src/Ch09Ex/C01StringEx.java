package Ch09Ex;

class Profile{
	private String name;
	private String addr;
	private String job;
	private String major;
	
	public Profile() {}
	public Profile(String name, String addr, String job, String major) {
		super();
		this.name = name;
		this.addr = addr;
		this.job = job;
		this.major = major;
	}
	
	
	//toString정
	@Override
	public String toString() {
		return "Profile [name=" + name + ", addr=" + addr + ", job=" + job + ", major=" + major + "]";
	}
	
	
	//Getter and Setter 정의
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	
	
}




public class C01StringEx {

	public static void main(String[] args) {
		Profile p = new Profile("이찬진","대구","프로그래머","경제");
		System.out.println(p.toString());

	}

}
