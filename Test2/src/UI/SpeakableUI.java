package UI;
import java.util.Scanner;

import Service.SpeakableService;
import Service.SpeakableServiceImpl;
import VO.Man;
import VO.Reader;
import VO.Worker;
	
	public class SpeakableUI {
	    Scanner keyin = new Scanner(System.in);
	    SpeakableService service = new SpeakableServiceImpl();
	    
	    public SpeakableUI() {
	        String choice;
	        int count = 0;
	        Man[] list = service.selectAll(); // 두 명의 Speaker를 저장할 배열

	        for (int i = 0; i < 2; ++i) {
	            menu();
	            choice = keyin.next();
	            System.out.print("이름을 입력하세요: ");
	            String name = keyin.next();

	            if (choice.equals("1")) {
	                Man man = new Reader(name);
	                service.insert(man);
	            } else {
	                Man man = new Worker(name);
	                service.insert(man);
	            }
	        }

	        System.out.println("두 명 Speaker의 등록이 완료되었습니다. 이제 Speaker 들의 speak 실행 결과입니다.");

	        for (int i = 0; i < service.getCount(); ++i) {
	            list[i].speak();
	        }
	    }

	    private void menu() {
	        System.out.println("\n어떤 Speaker를 등록하는지 선택하세요");
	        System.out.print(" 1. Reader 등록");
	        System.out.print(" 2. Worker 등록");
	    }
	}


