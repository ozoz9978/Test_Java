package inherit02;

public class Parent extends Object {
	private int money;
	
	// 모든 클래스의 부모 object
	// 생성자
	public Parent() {
		super(); 
	}

	public Parent(int money) {
		super();
		this.money = money;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	public int earning() {
		return this.money*2;
		
	}
	public void output() {
		System.out.println("부모의 현재 자산: " + money+", 투자수익: "+this.earning());
	}
}
