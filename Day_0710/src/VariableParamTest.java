class Person{
	public void output(int...ary) { // ary 배열
		for (int i=0;i<ary.length;++i)
			System.out.println(ary[i]+ " ");
		System.out.println();
		System.out.println("=====END=====");
	}
}
public class VariableParamTest {
	public static void main(String[] args) {
		Person p = new Person();
		p.output(); // 전달인자 없음
		
	}
}
