package stringbufferapi;

public class StringBufferTest_01 {

	public static void main(String[] args) {
		StringBuffer buf1 = new StringBuffer(); // java.lang.* 내부의 클래스는 import 
		System.out.println("버퍼공간: "+ buf1.capacity());
		
		StringBuffer buf2 = new StringBuffer("나리 나리 개나리 입에따다 물고요."+"병아리떼 뿅뿅뿅 봄나들이 갑니다."); // java.lang.* 내부의 클래스는 import 
		System.out.println("버퍼공간: "+ buf2.capacity());
		
		StringBuffer buf3 = new StringBuffer(new StringBuffer("마치 된 거 같아 손오공. 뿅뿅뿅. 뿅뿅뿅뿅")); // java.lang.* 내부의 클래스는 import 
		System.out.println("버퍼공간: "+ buf3.capacity());
		
		StringBuffer buf4 = new StringBuffer(100); // java.lang.* 내부의 클래스는 import 
		System.out.println("버퍼공간: "+ buf4.capacity());
		
	}

}
