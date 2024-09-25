// CTRL + D 한줄 삭제
/*[문제]
 * 반지름이 5인 원의 면적을 구하는 프로그램을 작성하시오.
 * 원의 면적 = 파이 알 제곱
 */
public class Fifth {
	public static void main(String[] args) {
		int r = 5;
		final double PI = 3.141592;
		double space = PI * r * r;
		System.out.println("반지름 5인 원의 면적은 "+space); // 소수점 최대 6자리로 출력 
		System.out.printf("반지름 5인 원의 면적은 %.2f%n", space); //소수점 이하 2자리 출력, n붙이면 다음꺼 출력시 enter돼
	}
}


