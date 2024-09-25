package mycollect;

import java.util.ArrayList;
import java.util.List;

import vo.Emp;

public class ArrayTest_02 {

	public static void main(String[] args) {
		List<Emp> list = new ArrayList<>();
		
		//1) 직원 데이터 저장
		list.add(new Emp(1,"이몽룡",2500,"기획부"));
		list.add(new Emp(2,"변사또",3400,"전산실"));
		list.add(new Emp(3,"성춘향",2700,"영업팀"));
		list.add(new Emp(4,"김방자",3000,"고객응대팀"));
		
		// 2) 직원 수 출력
		System.out.println("직원수 : "+list.size());
	
		// 3) 전체 데이터 조회
		list.forEach((item) -> System.out.println(item));
		System.out.println();
		
		// 4) 사원번호 3번인 직원을 조회, "성춘향" 직원만 조회
		for (int i=0; i<list.size();++i) {
			Emp emp = list.get(i);
			if (emp.getEmpno()==3) { // integer가 자동 언박싱 되므로 비교가능
				System.out.println(emp);
				break;
			}
		}
		// "김방자"라는 직원이 있는지 조회
		// 오류 :  목록에는 emp인데 contains 전달값은 string이기 때문
		@SuppressWarnings ("unlikely-arg-type")
		boolean result = list.contains("김방자");
		System.out.println(result); // 있으면 t, 없으면 f
		
		//equals 메소드 오버라이딩 하고 찾기 드디어 true 나옴
		result = list.contains(new Emp(4, "김방자", 3000, "고객응대팀"));
		System.out.println(result); // 있으면 t, 없으면 f
		

	}

}
