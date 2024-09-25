package vo;

//이름, 차번호, 전화번호, 예약위치
public class RentCar {
	private String name;
	private String carnumber;
	private String phone;
	private int location;

	public RentCar(){}

	public RentCar(String name, String carnumber, String phone, int location) {
		this.name = name;
		this.carnumber = carnumber;
		this.phone = phone;
		this.location = location;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCarnumber() {
		return carnumber;
	}

	public void setCarnumber(String carnumber) {
		this.carnumber = carnumber;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getLocation() {
		return location;
	}

	public void setLocation(int location) {
		this.location = location;
	}

	public void output() {
		System.out.printf("이름 : %s, 차량번호: %s, 전화번호: %s, 예약위치: %d %n",
				name, carnumber, phone, location); // %n 줄나눈기
	}

	
}
