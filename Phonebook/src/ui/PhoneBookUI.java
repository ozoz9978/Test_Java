package ui;
import java.util.Scanner;

import service.PhoneBookService;
import service.PhoneBookServiceImpl;
import vo.PhoneBook;
public class PhoneBookUI {
	Scanner keyin = new Scanner(System.in);
	PhoneBookService service = new PhoneBookServiceImpl() ;

	// 생성자
	public PhoneBookUI()  {
		String choice;
		while(true) {
			menu();	
			choice = keyin.next();

			switch(choice) {
			case "1" : insert(); break;
			case "2" : selectOne();break;
			case "3" : update();break;
			case "4" : delete();break;
			case "5" : SelectAll();break;
			case "0" : 
				System.out.println("## 프로그램을 종료합니다.");
				return;
			}
		}
	}

	private void insert() {
		System.out.println("\n<<전화번호부 등록>>");
		int age;
		String name, phoneNumber, relation;
		if (service.getCount() >= 50) {
			System.out.println("## 회원가입을 할 수 없습니다.");
			return;
		}

		System.out.print("# 전화번호 : ");
		phoneNumber = keyin.next();
		// 동일한 아이디 중복체크
		if (service.selectOne(phoneNumber) != null) {
			System.out.println("err> 중복된 번호가 있습니다.");
			return;
		}
		System.out.print("# 이름: ");
		name = keyin.next();

		System.out.print("# 나이: ");
		age = keyin.nextInt();

		System.out.print("# 나와의 관계: (친구, 동료, 학교 등)");
		relation = keyin.next();

		System.out.println("등록 하시겠습니까? (y/n)");
		String check = keyin.next();

		if (!(check.equals("Y") || check.equals("y"))) {
			System.out.println("## 등록이 중단되었습니다.");
			return;
		}
		PhoneBook phonebook = new PhoneBook(name,phoneNumber,age, relation); // 새롭게 생성된 @200번지
		boolean result = service.insert(phonebook);

		if(result == true) {
			System.out.println("## 등록이 완료되었습니다. \n");
		}else {
			System.out.println("## 등록을 실패했습니다. \n");
		}
	}

	private void selectOne() {
		System.out.println("\n<< 전화번호부 조회 >>");
		System.out.print("# 조회할 전화번호: ");
		String phoneNumber = keyin.next();

		PhoneBook phonebook = service.selectOne(phoneNumber);
		if (phonebook == null) {
			System.out.println("## 등록된 전화번호가 아닙니다. \n");
			return;
		}
		phonebook.output();
		System.out.println();
	}

	private void update() {
		System.out.println("\n<<전화번호부 수정>>");
		int age;
		String relation, check;
		System.out.print("# 조회 전화번호: ");
		String phoneNumber = keyin.next();

		PhoneBook phonebook = service.selectOne(phoneNumber);
		if (phonebook == null) {
			System.out.println("## 등록된 전화번호가 아닙니다. \n");
			return;}

		System.out.print(" > 나이 :");
		age = keyin.nextInt();
		System.out.print(" > 나와의 관계 :");
		relation = keyin.next();
		System.out.print(" ## 정말로 수정할까요(Y/N)?");
		check = keyin.next();

		if(!(check.equals("Y") || check.equals("y"))){
			System.out.println("## 수정작업이 취소되었습니다.\n");
			return;
		}
		boolean result = service.update(phonebook);

		if(result) {
			System.out.println("## 수정 완료 \n");
		}else {
			System.out.println("## 전화번호부 수정 실패");
		}
	}

	private void delete() {

		System.out.println("\n<<회원탈퇴>>");

		String check;
		System.out.println("# 전화번호 : ");
		String phoneNumber = keyin.next();

		PhoneBook phonebook = service.selectOne(phoneNumber);
		if (phonebook == null) {
			System.out.println("## 입력한 전화번호의 회원 정보가 없습니다. \n");
			return;
		}

		System.out.print(" ## 정말로 삭제할까요(Y/N)?");
		check = keyin.next();
		if(!(check.equals("Y") || check.equals("y"))){
			System.out.println("## 삭제가 취소되었습니다.\n");
			return;
		}
		boolean result = service.delete(phoneNumber);
		if(result) {
			System.out.println("## 삭제 완료 \n");
		}else {
			System.out.println("## 삭제 실패");
		}}

	private void SelectAll() {
		System.out.println("\n<< 전화번호부 전체 조회>>");
		int count = service.getCount();

		if(count == 0) {
			System.out.println("등록된 사람이 한 명도 없습니다");
			return;
		}
		PhoneBook[] list = service.selectAll();
		for (int i=0;i<count;++i) {
			PhoneBook phonebook = list [i];
			phonebook.output();

		}
	}

	// 생성자 끝
	private void menu() {
		System.out.println("=== [ 전화번호부 ] ===");
		System.out.println("     1) 저 장       ");
		System.out.println("     2) 조 회       ");
		System.out.println("     3) 수 정       ");
		System.out.println("     4) 삭 제       ");
		System.out.println("     5) 전체 조회       ");
		System.out.println("     0) 종 료       ");
		System.out.println("===================");
		System.out.print("     #  선택: ");
	}
}