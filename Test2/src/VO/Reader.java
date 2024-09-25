package VO;

public class Reader extends Man{
	public String name;

	
	
	public Reader() {
		super();
	}



	public Reader(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public void speak() {
		System.out.printf("%s 독자는 자바를 잘 하고 싶다!!%n",name);
	}
}
