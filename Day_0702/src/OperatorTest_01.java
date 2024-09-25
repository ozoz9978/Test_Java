/*
 * 산술연산자 ( + , - , * , % )
 * 
 */
public class OperatorTest_01 {

	public static void main(String[] args) {
		int a, b;
		int result;
		a = 10 ;
		b = 20 ;
		result = a / b;
		
		a= 10;
		b = 3;
		result = a % b;
		
		result = 10 * (20 / 5); 
		
		// + 연산자의 특징 : 단항, 이항, 결합
		int x = 10;
		x = + - - + - x ; // 이런짓은 하지 마시오!!
		
		result = 10 + 30 ;
		String temp = "값" + 10 ;
		temp = "올해는" + 2024 + "년";
		temp = "당신의 나이는" + (2024 - 1991);
		System.out.println(temp);
	}

}
