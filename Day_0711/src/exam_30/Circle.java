package exam_30;
import exam_30.Point;
public class Circle extends Point{

	private double radius;
	
	public Circle() {
		super();
	}
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	public Circle(int x, int y, double radius) {
		super(x,y);
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
		
	@Override
	public double area() {
		return (radius * radius) * Math.PI;
		
	}
	@Override
	public void print() {
		super.print();
		System.out.printf("%n반지름: %.2f, 넓이: %.2f",radius,area() );
		
	}
	
	
}
