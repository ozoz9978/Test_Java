//한 줄 주석
/*여러 줄 주석
 * 
 */
/** 별별 주석 문서 주석 -> 문서로 뽑을 수 있는 주석, 메소드의 설명을 기재함
 *  
 */
public class Third {
	public static void main(String[]c) {
		byte a = 10; // 변수를 선언하고 값을 초기화 (initialize)
		a = 127; // 대입 (assignment) -128 부터 127까지 가능
		short b = 123;
		int i = 10;
		long lo = 10L;// i = 52L 8바이트L을 4바이트 정수형에 넣을라니까 오류 뜸
		System.out.println(a);
		System.out.println(b);
		System.out.println(i);
		System.out.println(lo);
		System.out.println("=======================");
		
		float f = 42.195F;
		double d = 3.141592;
		double d1 = 3.14E12;
		
		System.out.println(f);
		System.out.println(d);
		System.out.println(d1);
		System.out.println("=======================");
		
		char ch = 'a'; //'a' = 97, 'A' = 65, ' '= 32
		char ch1 = 97;
		char ch2 = '가';
		System.out.println(ch);
		System.out.println(ch1);
		
		System.out.println(ch2);
		System.out.println((int)ch2);
		System.out.println(ch+1);
		System.out.println('a' > 'b');
		System.out.println((int)'A');
		System.out.println((int)' ');
		System.out.println((char)('a'-' '));
	}
}
/*identifier 명명규칙
 * 키워드는 identifier가 될 수 없다
 * 영문자와 숫자를 사용하며 $, _를 제외한 특수문자 사용불가
 * 첫글자는 문자부터 사용해야한다
 * 대소문자를 엄격히 구분한다
 * Naming Rules에 맞춰 작성해야 한다
 * 핵심단어를 이용하여 10자 내외로 작성하는 것이 좋다, 길이의 제약은 없긴하다
 * identifier 이름은 전 세계의 모든 문자를 사용할 수 있으나, 영문으로 된 명칭을 사용하는 것이 바람직하다
 */

/*자바의 자료형 (DATA TYPE)
 * 1) 기초자료형 (PRIMIRIVE TYPE) : STACK 메모리 공간에 데이터 저장
 * 		 수치형 - 정수 :byte(1), short(2), int(4)-2147483648 ~ 2147483647, long(8), 실수 : float(4), double(8) , 문자 : char(2) - 음수값을 넣을 수 없음
 * 		 진위형 - boolean(1) : true, false 값을 처리
 * 2) 참조형 (REFERENCE TYPE) : Heap 메모리 공간에 데이터를 저장하고 저장위치를 변수에 담아서 사용
 * 		class, array, enum...
 */
