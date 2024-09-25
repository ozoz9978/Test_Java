
public class StaticDataTest {

	public static void main(String[] args) {
		System.out.println("Static 변수: " + StaticData.CODE);
		
		StaticData data = new StaticData();
		System.out.println(data.title);
		
		data.process(55);
	}

}
