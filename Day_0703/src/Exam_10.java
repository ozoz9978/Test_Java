/*[문제 - 10 ] 세 자리의 정수를 입력하시오.
 * system.exit(1);
 * 각자리에 있는 digit의 값을 합한 결과를 출력하시오
 * ex ) 123 => 6, 999 =. 27
 */

import java.util.Scanner;

public class Exam_10 {

	public static void main(String[] args) {
	Scanner keyin = new Scanner(System.in);
	System.out.print("세 자리의 정수를 입력하시오: ");
	int number = keyin.nextInt();
	if (number < 100 || number > 999) {
		System.out.print("3자리로 입력해주세요");
		System.exit(1);
	}
    int one = number % 10;
    	//System.out.println(one);
    int ten = (number - one) % 100 ;
    	//System.out.println(ten/ 10);
    int hundred = (number - one - ten);
    	//System.out.println(hundred/100);
    	System.err.println(one + (ten /10) + (hundred/100));
    keyin.close();
	}

}

///public class answer {
	//System.out.print("세 자리의 정수를 입력하시오: ");
	// int number, hundred, decimal, digit;
	// number = keyin.nextInt();
	// hundred = number / 100 ;
	// decimal = number %100 /10







