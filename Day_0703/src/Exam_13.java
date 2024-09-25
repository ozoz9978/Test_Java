/*[ 문제 13 ] 정수를 입력받는다.
 * 그 정수가 홀수인지 짝수인지 판별하시오
 * 단 비트연산자를 사용할 것
 */

import java.util.Scanner;

public class Exam_13 {

	public static void main(String[] args) {
	Scanner keyin = new Scanner(System.in);
	int y = 1; // 0000 0001
	System.out.print("정수 1개를 입력해주세요: ");
	int number = keyin.nextInt();
	int z ;
	String result;
	int head;
	
	// 양수인지 음수인지 판별
	// z  = 0x80000000; 
	
	
	// & : 둘다 1일때만 1임 ( bit clear ) 
	z = number & y;
	result = (z == 1) ? "홀수입니다":"짝수입니다" ;
	System.out.println(result);
	

	
	keyin.close();
	}

}
