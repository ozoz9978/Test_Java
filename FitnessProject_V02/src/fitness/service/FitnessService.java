package fitness.service; // 현재클래스가 패키지 안에 포함되어 있는지 정보

import fitness.vo.Fitness;

	public class FitnessService{ // 사용하려는 클래스가 다른 패키지에 있을 때
	Fitness[] list = new Fitness[5];
	int count = 0;
	/*
	 * 전달받은 회원을 리스트에 저장
	 * @ param fitness
	 * @ return 등록 성공시 true, or false
	 */
	public boolean insert(Fitness fitness) {
		if(count >= list.length) { // 받을 수 있는 회원 수를 초과
			return false;
		}
		list[count++] = fitness;
		//count ++;
		return true;
	}
	/*전달받은 id 값에 해당하는 회원이 있는지 찾아서 반환
	 * 찾으면 회원정보, 못찾으면 null을 반환
	 * 
	 * 
	 */
	public Fitness selectOne(int id) {
		for (int i = 0; i<count; ++i) {
			//Fitness f= list[i];
			//int itemp = list[i].getId();
			if (list[i].getId() == id) return list[i];
			}
		return null;
	}
	/*
	 * 진단받은 회원정보에서 id 에 해당하는 회원을 검색해서 weight와 height를 수정
	 * id, weight, height 
	 * fitness 수정이 완료되면 true, 회원 id 가 없어서 수저을 못한 경우 false
	 */
	public boolean update(Fitness fitness) {
		//int id = fitness.getId(); 
		//double weight1 = fitness.getWeight();
		//double height1 = fitness.getHeight();
		for(int i=0; i < count; ++i) {
			if (list[i].getId()==fitness.getId()) {
				list[i].setWeight(fitness.getWeight());
				list[i].setHeight(fitness.getHeight());
				return true;
			}
		}
		return false;
	}
	/*
	 * 전달받은 id 에 해당하는 회원의 정보를 찾아서 배열 내에서 삭제 
	 * id 삭제가 완료되면 true, 회원 id 가 없어서 삭제를 못한 경우 false
	 */
	public boolean delete (int id) {
		for (int i =0; i<count ; ++i) {
			if (list[i].getId() == id ) { // 탈퇴하려는 회원정보를 찾음
				for (int j = i; j<count-1;++j) // 뒤의 데이터를 앞으로 옮김
					list[j] = list[j+1];
				
			}
			--count;
			return true;
		}
		return false;
	}
	// 모든 회원의 정보를 반환
	public Fitness[] selectAll() {
		return list; 
	}
	// 총 회원수를 반환
	public int getCount() {
		return count;
	}
}