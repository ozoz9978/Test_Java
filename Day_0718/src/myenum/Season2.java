package myenum;

public enum Season2 {
	봄("Spring", "ss", 1000), 여름("Summer", "mm", 2000),
	가을("Fall", "ff", 3000), 겨울("Winter", "ww", 4000);

	private String data;
	private String temp;
	private Integer money;
	
	Season2(String data, String temp, Integer money) { // public은 필요하지 않음 (접근지정자 사용 불가능)
		this.data = data;
		this.temp = temp;
		this.money = money;
		System.out.println("Enum 데이터: " + this);
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getTemp() {
		return temp;
	}

	public void setTemp(String temp) {
		this.temp = temp;
	}

	public Integer getMoney() {
		return money;
	}

	public void setMoney(Integer money) {
		this.money = money;
	}

}
