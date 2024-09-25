/*[문제 26]
 * 정수 배열 10개를 선언하고
 * 난수 1에서 부터 50까지 발생시켜
 * 초기화 한다.
 * 배열 안에 저장된 데이터는 중복된 값이 들어갈 수 없다. (중복없이)
 */
public class Exam_26 {

	public static void main(String[] args) {
		int [] iary = new int[10];
		//초기화
		for (int i = 0; i<iary.length; ++i) {
			iary[i] = (int)(Math.random() * 50 + 1 );//fix하고 안돌아가 7번방
			// 중복된 데이터가 있는지 확인 // 고정된 7번방에 대해 비교 다 들어감
			for (int j = 0; j<i; ++j ) {
				if(iary[i] == iary[j]) {--i;
				break;
				}
			}
			
		}
		// 출력
		for (int test:iary)
			System.out.println(test+" ");
		System.out.println();
	}
}