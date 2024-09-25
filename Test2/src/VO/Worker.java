package VO;

public class Worker extends Man {
	
	public String name;

	public Worker() {
		super();
	}

	public Worker(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public void speak() {
		System.out.printf("%s 일꾼은 자기가 맡은 일을 열심히 한다!!%n",name);
	}
	

}
