/*정수값을 입력받아 그 정수가 소수인지 판단하는 메소드를 작성하시오.
 * 소수면 true , 아니면 false 반환
 * public static boolean isPrimeNumber(int);
 * 소수 : 1과 자기자신이외에는 나누어 떨어지지 않는 수
 * 
 * <실행 > 수를 입력 : 9
 *  9는 소수가 아닙니다.
 */

import java.util.Scanner;

public class MethodTest_02 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		System.out.print("수를 입력 : ");
		int a = keyin.nextInt();
		
		boolean result = isPrimeNumber(a);
		System.out.println(a+"는 "+((result) ? "소수입니다":"소수가 아닙니다"));
		
		boolean r2 = isEven(a);
		System.out.println(a+"는 "+((r2) ? "홀수입니다":"짝수입니다"));
		
		}
	public static boolean isPrimeNumber (int a) { 
		boolean result =false;
			
		for (int i=2; i<a; ++i) {
			if (a % i ==0) 
				return false;
			}
			return true;
		}
		public static boolean isEven(int n) {
			boolean r2 = false;
			if (n%2 == 0)return true;
			return false;
		}
}

