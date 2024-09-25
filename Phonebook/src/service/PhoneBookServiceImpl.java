package service; // 현재클래스가 패키지 안에 포함되어 있는지 정보
import vo.PhoneBook;
public class PhoneBookServiceImpl implements PhoneBookService{ // 사용하려는 클래스가 다른 패키지에 있을 때
	PhoneBook[] list = new PhoneBook[50];
	int count = 0;

	public boolean insert(PhoneBook phonebook) {
		if(count >= list.length) { // 받을 수 있는 회원 수를 초과
			return false;
		}
		list[count++] = phonebook;
		//count ++;
		return true;
	}

	public PhoneBook selectOne(String phoneNumber) {
		for (int i = 0; i<count; ++i) {
			//Fitness f= list[i];
			//int itemp = list[i].getId();
			if (list[i].getPhoneNumber() == phoneNumber) return list[i];
			}
		return null;
	}

	public boolean update(PhoneBook phonebook) {
		//int id = fitness.getId(); 
		//double weight1 = fitness.getWeight();
		//double height1 = fitness.getHeight();
		for(int i=0; i < count; ++i) {
			if (list[i].getPhoneNumber()==phonebook.getPhoneNumber()) {
				list[i].setAge(phonebook.getAge());
				list[i].setRelation(phonebook.getRelation());
				return true;
			}
		}
		return false;
	}

	public boolean delete (String phoneNumber) {
		for (int i =0; i<count ; ++i) {
			if (list[i].getPhoneNumber() == phoneNumber ) { // 탈퇴하려는 회원정보를 찾음
				for (int j = i; j<count-1;++j) // 뒤의 데이터를 앞으로 옮김
					list[j] = list[j+1];
				
			}
			--count;
			return true;
		}
		return false;
	}
	// 모든 회원의 정보를 반환
	public PhoneBook[] selectAll() {
		return list; 
	}
	// 총 회원수를 반환
	public int getCount() {
		return count;
	}
	
}
