/*[문제 - 12] 정수 2개를 입력받는다.
 * max, min 이라는 변수를 준비. max에는 항상 큰 값이 들어가도록 한 후 출력하시오.
 * 조건 ) 두 값은 다른 값이 입력되도록 한다.
 */

//import java.util.Scanner;
//
//public class Exam_12 {
//
//	public static void main(String[] args) {
//		Scanner keyin = new Scanner(System.in);
//		int min, max ;
//	    System.out.print("정수 1개를 입력해주세요: ");
//	    int number1 = keyin.nextInt();
//	    System.out.print("또 다른 정수 1개를 입력해주세요: ");
//	    int number2 = keyin.nextInt();
// 	    		
//        max = (number1 < number2) ? number2: number1;
//        min = (number1 > number2) ? number2: number1;
//        
//        System.out.printf("최대값 %d 최소값 %d%n", max, min);
//	}
//
//}
/*[문제 - 13] 정수 2개를 입력받는다.
 * max, min, median 이라는 변수를 준비. max에는 항상 큰 값이 들어가도록 한 후 출력하시오.
 * 조건 ) 두 값은 다른 값이 입력되도록 한다. median에 중간값
 */

import java.util.Scanner;

public class Exam_12 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int min, max, median;
	    System.out.print("정수 1개를 입력해주세요: ");
	    int number1 = keyin.nextInt();
	    System.out.print("또 다른 정수 1개를 입력해주세요: ");
	    int number2 = keyin.nextInt();
	    System.out.print("또 다른 정수 1개를 입력해주세요: ");
	    int number3  = keyin.nextInt();
	    
	    max = (number1 > number2) ? (number1 > number3 ? number1 : number3) : (number2 > number3 ? number2 : number3);
        min = (number1 < number2) ? (number1 < number3 ? number1 : number3) : (number2 < number3 ? number2 : number3);
        median = (number1 != max && number1 != min) ? number1 : (number2 != max && number2 != min) ? number2 : number3;
      
        System.out.printf("최대값 %d 중간값 %d 최소값 %d%n", max, median, min);
	}

}



