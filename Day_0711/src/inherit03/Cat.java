package inherit03;
// 부모클래스가 추상클래스면 자식도 추상클래스가 된다.
// concreate 클래스가 되려면 상속받은 추상 메소드를 반드시 오버라이드 해야한다.!!
public class Cat extends Animal{
	
	@Override
	public void cry() {
		System.out.println("냐옹냐옹");
	}
}
