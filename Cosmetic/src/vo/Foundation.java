//조민근
package vo;

public class Foundation extends Product {
	private String texture;

	public Foundation() {
		super();
	}

	public Foundation(String productNo, String name, int price, String texture) {
		super(productNo, name, price);
		setTexture(texture);
	}

	public String getTexture() {
		return texture;
	}

	public void setTexture(String texture) {
		this.texture = texture;
		if (texture.equals("1")) {
	        this.texture = "크림";
	    }else {
	    	this.texture = "스틱";
	    }
	}
	
	@Override
    public void update(Product product) {
        super.update(product);
        if (product instanceof Foundation) {
            Foundation foundation = (Foundation) product;
            this.texture = foundation.getTexture();
        }
    }
	@Override
	public void output() {
		// TODO Auto-generated method stub
		super.output();
		System.out.printf("파운데이션 제형 : %s%n",
				texture);
	}
}
