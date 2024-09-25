//조민근
package vo;

public class Lipstick extends Product{
	private String type;
	private String color;
	
	public Lipstick() {
		super();
	}
	
	public Lipstick(String productNo, String name, int price, String type, String color) {
		super(productNo, name, price);
		setType(type);
		setColor(color);
		
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
		if (type.equals("1")) {
	        this.type ="립밤";
	    }else if (type.equals("2")) {
	    	this.type ="립글로스";
	    }else {
	    	this.type ="틴트";
	    }
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
		if (color.equals("1")) {
	        this.color ="빨강";
	    }else if (color.equals("2")) {
	    	this.color ="분홍";
	    }else {
	    	this.color ="오렌지";
	    }
	}
	 public void update(Product product) {
	        super.update(product);
	        if (product instanceof Lipstick) {
	            Lipstick lipstick = (Lipstick) product;
	            this.type = lipstick.getType();
	            this.color = lipstick.getColor();
	        }
	    }
	@Override
	public void output() {
		super.output();
		System.out.printf("립스틱 타입 : %s, 색상 : %s%n",
				type, color);
	}

}
