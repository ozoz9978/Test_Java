package Bank;

import java.util.Scanner;
public class BankAccountTest {
	static Scanner keyin = new Scanner (System.in);
	public static void main(String[] args) {
		BankAccountVO bank = new BankAccountVO();
		String choice;
		
		while(true) {
			menu();
			choice = keyin.next();
			switch(choice) {
			case "1" : input(bank); break;
			case "2" : output(bank); break;
			case "0" : 
				System.out.println("## 프로그램 종료합니다. ##");
				System.exit(0);
			default:
				System.out.println("## 메뉴선택오류 ##");
			}
		}
	}
	public static void menu() {
		System.out.println(" === [ DIMA 은행 입출금 ] === ");
		System.out.println(" === [ 1. 입금 ] === ");
		System.out.println(" === [ 2. 출금 ] === ");
		System.out.println(" === [ 0. 종료 ] === ");
		System.out.println(" ========================== ");
		System.out.println("            >> 선택          ");
	}
	
	public static void input(BankAccountVO bank) {
		String accountNo;
		int money;
		
		System.out.println("> 계좌번호: ");
		accountNo = keyin.next();
		
		System.out.println("> 입금액: ");
		money = keyin.nextInt();
		
		bank.setAccountNo(accountNo);
		bank.deposit(money);	
	}
	
	public static void output(BankAccountVO bank) {
		String accountNo;
		int money;
		
		System.out.println("> 계좌번호: ");
		accountNo = keyin.next();
		
		System.out.println("> 출금액: ");
		money = keyin.nextInt();
		
		int myMoney = bank.withdraw(money);
		if (myMoney == -1) {
			System.out.println("##잔고부족!");
			return;	
		}
		System.out.printf("%s 계좌에서 %d원 출금하고 %d원이 남았습니다.",
				bank.getAccountNo(), myMoney, bank.getBalance());
	}
	
	
}
