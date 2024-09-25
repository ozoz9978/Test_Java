package myinterface;

public class CalculatorTest {
	public static void main(String[] args) {
		CalculatorImpl c = new CalculatorImpl();
		System.out.println("덧셈: " + c.add(10,20));
		System.out.println("뺄셈: " + c.subtract(10,20));
		System.out.println("곱셈: " + c.multiply(10,20));
		System.out.println("나눗셈: " + c.divide(10,20));
		System.out.println("나머지: " + c.modulas(10,20));
	}
}
