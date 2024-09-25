package myenum;

public class EnumTest_02 {

	public static void main(String[] args) {
		Season2 s = Season2.여름;
		
		System.out.println(Season2.가을.getData());
		System.out.println(Season2.여름.getTemp());
		System.out.println(Season2.겨울.getMoney());
	}

}
