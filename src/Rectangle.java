
public class Rectangle extends Shape {
	double length;
	double width;
	double area;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double area() {
		return area = length * width;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + ", area=" + area + "]";
	}

}
