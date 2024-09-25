/*
 * [문제 - 19 ] 1~127까지의 코드값과 그에 해당하는 문자를 출력하시오
 *  1 : x
 *  2 : x
 *  3 : x
 *  
 *  65 : A
 *  66 : B
 *  127 : x
 */

import java.util.Scanner;

public class Exam_19 {

	public static void main(String[] args) {
			Scanner keyin = new Scanner(System.in);
			int i = 0;
			while (i <= 126) {
				  i += 1;
				  System.out.printf("%d : %s%n", i, (char)i);
			}
			System.out.printf("===========%d%n",(int)('\n')); // newline
			System.out.printf("===========%d%n",(int)('\r')); // newline
			
			keyin.close();
	}
	
}
