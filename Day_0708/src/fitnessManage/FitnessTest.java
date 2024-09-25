package fitnessManage;
import java.util.Scanner;
public class FitnessTest {
	static Scanner keyin = new Scanner(System.in);
	public static void main(String[] args) {
		
		FitnessVO fitness = null;
		String choice;
		
		while (true) {
			menu();
			choice = keyin.next();
			
			switch(choice) {
			case "1" : input(fitness); break;// call by reference 6개의 기본자료형 제외하면 다 ref
			case "2" : output(fitness); break;
			case "0" : 
				System.out.println("## 프로그램을 종료합니다. ##");
				System.exit(0);
			default:
			System.out.println("메뉴 선택을 다시해 주세요");
			}
			
		}
	}
	public static void menu() {
		System.out.println(" === [ Fitness 회원관리 ] === ");
		System.out.println(" === [ 1. 입력 ] === ");
		System.out.println(" === [ 2. 출력 ] === ");
		System.out.println(" === [ 0. 종료 ] === ");
		System.out.println(" ========================== ");
		System.out.println("            >> 선택          ");
	}
		
	
	
	public static void input(FitnessVO fitness) {
		fitness = new FitnessVO();
		String name, gender;
		double weight,height;
		
		System.out.println("**이름: ");
		name = keyin.next();
		
		System.out.println("**성별: ");
		gender = keyin.next();
		
		System.out.println("**키(cm): ");
		height = keyin.nextDouble();
		
		System.out.println("**몸무게(kg): ");
		weight = keyin.nextDouble();
		
		fitness.setName(name);
		fitness.setGen(gender);
		fitness.setHei(height);
		fitness.setWei(weight);
		System.out.println("회원가입처리함!");
		
	}
	public static void output(FitnessVO fitness) {
		if(fitness == null) {
			System.out.println("** 등록한 회원이 없습니다.");
			return;
		}
		System.out.println("이름 : " + fitness.getName());
		System.out.println("성별 : " + fitness.getGen());
		System.out.println("키(cm) : " + fitness.getHei());
		System.out.println("몸무게(kg) : " + fitness.getWei());
		
	}

}
