
public class ArrayTest_04 {

	public static void main(String[] args) {
		//int [][] ary1 = new int [3][4];
		int [][] ary1 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
//		System.out.println("Ary1의 개수:"+ary1.length);
//		System.out.println("Ary1의 위치:"+ary1);
//		System.out.println("Ary1[0]의 위치:"+ary1[0]);
//		System.out.println("Ary1[0]의 개수:"+ary1[0].length);
//		System.out.println("Ary1[0][0]의 데이터:"+ary1[0][0]);
//		
		for (int i = 0 ; i<ary1.length;++i) {
			// 0행의 모든 데이터 출력
			for(int j=0; j<ary1[i].length;++j) {
				System.out.print(ary1[i][j]+" ");
			}
			System.out.println();
		}
	}
}