/*[문제 - 11] 
 * 두 과목의 점수와 출결점수를 각각 입력받는다. (trade, it) + 출결
 * 출결점수는 80점이상, 나머지 두 과목의 평균은 60점이상, 과락 없어야 하며 (40점 미만) 이어야 수료한다고 한다.
 * 수료 여부를 출력하시오. (삼항연산자만 사용가능)
 */

import java.util.Scanner;

public class Exam_11 {

	public static void main(String[] args) {
	Scanner keyin = new Scanner(System.in);
		int score;
		double avg ;
	    System.out.print("Trade 과목의 점수를 입력하세요: ");
	    int trade = keyin.nextInt();
	    System.out.print("IT 과목의 점수를 입력하세요: ");
	    int IT = keyin.nextInt();
	    System.out.print("출결 점수를 입력하세요: ");
	    int attendance = keyin.nextInt();
	    
	    avg = trade + IT / 2.0 ;
	    		
        String result = (attendance < 80) ? "출결 때문에 수료하지 못했습니다" :
            (avg < 60) ? "평균 점수 때문에 수료하지 못했습니다" :
            (trade < 40) ? "Trade 과목에서 과락으로 수료하지 못했습니다" :
            (IT < 40) ? "IT 과목에서 과락으로 수료하지 못했습니다" :
            "수료하셨습니다";

System.out.println(result);
}
}
