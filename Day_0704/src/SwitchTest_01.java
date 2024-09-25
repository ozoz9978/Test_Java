
public class SwitchTest_01 {

	public static void main(String[] args) {
		String Family = "Father";
		switch (Family) {
		case "FATHER" : case "fAther" : case "Father" : System.out.println("아버지");break; // 대소문자 상관없이 출력하고 싶은 경우
		case "Mother" : System.out.println("어머니");break;
		case "Brother" : System.out.println("남자형제");break;
		case "Sister" : System.out.println("여자형제");break;
		default : System.out.println("누구?");
		}
		System.out.println("종료합니다");
		//------
		int value = 0 ;
		String result = "";
		switch (value) {
		case 0 : result += "*";
		case 1 : result += "^";
		case 2 : result += "^";
		case 3 : result += "*";
		}
		System.out.println(result);
	}

}
