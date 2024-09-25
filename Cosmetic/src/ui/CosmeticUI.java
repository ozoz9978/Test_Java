// 조민근
package ui;
import java.util.Scanner;

import service.CosmeticService;
import service.CosmeticServiceImpl;
import vo.Foundation;
import vo.Lipstick;
import vo.Product;


public class CosmeticUI {
	Scanner keyin = new Scanner(System.in);
	CosmeticService service = new CosmeticServiceImpl();
	
	public CosmeticUI() {
		String choice;
		while(true) {
			menu();	
			choice = keyin.next();

			switch(choice) {
			case "1" : create(); break;
			case "5" : retrieveAll();break;
			case "0" : 
				System.out.println("## 프로그램을 종료합니다.");
				return;
			}
		}
	}

    private void create() {
        
        System.out.print("# 1. Reader 등록 %n 2. Worker 등록");
        String cc = keyin.next();
        
        System.out.print("이름을 입력하세요.");
        String name = keyin.next();
        
        Man man;
        if (cc.equals("1")) {
            man = new Reader(name);
        } else {
        	man = new Worker(name);
            
        }

        boolean result = service.insert(man);

        if (result) {
            System.out.println("## 등록이 완료되었습니다. \n");
        } else {
            System.out.println("## 이미 등록된 이름입니다. \n");
        }	
    }
	

		private void retrieveAll() {
			int count = service.getCount();
			
			Man[] list = service.selectAll();
			for (int i=0;i<count;++i) {
				Man man = list [i];
				man.output();
				
			}
		}

	// 생성자 끝
	private void menu() {
		System.out.println("\n어떤 Speaker를 등록하는지 선택하세요");
		System.out.print("# 1. Reader 등록 %n 2. Worker 등록");
       
    }
}
