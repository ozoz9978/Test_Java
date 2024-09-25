package Service;
import VO.Man;

public class SpeakableServiceImpl implements SpeakableService {
		Man[] list = new Man[5];
		int count = 0;

		public boolean insert(Man man) {
			if(count >= list.length) { // 받을 수 있는 회원 수를 초과
				return false;
			}
			list[count++] = man;
			return true;
		}
		// 모든 회원의 정보를 반환
		public Man[] selectAll() {
			return list; 
		}
		// 총 회원수를 반환
		public int getCount() {
			return count;
		}
		
}
