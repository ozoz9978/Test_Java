package src.fitness.service;

import java.util.ArrayList;
import java.util.List;
import src.fitness.vo.Fitness;

public class FitnessServiceImpl implements FitnessService{ // 사용하려는 클래스가 다른 패키지에 있을 때
	List <Fitness> list = new ArrayList<>();
	/*
	 * 전달받은 회원을 리스트에 저장
	 * @ param fitness
	 * @ return 등록 성s공시 true, or false
	 */
	public boolean insert(Fitness fitness) {
		return list.add(fitness);
	}
	/*전달받은 id 값에 해당하는 회원이 있는지 찾아서 반환
	 * 찾으면 회원정보, 못찾으면 null을 반환
	 * 
	 * 
	 */
	public Fitness selectOne(int id) {
		for (int i = 0; i<list.size(); ++i) {
			if (list.get(i).getId()==id)	
				return list.get(i);
			}
		return null;
	}
	/*
	 * 진단받은 회원정보에서 id 에 해당하는 회원을 검색해서 weight와 height를 수정
	 * id, weight, height 
	 * fitness 수정이 완료되면 true, 회원 id 가 없어서 수저을 못한 경우 false
	 */
	public boolean update(Fitness fitness) {
		for(int i=0; i < list.size(); ++i) {
			if (list.get(i).getId()==fitness.getId()) {
				list.get(i).setWeight(fitness.getWeight());
				list.get(i).setHeight(fitness.getHeight());
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
		for (int i =0; i<list.size() ; ++i) {
			if (list.get(i).getId() == id ) { // 탈퇴하려는 회원정보를 찾음
				list.remove(i);
			}
			return true;
		}
		return false;
	}
	// 모든 회원의 정보를 반환
	public List<Fitness> selectAll() {
		return list; 
	}
	// 총 회원수를 반환
	public int getCount() {
		return list.size();
	}
}