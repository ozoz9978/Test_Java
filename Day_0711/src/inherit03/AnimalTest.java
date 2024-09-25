package inherit03;

public class AnimalTest {

	public static void main(String[] args) {
		//Animal animal = new Animal(); 객체 생성 불가
		Dog dog = new Dog();
		dog.setType("포유류");
		dog.output();
		dog.cry(); // 멍멍
		
		Bird bird = new Bird();
		bird.setType("조류");
		bird.output();
		bird.cry(); // 짹짹
		
		Cat cat = new Cat();
		cat.setType("포유류");
		cat.output();
		cat.cry(); // 야옹야옹
	}

}
