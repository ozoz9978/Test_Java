package Exam;

import Exam.Chicken;
import Exam.FriedChicken;
import Exam.SeasonedChicken;

//다형성
// 상속
public class ChickenTest {

	public static void main(String[] args) {
		
		Chicken chicken;
		chicken = new FriedChicken();
		process(chicken);
		chicken = new SeasonedChicken();
		process(chicken);
		
	}
	public static void process (Chicken chicken) {
		// 부모의 추상메소드가 아닌경우 다형성 처리가 어렵다
		if(chicken instanceof FriedChicken)
			chicken.setTaste("후라이드");
		else if (chicken instanceof SeasonedChicken)
			chicken.setTaste("양념치킨");
		chicken.output();
		
		// cry 메소드는 추상메소드라서 다형성 처리가 된다
		chicken.cook();
		System.out.println();
	}

}