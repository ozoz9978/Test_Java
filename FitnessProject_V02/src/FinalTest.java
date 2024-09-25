/*static 키워드
 * 클래스 변수 선언 시 사용
 * 클래스 변수는 객체의 생성없이 접근 가능
 * 멤버변수 앞
 * 멤버 메소드 앞
 * 내부 클래스 앞에 static 키워드를 붙여 클래스 변수, 클래스 메소드, static 클래스로 작성하여 사용
 * 
 * final 키워드 
 * 지역변수 앞 - 값 수정 불가, 선언하면서 값을 초기화해야한다
 * 멤버변수 앞 - 값 수정 불가, 선언하면서 값을 초기화해야한다
 * 멤버 메소드 앞 - 오버라이딩 불가
 * 클래스 앞 - 상속불가
 */
public class FinalTest {
	String str1; // 멤버변수, 초기화가 저절로 돼
	static String str2; // 클래스 변수
	final String str3 = "강"; // final + 멤버변수 초기화를 지정해줘야함
	static final String MY_DATA = "데이터"; // 대문자 필수
	
	
	public static void main(String[] args) {
		int a; // 무조건 초기화 해야한다
		a = 10;
		a = 25;
		
		final int b = 23; // 값 바꾸기 불가
		
		System.out.println(a);
		System.out.println(str2);
		System.out.println(FinalTest.str2);
		System.out.println(b);
		
	}
}
