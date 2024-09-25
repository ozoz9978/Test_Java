package myexception;

import java.util.InputMismatchException;
import java.util.Scanner;

/* [문제- 31] 정수 5개를 입력받아 총 합계를 구하는 프로그램을 작성하시오.
 * 값 1 => 5
 * 합계 => 5
 * 
 * 값 2 => k
 * 값 2=>
*/



public class Exam_31 {

	public static void main(String[] args) {
		int result = 0,num = 0;
		int count = 1;
		while(true) {
			
			System.out.println(count + "번째 정수를 입력해 주세요: ");
			Scanner keyin = new Scanner(System.in);
			
				try {
					num = keyin.nextInt();
					
					}catch(InputMismatchException e) {
						System.out.println("잘못된 입력입니다");
						continue;
					}catch(ArrayIndexOutOfBoundsException e) {
						continue;
					}catch(ArithmeticException e) {
						continue;
					}catch(Exception e) {
						continue;
					}result += num;
					count+=1;
					System.out.printf("합계: %d%n",result);
					if(count>5)
						break;
					
		
		
	}
}
}
		
//		String a = str[0]; // 1 가져옴
//		int b = 3; // 1+3
//		// 문자열 1을 숫자로 바꾸려면 구문분석을 실시해야 한다
//		// integer.parseInt("1") : 숫자 1을 반환한다
//		int c = Integer.parseInt(a);
//		int result = b/c;
//		System.out.println(result);

