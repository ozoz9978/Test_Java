package mybuffer;

import java.util.Scanner;

public class InputBuffer {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		String name, addr;
		int a;
		double b;
		
		// next, nextInt 이런거랑 nextLine 섞어쓰면 이상해짐, nextLine 입력버퍼 청소하는 일 (설거지 다가져와)
		// 다른애들은 쓰레기 남김
		
		
		System.out.print("이름: "); 
		name = keyin.next();
		System.out.println("입력된 이름: "+name+"\n");

		keyin.nextLine();
		
		System.out.print("주소: ");
		addr = keyin.nextLine();
		System.out.println("입력된 주소: "+addr+"\n"); // line 띄어쓰기 있어도 인식함
		
		System.out.println("실수 입력: ");
		b=keyin.nextDouble();
		
		System.out.println("입력된 실수값: " + b + "\n");
		
		System.out.println("정수 입력: ");
		a=keyin.nextInt();
		System.out.println("입력된 정수값: "+ a + "\n");
		
		
		
	}
}
