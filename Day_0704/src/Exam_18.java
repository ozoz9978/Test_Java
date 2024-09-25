/*[문제 - 18  a ] n까지의 자연수의 합을 구하시오. 
 * n을 입력하시오. 제어변수 i, 합계 누적 변수 total
 * 
 * <실행>
 * 자연수 n을 입력 : 100
 * 1~100까지의 합계 = 5050
 * 
 * [문제 - 18 b ] n까지의 팩토리얼을 구하시오. 
 * 팩토리얼 변수 f, 합계 누적 변수 total
 * 
 * <실행>
 * 자연수 n을 입력 : 100
 * 1~100까지의 합계 = 5050
 * 5! = 
 * 
 */

import java.util.Scanner;

public class Exam_18 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int total  = 0; 
		int n, i = 1;
		System.out.print("자연수 n 입력: ");
		n = keyin.nextInt();
		while (i <= n) {
			  total += i ;
			  i += 1;
		}
		System.out.printf("1~%d까지의 합계: %d\n", n, total);
		keyin.close();
	}
}

//
//
//public class Exam_18 {
//
//    public static void main(String[] args) {
//        Scanner keyin = new Scanner(System.in);
//        int total, n, i = 1;
//        System.out.print("팩토리얼을 구할 정수입력: ");
//        n = keyin.nextInt();
//        while (i <= n) {
//            total *= i;  // total에 i를 곱합니다.
//            i += 1;
//        }
//        System.out.printf("%d! = %d", n, total);
//        keyin.close();
//    }
//}


