package myexception;

import java.util.Scanner;

public class Exam_32 {

	public static void main(String[] args) {
		int[]myAry = new int[10]; // 짝수만 담기는 배열
		int count = 0;
		
		while (count<10) {
			try {
				myAry[count] = even();
				++count;
			} catch (OddException e) {
				System.out.println(e.getMessage());
			}
		}
		
		
		//advanced for
		for (int temp:myAry) {
			System.out.println(temp +" ");
		}
		System.out.println();
	}
		
	
	
	// 정수값 난수를 발생시키는 메소드
	// 홀수가 발생되면 익셉션, 짝수가 발생되면 반환
	// 짝수가 발생되면 반환

	public static int even() throws OddException {
	    int a = (int)(Math.random() * 100 + 1);
	    if (a % 2 == 0) {
	        System.out.println(a);
	        return a;
	    } else {
	        System.out.println(a + ":");
	        throw new OddException("홀수값이 발생되었습니다.");
	    }
	}
}