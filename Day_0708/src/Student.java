/*관련있는 값을 저장하기 위한 용도로 만들어진 클래스
 * VO (Value Object)
 * 접근지정자를 통해 (access) 아무나 인스턴스 변수에 접근 못하게 함 : private, public
 * 속성에 값을 대입하기 위해 접근하는 메소드 : setter
 * 속성에 값을 꺼내기 위해 접근하는 메소드 : getter
 * 속성은 private 으로 지정한다.
 * 캡슐화 => 정보은닉
 */
public class Student {
	private String name; //멤버변수 (인스턴스 변수), 속성 함수밖에있는 변수, 순수데이터 (이름) -> 계산해서 나온 avg
	private int kor;
	private int eng;
	private int math;
	private double avg;
	

//Setter 생성하기
	public void setName(String name) {
		this.name = name ; // 지역변수
	
	}
	public void setKor(int kor) {
		this.kor =kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMath(int math) {
		this.math = math;	
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}

//Getter 생성하기

	public String getName() {
		return this.name;	
	}
	public int getKor() {
		return this.kor;
	}
	public int getEng() {
		return this.eng;
	}
	public int getMath() {
		return this.math;
	}
	public double getAvg() {
		return this.avg;
	}
	// 일반메소드
	public void output() {
		System.out.printf("%3d %3d %3d %3d %.2f%n", name, kor, eng, math, avg);
	}
}