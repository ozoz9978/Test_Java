/*
 * [문제 -05 ] 이름, 국어, 영어, 수학 점수를 정수로 입력받아 합계와 평균을 구하여 출력하시오.
 * 평균은 소수점 이하 2자리까지 출력할 것 
 */

import java.util.Scanner;

public class Exam_05 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in); // import 해야함
	      // 변수를 선언하고 값을 지정
	      int korean, english, math;
	      String name; // 지역변수
	      
	      System.out.print("이름 입력: ");
	      name = keyin.next();
	      
	      System.out.print("국어 점수 입력: ");
	      korean = keyin.nextInt();
	      
	      System.out.print("영어 점수 입력: ");
	      english = keyin.nextInt();
	      
	      System.out.print("수학 점수 입력: ");
	      math = keyin.nextInt();
	      
	      int sum = korean + english + math;
	      //double avg = (korean + english + math) / 3.0 ; 이거나 아래로 해서 연산시 형을 맞춰줘야함  
	      double avg = (double)sum / 3;
	      // 출력
	      System.out.printf("합계는 "+sum+", "+ "평균은 %.2f입니다.%n",avg);
	      keyin.close();

	}

}
