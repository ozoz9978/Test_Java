package inherit02;
// 다중상속을 할 수 없다
public class Child extends Parent {
	private int property;

	public Child() {
		super();
	}

	public Child(int property) {
		super();
		this.property = property;
	}

	public int getProperty() {
		return property;
	}

	public void setProperty(int property) {
		this.property = property;
	}
	
	// 일반메소드 -> ouput() 부모꺼 2개 , 내 earning 2개
	public int gather() {
		return this.property * 3;
	}
	
//	public void print() {
//		System.out.println("자식의 현재 자산: " + property + ", 자식이 증식한 자산:"+gather());
//	}
	public void output() {
		super.output();
		System.out.println("자식의 현재 자산: " + property + ", 자식이 증식한 자산:"+gather());
	}
}
