package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest_01 {
	public static void main(String[] args) {
		List<String> slist = new ArrayList<>();
	
		slist.add("아이스 아메리카노");
		slist.add("카푸치노");
		slist.add("카페라떼");
		slist.add("녹차라떼");
		System.out.println("데이터 개수: "+slist.size());
			
		slist.add(1, "더치커피");
		System.out.println(slist);
		
		System.out.println(slist.get(2));
		System.out.println(slist.contains("녹차라떼"));
		
		System.out.println(slist.isEmpty());
		//System.out.println(slist.remove);
		System.out.println(slist.remove(0));
		System.out.println(slist.remove("아이스 아메리카노"));
		System.out.println(slist);
		
		slist.set(0,"따뜻한 아메리카노");
		System.out.println(slist);
	
	}
}

