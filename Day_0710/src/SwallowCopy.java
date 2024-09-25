
public class SwallowCopy {

	public static void main(String[] args) {
		int [ ] ary1 = {1,2,3,4,5};
		int [ ] ary2;
		
		//얕은복사 - 주소복사
		ary2 = ary1;
		for (int temp : ary1)
			System.out.println(temp+" ");
		System.out.println();
		ary2[1] = 100;
		ary2 = ary1;
		for (int temp : ary1)
			System.out.println(temp+" ");
		
	}

}
