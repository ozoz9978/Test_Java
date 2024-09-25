package service;

import vo.RentCar;
public class RentCarService {
	RentCar[] list = new RentCar[100];
	int count = 0;
	/*
	 * 전달받은 회원을 리스트에 저장
	 * @ param fitness
	 * @ return 등록 성공시 true, or false
	 */
	public boolean insert(RentCar rentcar) {
		if(count >= list.length) { // 받을 수 있는 회원 수를 초과
			return false;
		}
		list[count++] = rentcar;
		//count ++;
		return true;
	}
	/*전달받은 id 값에 해당하는 회원이 있는지 찾아서 반환
	 * 찾으면 회원정보, 못찾으면 null을 반환
	 * 
	 * 
	 */
	public RentCar selectOne(String Carnumber) {
		for (int i = 0; i<count; ++i) {
			//Fitness f= list[i];
			//int itemp = list[i].getId();
			if (list[i].getCarnumber() == Carnumber) return list[i];
			}
		return null;
	}


	// 모든 회원의 정보를 반환
	public RentCar[] selectAll() {
		return list; 
	}
	// 총 회원수를 반환
	public int getCount() {
		return count;
	}
}
