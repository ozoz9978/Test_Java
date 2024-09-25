//public class Exam_22 {
//
//	public static void main(String[] args) {
//	for (char i = 'A'; i<='Z'  ; ++i)	{
//		for (char j = 'A'; j<=i ; ++j ) {
//			System.out.printf("%s",j);
//			}
//			System.out.println();
//		}
//	}
//}

// [문제 23 ] 구구단에서 2단부터 9단까지 모두 출력하시오

//2x1 = 2
//2x2 = 4
//
//3x1= 3

public class Exam_23 {

	public static void main(String[] args) {
		for (int j = 2 ; j<10 ; j+=4) {
			for (int i = 1 ; i <=9 ; ++i) {
				for(int dan = j ; dan < j+4 ; ++dan) {
					System.out.printf("%d x %d = %2d\t",dan, i, (dan*i));
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}

		
