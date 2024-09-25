package myinterface;

public class CalculatorImpl implements Calculator {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) a / b;
    }

    @Override
    public int modulas(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot calculate modulus with divisor zero");
        }
        return a % b;
    }
}
