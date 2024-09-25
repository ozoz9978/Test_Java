/*
 * [문제 -06 ] 정수로 입력받아 짝수인지 홀수인지 판별해서 출력하시오. 
 */

import java.util.Scanner;

public class Exam_06 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in); // import 해야함
	      String type; // 지역변수
	      System.out.print("하나의 정수를 입력하세요: ");
	      int number = keyin.nextInt();
	      if (number %2 == 0) {
	    	  type = "짝수";
	      }else {
	    	  type = "홀수";
	      }
	      
	      // 출력
	      System.out.printf("입력한 정수는 "+type+"입니다.%n");
	      keyin.close();

	}

}
