/*
 * 양수인지 음수인지 0인지 판별
 */

import java.util.Scanner;

public class OperaterTest_02 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in); // import 해야함
	    System.out.print("하나의 정수를 입력하세요: ");
	    int number = keyin.nextInt();
	    if (number == 0) {
	    	System.out.println("0입니다");
	    }else if (number < 0){
	    	System.out.println("음수입니다");
	    }else {
	    	System.out.println("양수입니다");
	    }
	}

}
