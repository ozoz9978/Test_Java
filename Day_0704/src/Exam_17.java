/*[문제 17] 어떤 놀이동산에서 열차에 사람을 태워서 출발하려고 한다. 
 * 무조건 5명이 채워져야 출발가능.
 * 그런데 그 열차에 탈 수 있는 사람은 키가 150에서 180사이어야 한다.
 * 
 * <실행>
 * 키 151
 * 1명 탑승
 * 키? 189
 * 1명 탑승
 * 키? 145
 * 1명 탑승
 */
import java.util.Scanner;
public class Exam_17 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		
		int count = 0; // 사람 세는 변수
		double height ; // 키를 입력받기 위한 변수
		while (true) {
			  System.out.print("키를 입력해주세요: ");
		      height = keyin.nextInt();
		      
			if(height >= 150 && height <= 180) {
				count += 1;
				System.out.printf("%d명 탑승%n", count);
				}
			else {
				System.out.printf("%d명 탑승%n", count);
			}
				if (count == 5)break;
		}
				
				
	}
}
