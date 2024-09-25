/* [문제 - 27 ]
 * 스무고개 난수 1~100의 수 한개를 발생시킨다.
 * 맞춰보세요? 7
 * up
 * 틀렸습니다. 맞춰보세요?
 * 90
 * down
 */

import java.util.Scanner;

public class Exam_27 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		
		int data = (int)(Math.random()*100 + 1);
		int answer ;
		
		for ( int i = 0 ; i < 5 ; ++ i ){
			System.out.print((i+1)+"회) 입력 : ");
			answer = keyin.nextInt();
			//초기화
			if(data>answer) {
				System.out.println("틀렸습니다. up");
			}else if(data < answer){
				System.out.println("틀렸습니다. down");
			}else {
				System.out.print("정답입니다");
				System.exit(0);
			} 
		}System.err.println("못맞췄습니다. 정답은" + data);

	}
}