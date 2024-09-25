
public class Fourth {
	public static void main (String[]args) {
		int a = 0b1010;
		System.out.println(a);
		
		int b = 0xef; // e = 1110 f = 1111
		System.out.println(b);
		
		int c = 1_234_567_890;//인간 읽기 쉬우라고 3번째마다 _언더바
		System.out.println(c);
		System.out.println("==========================");
		
		float q = 0.1f + 0.3f;
		System.out.println(q);
		
		double d = 0.1 + 0.3; // 소수점 기본이 double
		System.out.println(d);
		
		double w = 0.1 + 0.2; // 0.3이 아닌 0.34 10진수 0.2를 2진수로 변환하는 과정에서 오차 발생
		System.out.println(w); 
		
		//float e = 10/0;
		//System.out.println(e);
		
		double f = 0.1/0; // 무한대
		System.out.println(f);
		
		byte b1 = (byte)(127+1);
		System.out.println(b1);
		
		byte b2 = 1;
		//b2 = b2+2; // 2는 기본적으로 int byte + int 할라니까 안돼 -> int+int = int인데 대입이 안돼 b2는 byte
		b2 = (byte)(b2+2);
		System.out.println(b2);
		
	}
}
