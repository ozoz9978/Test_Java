/* [ 문제 -21 ] 
 * 1~100까지의 자연수 중에서 3과 5의 공배수만 출력하시오. 
 * continue문을 사용할 것
 * 
 */
public class Exam_21 {

	public static void main(String[] args) {
		int i = 1 ;
		int total = 0;
		for (; i <= 100 ; ++i ) {
			if ( !(i %3 == 0 & i % 5 == 0)) continue;
			System.out.println(i);
			}
	}
	
}
	// break 사용처 : switch, while, for
	// continue 사용처 : while  조건식으로 이동할 때 , for 증감식으로 이동할 때 

