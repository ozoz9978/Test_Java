package vo;

public class PhoneBook {
	private String phoneNumber;
	private String name;
	private String relation;
	private int age; // 친구, 동료, 학교 등 나와의 관계
	
	
	public PhoneBook() {}
	
	public PhoneBook(String name, String phoneNumber, int age, String relation) {
		super();
		this.phoneNumber = phoneNumber;
		this.name = name;
		this.relation = relation;
		this.age = age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override // 더하기 연산이 많을때 stringbuffer 만들어서 사용하는게 좋다
	public String toString() {
		
		StringBuffer buf= new StringBuffer(50);
		buf.append("phoneNumber=").append(phoneNumber).append(", name=").append(", relation=").append(relation).append(", age=").append(age);
		return buf.toString();
		
		//return "PhoneBook [phoneNumber=" + phoneNumber + ", name=" + name + ", relation=" + relation + ", age=" + age
		//		+ "]";
		
	
		
	}

}
