package stringapi;

public class StringTest_02 {

	public static void main(String[] args) {
		String str = "I have a dream. A song to sing!";
		// 1) 문자열의 길이를 구하여 반환
		int size = str.length();
		System.out.println("문자열의 길이: "+ size);
		
		// 2) 전달된 인덱스 위치의 문자 한 개를 반환
		char ch = str.charAt(0);
		System.out.println(ch);
		
		// 3) compare To 각각의 문자열을 비교를 위해 빼보기 때문에 //  윗크 양 / 뒷크 음 / 0 똑같
		String s = "Korea!";
		String t = "Korea!";
		System.out.println("compareTo(): "+s.compareTo(t));
		
		// 4) concat 앞 문자열이랑 뒷 문자열 합치기
		String first = "I am";
		String Second = "human";
		System.out.println("concat(): "+first.concat(Second));
		
		//5) contains 문장에서 원하는 단어가 포함되어 있으면 true 반환
		boolean contains = str.contains("you");
		System.out.println(contains);
		
		//6) endsWith 문장이 끝나는 문자가 내가 지정한 것과 같으면 true 아니면 false
		String amp2 = " You have a duck. A small cat ";
		boolean endsWith = amp2.endsWith("s");
		System.out.println(endsWith);
		
		
		//7) equals 문자열이 내가 특정한 문자열과 같은지 아닌지 true or false
		boolean equals = s.equals(t);
		System.out.println("equals: "+ equals);
		
		//8) indexOf 문자열에서 지정한 문자가 언제 등장하는지 띄어쓰기 포함 인덱스 알려줌
		int indexof = amp2.indexOf("a");
		System.out.print("indexof " + indexof);
		System.out.println();
		
		//9) ISEMPTY 공백없이 비어있는 문자열이여야 true가 나온다
		String empty = "";
		boolean isemp = empty.isEmpty();
		System.out.println(isemp);
		
		//10) lastIndexOf 공백포함 세가지고 마지막으로 출현한 자리 알려줌 찾고자 하는 문자의
		int lastindex = amp2.lastIndexOf("a");
		System.out.println(lastindex);
		
		//11) replace 문자를 바꿔치기 하는 함수 (String 은 immutable이라 바꾸면 복사본을 만들어 저장)
		String replace = amp2.replace("you", "they");
		System.out.println(replace);
		
		//12 ) split 지정한 기준으로 자른다 그대신 그냥 치면 주소나옴
		String[] split = amp2.split(" ");
		System.out.println(split[0]);
		for (String k:split) System.out.println("split"+k);
		
		//13 ) substring 지정한 자리값까지 빼고 그담부터 출력
		String substring1 = amp2.substring(0,3);
		System.out.println(substring1);
		
//		//14 ) 소문자로
//		String lower = amp2.toLowerCase();
//		System.out.println(lower);
//		
//		//15 ) 대문자로
//		String upper = amp2.toUpperCase();
//		System.out.println(upper);
//		
//		//15 ) 앞 뒤 공백 자르기
//		String trim = amp2.trim();
//		System.out.println(trim);
//		
//		//16) value of
//		String val = amp2.valueOf("you");
//		System.out.println(val);	
//				
//		
//		
//		
//		
		
		
	}
}
