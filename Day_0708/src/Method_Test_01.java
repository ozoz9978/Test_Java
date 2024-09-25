
public class Method_Test_01 {

	public static void main(String[] args) {
		int a = 22;
		int b = 30;
		int test = add(a,b); // 호출(static 메소드 안에서는 non-static을 호출할 수 없다) // 전달인자 (arguments)
		System.out.println(test);
		
		System.out.println(multiply(a,b));
		test = power(a, 3); // a의 세제곱을 계산해서 반환하는 메소드
	}
	// 메소드를 선언 (정의)
	public static int add(int a, int b) { // 파라미터 매개변수 밖에서 전달되는 값을 받기 위한 것
		int result = a + b;
		return result;
	}
	public static int multiply(int a, int b) {
		return a * b;
	}
	public static int power(int a, int b) {
		int z = 1 ;
		for ( int i = 0; i<b; ++ i)
			z = z*a;
		return z;
			
	}
}
