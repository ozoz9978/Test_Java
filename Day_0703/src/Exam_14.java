/*[ 문제 14 ] 정수를 입력받는다.
 * 그 정수의 모든 비트를 출력하시오.
 * 비트연산자 ( &, >>> )를 사용할 것!
 * for(int i = 0 ; i < 10 ; ++i)
 * 12 를 입력
 * 0000 0000 0000 0000 0000 0000 0000 1100
 */ 
import java.util.Scanner;

public class Exam_14 {

	public static void main(String[] args) {
	Scanner keyin = new Scanner(System.in);
	int y = 0x80000000;
	int z; // 0000 0001
	int t;
	System.out.print("정수 1개를 입력해주세요: ");
	int number = keyin.nextInt();
	for ( t = 0 ; t < 32 ; ++ t) {
		z = (number & y) == 0 ? 0:1;
		System.out.print(z);
		y = y >>> 1;
	}

	keyin.close();
	}

}

//// int는 32비트이므로 31부터 0까지 확인합니다.
//for (int i = 31; i >= 0; i--) {
//    // number를 오른쪽으로 i만큼 쉬프트한 후 y와 & 연산하여 각 비트를 확인합니다.
//    int z = (number >>> i) & y;
//    System.out.print(z);
//    // 4비트마다 공백 추가
//    if (i % 4 == 0) {
//        System.out.print(" ");
//    }
//}
