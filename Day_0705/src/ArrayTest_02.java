
public class ArrayTest_02 {

	public static void main(String[] args) {
		String[]name = {"홍길동","전우치","손오공","저팔계","콩쥐","팥쥐"};
		int[]mat = {89,75,99,65,85,75};
		int[]kor = {65,85,99,100,75,65};
		int[]total = new int [name.length];
		
		for (int i = 0 ; i < name. length; ++i)
			total[i] = mat[i] + kor[i];
		for (int i = 0 ; i < name. length; ++i)
			System.out.printf("%-5s %3d %3d %4d%n",name[i],mat[i],kor[i],total[i]);
	}
}
		
//		for (int i = 0 ; i < name. length; ++i)
//			System.out.println("%s%n",name[i]);
//		
		//advanced for문
//		for (String temp : name)
//			System.out.println("%s%n",temp);


