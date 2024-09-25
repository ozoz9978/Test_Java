package inherit01;
// public, protected 멤버만 상속
// private은 상속되지 않음, 생성자도 상속이 안됨
//단 상속받은 public 메소드만 setter, getter를 통해 부모의 private한 멤버에 접근가능
public class Truck extends Vehicle {
	private int maxLoad;
	
	public Truck() {
		super(); // 부모의 기본생성자를 호출해서 부모부터 생성
	}
	
	public Truck(int maxLoad) {
		super();
		this.maxLoad = maxLoad;
	}
	
	public Truck(int maxLoad, int numberOfWheel, int numberOfSeat, double weight) {
		super(numberOfWheel, numberOfSeat, weight);
		this.maxLoad = maxLoad;
	}
	//setter, getter, output()
	// 부모에 포함되지 않은 것 내껏
	public int getMaxLoad() {
		return maxLoad;
	}

	public void setMaxLoad(int maxLoad) {
		this.maxLoad = maxLoad;
	}
	public void outputTruck() {
		this.output();
		System.out.println("Truck=" + maxLoad);
	}
	
}

