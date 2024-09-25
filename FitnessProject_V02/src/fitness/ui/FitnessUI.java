package fitness.ui;

import java.util.Scanner;

import fitness.service.FitnessService;
import fitness.vo.Fitness; // ctrl shift O

public class FitnessServiceImpl {
	//HAVE - A 관계
	Scanner keyin = new Scanner(System.in);
	FitnessService service = new FitnessService();

	// 생성자
	public void FitnessServiceImpl() {
		String choice;
		while(true) {
			menu();	
			choice = keyin.next();

			switch(choice) {
			case "1" : create(); break;
			case "2" : retrieve();break;
			case "3" : update();break;
			case "4" : delete();break;
			case "5" : retrieveAll();break;
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
		if (service.getCount() >= 5) {
			System.out.println("## 회원가입을 할 수 없습니다.");
			return;
		}

		System.out.print("# 아이디: ");
		id = keyin.nextInt();
// 동일한 아이디 중복체크
		if (service.selectOne(id) != null) {
			System.out.println("err> 중복된 아이디가 있습니다.");
			return;
		}
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
		Fitness fitness = new Fitness(id,name,gender, height, weight); // 새롭게 생성된 @200번지
		boolean result = service.insert(fitness);
		
		if(result == true) {
			System.out.println("## 가입이 완료되었습니다. \n");
		}else {
			System.out.println("## 회원가입이 실패되었습니다. \n");
		}
	}
		

		private void retrieve() {
			System.out.println("\n<< 회원 정보 조회 >>");
		    System.out.print("# 조회 아이디: ");
			int id = keyin.nextInt();
			
			Fitness fitness = service.selectOne(id);
		    if (fitness == null) {
				System.out.println("## 입력한 아이디의 회원 정보가 없습니다. \n");
				return;
			}
			fitness.output();
			System.out.println();
		}
		
		// 키와 몸무게만 수정가능,
		//아이디가 있는 사람만 수정가능 없으면 수정불가
		// 가입이 안되어 있으면 수정자체 불가

		private void update() {
			System.out.println("\n<<회원 정보 수정>>");
			double weight, height;
			String check;
			
			System.out.println("# 아이디 : ");
			int id = keyin.nextInt();
			
			Fitness fitness = service.selectOne(id);
			if(fitness == null) {
				System.out.println("## 입력한 아이디의 회원이 없습니다.");
				return;
			}
			
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
			boolean result = service.update(fitness);
			
			if(result) {
			System.out.println("## 수정 완료 \n");
			}else {
			System.out.println("## 정보 수정 실패");
			}}

		private void delete() {
			
			System.out.println("\n<<회원탈퇴>>");
			
			String check;
			System.out.println("# 아이디: ");
			int id = keyin.nextInt();
			
			Fitness fitness = service.selectOne(id);
		    if (fitness == null) {
				System.out.println("## 입력한 아이디의 회원 정보가 없습니다. \n");
				return;
			}

			System.out.print(" ## 정말로 탈퇴할까요(Y/N)?");
			check = keyin.next();
			if(!(check.equals("Y") || check.equals("y"))){
					System.out.println("## 탈퇴가 취소되었습니다.\n");
					return;
			}
			boolean result = service.delete(id);
					if(result) {
						System.out.println("## 탈퇴 완료 \n");
						}else {
						System.out.println("## 탈퇴 실패");
						}}

		private void retrieveAll() {
			System.out.println("\n<< 전체 회원 조회>>");
			int count = service.getCount();
			
			if(count == 0) {
				System.out.println("가입한 회원이 한 명도 없습니다");
				return;
			}
			Fitness[] list = service.selectAll();
			for (int i=0;i<count;++i) {
				Fitness fitness = list [i];
				fitness.output();
				
			}
		}

	// 생성자 끝
	private void menu() {
		System.out.println("=== [ 득근 FITNESS 회원관리 ] ===");
		System.out.println("     1) 저 장       ");
		System.out.println("     2) 조 회       ");
		System.out.println("     3) 수 정       ");
		System.out.println("     4) 삭 제       ");
		System.out.println("     5) 전체회원조회       ");
		System.out.println("     0) 종 료       ");
		System.out.println("===================");
		System.out.print("     #  선택: ");
	}


}

