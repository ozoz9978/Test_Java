package mycollect;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest_01 {

	public static void main(String[] args) {
		Set set = new HashSet<>();
		set.add("포도");
		set.add("딸기");
		set.add("수박");
		set.add("옥수수");
		set.add("비니니");
		
		//1) 전체조회 : set은 순서 상관없이 조회
		set.forEach((fruit)->System.out.println(fruit+" "));
		System.out.println();
		
		//2 ) 조회
		boolean result = set.contains("수박");
		System.out.println();
		
		//3 삭제
		set.remove("수박");
		System.out.println(result? "삭제완료" : "삭제실패");
		
		int count = set.size();
		System.out.println("Set 데이터 개수: " + count);
		
		result = set.add("옥수수");
		System.out.println(result? "추가완료" : "추가실패");
		
		
		//4) iterator를 이용한 전체조회
		Iterator<String> iter = set.iterator(); // 원본은 set iter는 조회를 위한 객체
		while ( iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}	
		System.out.println();
		
	}

}
