package myexception;

public class ExceptionTest_01 {

	public static void main(String[] args) {
		String[]str = {"3","7","a"};
		try {
			int num1 = Integer.parseInt(str[0]);
			int num2 = Integer.parseInt(str[1]);
			int num3 = Integer.parseInt(str[2]); // numberformatexception 문자열을 숫자로 만들라해서 생기는 오류
			int num4 = Integer.parseInt(str[3]); // ArrayIndexoutofboundsException
		
			int result = num1 / num2; // ArithmeticException
			System.out.println("처리 결과: "+ result);
			
			}catch(NumberFormatException e) {
				//System.out.println(e.getMessage());
				e.printStackTrace();
			}catch(ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
			}catch(ArithmeticException e) {
				e.printStackTrace();
			}catch(Exception e) {
				
			}
		
//		String a = str[0]; // 1 가져옴
//		int b = 3; // 1+3
//		// 문자열 1을 숫자로 바꾸려면 구문분석을 실시해야 한다
//		// integer.parseInt("1") : 숫자 1을 반환한다
//		int c = Integer.parseInt(a);
//		int result = b/c;
//		System.out.println(result);

	}

}
