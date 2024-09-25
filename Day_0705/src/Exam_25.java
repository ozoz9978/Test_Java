/* [ 문제 25 ] int 배열 10개를 선언하고 난수를 1~100 사이로 발생시켜 초기화한다. 
 * 1 2 3 4 5 6 7 8 9 10
 * 10 9 8 7 6 5 4 3 2 1
 * 
 * 
 * 
 */
public class Exam_25 {
	public static void main(String[] args) {
	    int[] iary = new int[10];
	    // 데이터를 발생시켜 초기화 (0~9; *10) (0~10; *10+1)
	    for (int idx = 0; idx < iary.length; ++idx) {
	        iary[idx] = (int) (Math.random() * 10); // 0이상 1미만사이의 난수를 발생시키는 double형(캐스트 필요)
	    }

	    // 배열 초기화 후 출력
	    for (int idx = 0; idx < iary.length; ++idx) {
	        System.out.print(iary[idx] + " ");
	    }
	    System.out.println(); // 줄바꿈

	    // 교환
	    for (int idx = 0; idx < iary.length / 2; ++idx) {
	        int temp = iary[idx];
	        iary[idx] = iary[iary.length - (idx + 1)];
	        iary[iary.length - (idx + 1)] = temp;
	    }

	    // 교환 후 배열 출력
	    for (int idx = 0; idx < iary.length; ++idx) {
	        System.out.print(iary[idx] + " ");
	    }
	    System.out.println(); // 줄바꿈
	}	
}		
