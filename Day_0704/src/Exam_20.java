/*[문제 20 ] - for 문을 사용해서 대문자 알파벳을 출력하시오.
 * ABCDEFGHIJ...
 * 
 */
public class Exam_20 {
	public static void main(String[] args) {
	for (char i = 'A'; i <= 'Z'; ++i ) {
		if ( i == 'S') continue;
		System.out.printf("%s",i);
	}
	}

}
// break 사용처 : switch, while, for
// continue 사용처 : while  조건식으로 이동할 때 , for 증감식으로 이동할 때 

