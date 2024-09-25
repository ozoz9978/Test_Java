package mycollect;

import java.util.ArrayList;
import java.util.List;

/*
 * 일반적인 
 */
public class ArrayListTest {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>(); // 문자열만 들어가는 ArrayList 생성
		List<Integer> list2 = new ArrayList<>(); // Integer는 정수형 기본 자료형인 int를 객체화 시킨 클래스
		
//		int a = 10;
//		Integer b = 25;
//		a + b; // auto unboxing이 되어 연산 실시
		// C(add), 
		
		list1.add("역삼동");
		list1.add("상도동");
		list1.add("여의도동");
		list1.add("수유동");
		
		String temp = list1.get(3);
		System.out.println(temp);
		
		list1.add(0, "창동");
		
		int count = list1.size();
		System.out.println("데이터 개수: " + count);
		
		// 전체 순회(일반적인 방법) - v1
		for (int i = 0; i < list1.size(); ++i) {
			System.out.print(list1.get(i) + " ");
		System.out.println();
		}
		
		// advanced For -v2
		for (String t : list1)
			System.out.print(t + " ");
		System.out.println();
		
		
		// Lambda -v3
		list1.forEach((t) -> System.out.print(t + " "));
		
		System.out.println();
		
		list1.set(2, "사당동");
		list1.forEach((t) -> System.out.print(t + " "));

		System.out.println();
		String tmp = list1.remove(1);
		list1.forEach((t) -> System.out.println(t + " "));
		
		System.out.println("삭제되어 반환된 데이터: " + tmp);
		
		// 
		boolean result = list1.contains("수유동");
		result = list1.contains("월계동");
		
	}


}
