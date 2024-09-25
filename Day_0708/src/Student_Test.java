
public class Student_Test {
	public static void main(String[] args) {
		// Student는 사용자가 만든 새로운 타입의 데이터
		// 반드시 생성해야 사용할 수 있다
		
		Student s1 = new Student(); // 생성한 내용 heap이라는 사물함안에 저장된 데이터, 저장공간을 사용
//		s1.name = "홍길동"; 이제 직접접근은 에러
		s1.setName("홍길동");
		s1.setKor(90);
		s1.setEng(80);
		s1.setMath(77);		
		s1.setAvg((s1.getKor() + s1.getEng()+s1.getMath()) / 3.0);
		s1.output();
		
//		System.out.printf("%5s %3d %3d %3d %.2f%n",s1.getName(), s1.getKor(), s1.getEng(), s1.getMath(), s1.getAvg());
		
		
		Student s2 = new Student();
		s2.setName ("임꺽정");
		s2.setKor(88);
		s2.setEng(85);
		s2.setMath(74);
		s2.setAvg((s2.getKor() + s2.getEng()+s2.getMath())/3.0);
		s2.output();
//		System.out.printf("%5s %3d %3d %3d %.2f%n",s2.getName(), s2.getKor(), s2.getEng(), s2.getMath(), s2.getAvg());
	}
}
