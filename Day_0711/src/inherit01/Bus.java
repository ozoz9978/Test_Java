package inherit01;

public class Bus extends Vehicle{
	private String busNumber;
	// 기본생성자, 초기화, 부모것포함 초기화 생성자
	//생성자

	public Bus() {
		super();
	}
	
	public Bus(String busNumber) {
		super();
		this.busNumber = busNumber;
	}
	
	public Bus(String busNumber,int numberOfWheel, int numberOfSeat, double weight) {
		super(numberOfWheel, numberOfSeat, weight);
		this.busNumber = busNumber;
	}

	public String getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}
	
	public void outputBus() {
		this.output();
		System.out.println("Bus=" + this.busNumber);
	}
	
	
}
