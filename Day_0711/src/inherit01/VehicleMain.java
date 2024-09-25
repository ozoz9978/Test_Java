package inherit01;

public class VehicleMain {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle(4,4,500.5);
		vehicle.output();
		
//		Truck truck = new Truck(10);
//		truck.outputTruck();
//		truck.output();
//		
//		Truck truck2 = new Truck(15,6,8,15000);
//		truck2.outputTruck(); // 15
//	}
	
	// 버스객체 생성하기
	Bus bus = new Bus("365");
	bus.outputBus();
	
	Bus bus2 = new Bus("150", 4, 25, 200000);
	bus2.outputBus();
	
	// 세단객체 생성하기
	Sedan sedan = new Sedan("365");
	sedan.outputSedan();
		
	Sedan sedan2 = new Sedan("150", 4, 25, 200000);
	sedan2.outputSedan();
	
	
	
	
	
	
	
	
	
	
	
}
}
