//조민근
package vo;

public class Product {
	private String productNo;
	private String name;
	private int price;
	
	
	public Product() {
		
	}
	
	public Product(String productNo, String name, int price) {
		super();
		this.productNo = productNo;
		this.name = name;
		this.price = price;
	}



	public String getProductNo() {
		return productNo;
	}

	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void update(Product product) {
        this.name = product.getName();
        this.price = product.getPrice();
    }

	public void output() {
		System.out.printf("상품코드 : %s, 상품명 : %s, 상품가격 : %d%n",
				productNo, name, price);
	}
}