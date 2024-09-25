package DIGIT;

public class Digit {
	public static void main(String[] args) {
		String source = "2345";
		int data = 19;
		
		int translate = toNumber(source);
		
		if(!isNumber(source)) {
			System.out.println("# 잘못된 형식입니다. (숫자)");
			System.exit(0);
		}
		System.out.println("곱셈 연산의 결과: "+(translate*data)); //44,555
		
		
		
	}
	
	// 전달된 문자열 내에 숫자이외의 특수기호가 포함되어 있는지 여부 판단하여 true, false 반환
	public static boolean isNumber(String str) {
		for(int i=0; i<str.length(); ++i) {

			if(!(str.charAt(i) >= '0' && str.charAt(i) <= '9'))
				return false;
		}
		return true;
	} 
	
	// 전달된 문자열 내에 digit 값을 연산이 가능한 정수형으로 반환
	public static int toNumber(String str) {
		int result = 0;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            result = result * 10 + (str.charAt(i) - '0');
        }
        return result;
		
	}

	
}



