
public class OperatorTest_05 {

	public static void main(String[] args) {
		byte a = 0b00001111; /// 00001111
		byte b = 0x0f;       /// 00001111
		byte c = 15;		/// 00001111
		System.out.println(a+", "+b+", "+c);
		
		int x = 3;
		int y = 2;
		int z ;
		
		// & : 둘다 1일때만 1임 ( bit clear ) 
		z = x & y;
		System.out.println("x & y = " + z);
		
		// | : 둘 중 하나만 1이면 1임
		z = x | y;
		System.out.println("x | y = " + z);
		
		// ^ : 두개의 값이 다를때만 1임
		z = x ^ y;
		System.out.println("x ^ y = " + z);
		
		// ~ : 1의 보수
		x = -1 ; // 1111 1111
		z = ~x ; // 0000 0000
		System.out.println("~x = " + z);
		
		// 0000 0010 -> 1111 1101 -> 1111 1110 (-2의 비트표현)
		int temp = 0xfffffffe;
		System.out.println(temp);
		
		// x << 1  0000 0001 -> 0000 0010
		x = 1;
		x = x << 1;
		System.out.println("x << 1 = " + x);
		x = x << 1;
		System.out.println("x << 1 = " + x);
		x = 1;
		x = x << 31;
		System.out.println("x << 1 = " + x);
		
		x = Integer.MIN_VALUE;
		System.out.println(x);
		
		x = x >>> 1;
		System.out.println("x >>> 1 = " + x);
		
		x = Integer.MIN_VALUE;
		x = x >> 1; // 부호자리 부호 유지하면서 1 옮기기
		
		System.out.println("x >>> 1 = " + x);
		
	}

}
