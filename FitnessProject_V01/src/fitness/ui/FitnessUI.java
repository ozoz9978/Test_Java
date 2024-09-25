package fitness.ui;

import java.util.Scanner;


import fitness.vo.Fitness; // ctrl shift O

public class FitnessUI {
	//HAVE - A 관계
	Scanner keyin = new Scanner(System.in);
	Fitness fitness = null;

	// 생성자
	public FitnessUI() {
		String choice;
		while(true) {
			menu();	
			choice = keyin.next();

			switch(choice) {
			case "1" : create(); break;
			case "2" : retrieve();break;
			case "3" : update();break;
			case "4" : delete();break;
			case "0" : 
				System.out.println("## 프로그램을 종료합니다.");
				return;
			}
		}
	}
	/* 회원가입
	 * 
	 */
	private void create() {
		System.out.println("\n<<회원가입>>");
		int id;
		String name, gender, check;
		double height, weight;

		if(fitness != null) {
			System.out.println("## 내부 사정으로 가입이 불가능합니다.");
		}

		System.out.print("# 아이디: ");
		id = keyin.nextInt();

		System.out.print("# 이름: ");
		name = keyin.next();

		System.out.print("# 성별 (남 / 여): ");
		gender = keyin.next();

		System.out.print("# 키(cm): ");
		height = keyin.nextDouble();

		System.out.print("# 몸무게(kg): ");
		weight = keyin.nextDouble();

		System.out.println("가입하시겠습니까? (y/n)");
		check = keyin.next();

		if (!(check.equals("Y") || check.equals("y"))) {
			System.out.println("## 가입이 중단되었습니다.");
			return;
		}
		fitness = new Fitness(id,name,gender, height, weight); // 새롭게 생성된 @200번지
		System.out.println("## 저장완료 \n");
	}


	private void retrieve() {
		System.out.println("\n<<정보조회>>");
		int id;
		if (fitness == null) {
			System.out.println("## 조회할 정보가 없습니다. \n");
			return;
		}
		fitness.output();
		System.out.println();
	}
	// 키와 몸무게만 수정가능,
	//아이디가 있는 사람만 수정가능 없으면 수정불가
	// 가입이 안되어 있으면 수정자체 불
	private void update() {
		System.out.println("\n<<정보조회>>");
		double weight, height;
		String check;
		
		int id = fitness.getId();
		if(fitness == null) {
			System.out.println("가입된 정보가 없습니다.");
			return;
		}
		System.out.println("아이디를 입력해주세요");
		id = keyin.nextInt();
		
		if (id!=fitness.getId()) {
			System.out.println("가입된 정보가 없습니다.");
			return;
		}
		
		fitness.output();
		
		System.out.print(" > 키 :");
		height = keyin.nextDouble();
		System.out.print(" > 몸무게 :");
		weight = keyin.nextDouble();
		System.out.print(" ## 정말로 수정할까요(Y/N)?");
		check = keyin.next();
		
		if(!(check.equals("Y") || check.equals("y"))){
			System.out.println("## 수정작업이 취소되었습니다.\n");
			return;
		}

		fitness.setWeight(weight);
		fitness.setHeight(height);
		
		System.out.println("## 수정 완료 \n");
	}

	private void delete() {
		
		System.out.println("\n<<회원탈퇴>>");
		
		String check;
		int id = fitness.getId();
		if(fitness == null) {
			System.out.println("탈퇴할 회원이 없습니다.");
			return;
		}
		System.out.println("아이디를 입력해주세요");
		id = keyin.nextInt();
		
		
		if (id==fitness.getId()) {
			System.out.print(" ## 정말로 탈퇴할까요(Y/N)?");
			check = keyin.next();
			if(!(check.equals("Y") || check.equals("y"))){
				System.out.println("## 탈퇴가 취소되었습니다.\n");}
			else {
					fitness = null;
					System.out.println("## 탈퇴 처리되었습니다.\n");
				}
				
				return;
			}
			System.out.println("존재하지 않는 아이디입니다");
			return;
		}

	// 생성자 끝
	private void menu() {
		System.out.println("=== [ 민근득근 FITNESS 회원관리 ] ===");
		System.out.println("     1) 저 장       ");
		System.out.println("     2) 조 회       ");
		System.out.println("     3) 수 정       ");
		System.out.println("     4) 삭 제       ");
		System.out.println("     0) 종 료       ");
		System.out.println("===================");
		System.out.print("     #  선택: ");
	}


}
