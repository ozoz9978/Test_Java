package exam_30;
import exam_30.Point;
public class Rectangle extends Point{

	private int width;
	private int height;
	
	

	public Rectangle() {
		super();
	}

	
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(int x, int y, int width, int height) {
		super(x,y);
		this.width = width;
		this.height = height;
	}
	
	

	
	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public double area() {
		return width*height;
	}
	@Override
	public void print() {
		super.print();
		System.out.printf("%n폭: %d, 높이: %d, 넓이: %.2f",width, height,area());
		
	}
	
	
	
	
	
	
	
	
}