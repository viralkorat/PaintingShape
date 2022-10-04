
public class Cylinder extends Shape {
	final double PI = 3.14;
	double area;
	double radius;
	double hight;

	public Cylinder(double radius, double hight) {
		this.radius = radius;
		this.hight = hight;
	}

	public double area() {
		return area = PI * hight * Math.pow(this.radius, 2);
	}

	@Override
	public String toString() {
		return "Cylinder [PI=" + PI + ", area=" + area + ", radius=" + radius + ", hight=" + hight + "]";
	}
}
