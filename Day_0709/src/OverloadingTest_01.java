
public class OverloadingTest_01 {

	public static void main(String[] args) {
		double x = 1.1;
		double y = 1.5;
		
		add(x,y); // double 쓰는 2번 호출
		add(1,2);
		add('a','b');
		add(1F,4F);
		
		System.out.println();
		System.out.println(12);
		System.out.println("안녕?");
		//add(x,y) double인데 int형에 넣으려고 해서 실행 안되는 예시 만약에 이렇게 int함수 double함수 똑같은 건데 따로 만들어야해서 불편
	//1	
	}
	public static int add(int a, int b) {
		return a+b;
	//2	
	}public static double add(double a, double b) {
		return a+b;
	
	}
}
