package ui;

import java.util.Scanner;

import service.RentCarService;
import vo.RentCar;
public class RentCarUI {
	//HAVE - A 관계
	Scanner keyin = new Scanner(System.in);
	RentCarService service = new RentCarService();

	// 생성자
	public RentCarUI() {
		String choice;
		while(true) {
			menu();	
			choice = keyin.next();

			switch(choice) {
			case "1" : create(); break;
			case "2" : retrieve();break;
			case "3" : retrieveAll();break;
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
		int location;
		String name, carnumber, phone, check;
		
		if (service.getCount() >= 5) {
			System.out.println("## 회원가입을 할 수 없습니다.");
			return;
		}
//차량번호: %s, 전화번호: %s, 예약위치: %d
		System.out.print("# 이름: ");
		name = keyin.next();

		System.out.print("# 차량번호: ");
		carnumber = keyin.next();

		System.out.print("# 전화번호: ");
		phone = keyin.next();

		System.out.print("# 예약위치 (1~100): ");
		location = keyin.nextInt();

		System.out.println("가입하시겠습니까? (y/n)");
		check = keyin.next();

		if (!(check.equals("Y") || check.equals("y"))) {
			System.out.println("## 가입이 중단되었습니다.");
			return;
		}
		RentCar rentcar = new RentCar(name, carnumber, phone, location); // 새롭게 생성된 @200번지
		boolean result = service.insert(rentcar);
		
		if(result == true) {
			System.out.println("## 가입이 완료되었습니다. \n");
		}else {
			System.out.println("## 회원가입이 실패되었습니다. \n");
		}
	}
		private void retrieve() {
			System.out.println("\n<< 회원 정보 조회 >>");
		    System.out.print("# 조회 차량번호: ");
		    String carnumber = keyin.next();
			
			RentCar rentcar = service.selectOne(carnumber);
		    if (rentcar == null) {
				System.out.println("## 입력한 차량번호의 회원 정보가 없습니다. \n");
				return;
			}
			rentcar.output();
			System.out.println();
		}

		private void retrieveAll() {
			System.out.println("\n<< 전체 회원 조회>>");
			int count = service.getCount();
			
			if(count == 0) {
				System.out.println("가입한 회원이 한 명도 없습니다");
				return;
			}
			RentCar[] list = service.selectAll();
			for (int i=0;i<count;++i) {
				RentCar rentcar = list [i];
				rentcar.output();
				
			}
		}

	// 생성자 끝
	private void menu() {
		System.out.println("=== [ 자동차 회원관리 ] ===");
		System.out.println("     1) 예 약       ");
		System.out.println("     2) 조 회       ");
		System.out.println("     3) 전체회원조회        ");
		System.out.println("     0) 종 료       ");
		System.out.println("===================");
		System.out.print("     #  선택: ");
	}


}

