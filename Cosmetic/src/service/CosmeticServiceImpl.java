// 조민근
package service;
import vo.Product;
public class CosmeticServiceImpl  implements CosmeticService{
	Product[] list = new Product[5];
	int count = 0;

	public boolean insert(Product product) {
		if(count >= list.length) { // 받을 수 있는 회원 수를 초과
			return false;
		}
		list[count++] = product;
		return true;
	}

	public Product selectOne(String productNo) {
		for (int i = 0; i<count; ++i) {
			if (list[i].getProductNo().equals(productNo)) return list[i];
			}
		return null;
	}

	public boolean update(Product product) {
	    for (int i = 0; i < count; ++i) {
	        // 제품 번호가 일치하는 경우 제품 정보 업데이트
	        if (list[i].getProductNo().equals(product.getProductNo())) {
	            list[i].update(product); // 다형성을 활용하여 업데이트
	            return true;
	        }
	    }
	    return false; // 일치하는 제품 번호가 없는 경우 false 반환
	}

	public boolean delete (String productNo) {
		for (int i =0; i<count ; ++i) {
			if (list[i].getProductNo() == productNo ) { // 탈퇴하려는 회원정보를 찾음
				for (int j = i; j<count-1;++j) // 뒤의 데이터를 앞으로 옮김
					list[j] = list[j+1];
				
			}
			--count;
			return true;
		}
		return false;
	}
	// 모든 회원의 정보를 반환
	public Product[] selectAll() {
		return list; 
	}
	// 총 회원수를 반환
	public int getCount() {
		return count;
	}
	
}