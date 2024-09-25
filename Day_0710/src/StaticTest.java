/*
 * 원의 반지름을 입력하여 원의 면적을 구하는 프로그램을 작성하시오
 */

import java.util.Scanner;

public class StaticTest {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		System.out.println("원의 반지름을 입력하세요: ");
		int r = keyin.nextInt();
		double r2 = r*r*Math.PI;
		// public static final double PI
		// public static PrintStream out;
		System.out.printf("원의 면적은 %.2f 입니다",r2);
	}
}
