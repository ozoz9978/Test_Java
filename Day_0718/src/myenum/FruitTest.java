package myenum;

public class FruitTest {
	public static void main(String[] args) {
		Fruit1 f1 = Fruit1.바나나; // enum 타입 ( static final 상수 )
		System.out.println(f1);
		System.out.println(f1.getData());
		System.out.println(Fruit1.딸기.getData());
		System.out.println(f1 + "(" + f1.getData()+")");
	
		//Reflection 을 이용하면 6라인 처럼 변수명을 조회할 수 있다.
		
		String f2 = Fruit2.STRAWBERRY;
		System.out.println(f2);
		
		
		
	}
}
