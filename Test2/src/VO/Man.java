package VO;

public class Man {
	
	private String name;
	
	public Man() {
	
	}
	
	
	public Man(String name) {
		super();
		this.name = name;
	}

	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	public void speak() {
		System.out.printf("%s",name);
	}

}
