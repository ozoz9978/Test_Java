package friend;

public class FriendVO {
	// 멤버필드
	private String name;
	private String phone;
	private int age;
	
	// 기본생성자
//	public FriendVO() {}
//	public FriendVO(String name, String phone, int age) {
//		this.name=name;
//		this.phone=phone;
//		this.age=age;
//	}
	//source constructor using field 전달인자 몇개 deselect all, select all
	public FriendVO() {
	}
	// 오버로딩 생성자
	public FriendVO(String name, String phone, int age) {
		super();
		this.name = name;
		this.phone = phone;
		this.age = age;
	}
	// 기본 초기값을 설정하고 싶을때 default 값
//	public FriendVO() {
//		this.name="김갑돌";
//		this.phone="010-0000-0000";
//		this.age=75;
//	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//일반 메소드
	public void output() {
		System.out.printf("%3s %15s %3d%n", name, phone, age);
	}
	
}
