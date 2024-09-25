import java.util.Arrays;

public class DeepCopyTest_2 {

	public static void main(String[] args) {
		int [ ] ary1 = {1,2,3,4,5};
		int [ ] ary2 = Arrays.copyOfRange(ary1, 1, 10); // to 가 원본의 크기보다 크면 0으로 채움
		
		System.out.println("원본배열");
		for (int temp : ary1)
			System.out.println(temp+" ");
		
		System.out.println();
		
		System.out.println("복사배열");
		for (int temp : ary2)
			System.out.println(temp+" ");
		System.out.println();
	}

}
