package friend;
import java.util.Scanner;
// 오버로딩 생성자를 넣어서 일부 수정했으므로 실행하지 마시오!
public class FriendUI {
	//HAVE - A 관계
	Scanner keyin = new Scanner(System.in);
	FriendVO friend = new FriendVO();

	// 생성자
	public FriendUI() {
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
	private void delete() {
		String phone;
		int age;
		String name = friend.getName();
		phone = friend.getPhone();
		age = friend.getAge();
		System.out.print(" ## 정말로 삭제할까요(Y/N)?");
		String check = keyin.next();
		
		
		friend.setName(null); // friend 객체가 null 이면 nullpointerexception 발생 ( 아무것도 참조하지 않고있다는 것 )
		friend.setPhone(null);
		friend.setAge(0);
		System.out.println("정보가 삭제되었습니다.");
		
		if(!(check.equals("Y") || check.equals("y"))){
			System.out.println("## 삭제 작업이 취소되었씁니다.\n");
			return;
		}

		
	}
	/* 저장된 전화번호부의 전하번호와 나이를 수정
	 * 
	 * 
	 */
	private void update() {
		String phone, check;
		int age;
		
		String name = friend.getName();
		if(name == null) {
			System.out.println("저장된 정보가 없습니다.");
			return;
		}
		
		friend.output();
		
		System.out.print(" > 전화번호 :");
		phone = keyin.next();
		System.out.print(" > 나이 :");
		age = keyin.nextInt();
		System.out.print(" ## 정말로 수정할까요(Y/N)?");
		check = keyin.next();
		
		if(!(check.equals("Y") || check.equals("y"))){
			System.out.println("## 수정작업이 취소되었씁니다.\n");
			return;
		}

		friend.setPhone(phone);
		friend.setAge(age);
		
		System.out.println("## 수정 완료 \n");
	}
		
	/* 저장된 전화번호부의 데이터를 출력
	 * 
	 */
	private void retrieve() {
		String name = friend.getName();
		if(name == null) {
			System.out.println("저장된 정보가 없습니다.");
			return;
		}
		friend.output();
	}
	/*
	 * 한 사람의 정보를 입력받아 대입하는 메소드
	 */
	private void create() {
		// 지역변수 선언
		String name, phone;
		int age;
		System.out.print(" > 이름 :");
		name = keyin.next();
		System.out.print(" > 전화번호 :");
		phone = keyin.next();
		System.out.print(" > 나이 :");
		age = keyin.nextInt();
		
		friend = new FriendVO(name,phone, age); // 새롭게 생성된 @200번지
		
		System.out.println("## 저장완료 \n");
		
	}
	/* 메뉴를 화면에 출력
	 * c(create) r(retrieve) u (update) d (delete)
	 * 
	 * 
	 */
	private void menu() {
		System.out.println("=== [ 전화번호부 ] ===");
		System.out.println("     1) 저 장       ");
		System.out.println("     2) 조 회       ");
		System.out.println("     3) 수 정       ");
		System.out.println("     4) 삭 제       ");
		System.out.println("     0) 종 료       ");
		System.out.println("===================");
		System.out.print("     #  선택: ");
	}

}
