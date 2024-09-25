/*[문제 - 15 ]
 * 숫자1 : 50
 * 숫자2 : 40
 * 어떤 연산?
 * 1. 덧셈 2. 뺄셈 3.곱셈 4.나눗셈 ==> 3
 * 곱셈의 결과는 2000 입니다
 */

import java.util.Scanner;

public class Exam_15 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int num1, num2, choice;
		double result = 0;
		
		System.out.println("첫번째 정수를 입력해주세요:");
		num1 = keyin.nextInt();
		
		System.out.println("두번째 정수를 입력해주세요:");
		num2 = keyin.nextInt();
		
		System.out.print("어떤 연산을 하실래요? 1. 덧셈 2. 뺄셈 3. 곱셈 4. 나눗셈 ==>");
		choice = keyin.nextInt();
	
		switch( choice ) {
		case 1: result = num1 + num2 ; break;
		case 2 : result = num1 - num2; break;
		case 3 : result = num1 * num2; break;
		case 4 : result = (double)num1 / (double)num2; break;
		default : System.out.print("연산을 올바르게 선택해주세요");System.exit(1);
		}
		System.out.printf("결과는 : %,.2f%n",result);
	}
}

//		// switch 문 2
//		result = switch( choice ) {
//		case "1" ->  num1 + num2;
//		case "2" ->  num1 - num2;
//		case "3" ->  num1 * num2;
//		case "4" -> (double)num1 / (double)num2;
//		default -> 0.0;
//		};
//		System.out.print("결과는 : %,.2f%n",result);
//	}	
