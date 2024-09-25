
public class StaticData {
String title = "History of Island"; // 인스턴스 변수 (heap) : 자신의 클래스가 생성되면 탄생, 
//객체를 포인팅하는 참조변수가 없어지면 gc에 의해 소멸
int page;//다른곳에서 this로 부를 수 있음

// 클래스 변수는 프로그램이 구동되면 생성
// 프로그램이 종료되면 소멸	
static int CODE = 12; // static이 붙어서 클래스 변수 <-> 인스턴스 변수가 아니라
public void setPage(int page) {
		this.page = page;
	}
public void process(int page) {
		int maxPage = 500; // 지역변수(Stack) : 메소드 안에서 선언, 매소드를 호출하면 탄생
	{
		int inner = 150;
		maxPage +=10;
		System.out.println("inner = "+inner);
		System.out.println("MaxPage = "+maxPage);
		// 지역종료, 지역이 닫히면 소멸
	}
	// inner += 1;
	}
	public void calc() {
		title = "2024년 7월 어느날";
		this.page = 1500;
		this.CODE = 7; //하나의 변수를 여러 객체에서 공유하면서 사용할때!
		StaticData.CODE = 7;
		
		
	}
}
