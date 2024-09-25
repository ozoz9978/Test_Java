package stringbufferapi;

public class StringBufferTest_02 {

	public static void main(String[] args) {
		StringBuffer buf1 = new StringBuffer("무궁화 꽃");
		buf1.append("이 피었습니다."); // 원본 수정
		System.out.println(buf1);
		
		
		String str = new String("무궁화 꽃");
		str = str.concat("이 피었습니다."); // 이렇게 변수에 다시 넣어주면 수정 가능
		System.out.println(str); // concat은 원본 수정 못함
		buf1.append(false);
		buf1.append(25);
		System.out.println(buf1.charAt(4));
		System.out.println(buf1);
		
		buf1.insert(0,"강산과들에 ");
		System.out.println(buf1);
		
		buf1.delete(0, 3);
		System.out.println(buf1);
		
		buf1.replace(3, 6, "장미");
		System.out.println(buf1);
		
		buf1.reverse();
		System.out.println(buf1);
		
		System.out.println("용량: "+buf1.capacity());
		buf1.trimToSize();
		System.out.println("용령: "+buf1.capacity());
		
		String temp = buf1.toString();
		System.out.println(temp);
		System.out.println(temp.getClass());
		System.out.println(buf1.getClass());
	}

}
