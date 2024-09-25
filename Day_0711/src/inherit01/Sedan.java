package inherit01;

public class Sedan extends Vehicle{
	private String trunk;

	public Sedan() {
		super();
	}

	public Sedan(String trunk) {
		super();
		this.trunk = trunk;
	}
	

	public Sedan(String trunk, int numberOfWheel, int numberOfSeat, double weight) {
		super(numberOfWheel, numberOfSeat, weight);
		this.trunk = trunk;
	}

	public String getTrunk() {
		return trunk;
	}

	public void setTrunk(String trunk) {
		this.trunk = trunk;
	}
	
	public void outputSedan() {
		this.output();
		System.out.println("Sedan=" + this.trunk);
	}
}
	
	
	

