
class Sphere extends Shape {

	final double PI = 3.14;
	double radius;
	double area;

	public Sphere(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return area = 4 * PI * Math.pow(this.radius, 2);
	}

	@Override
	public String toString() {
		return "Sphere [PI=" + PI + ", radius=" + radius + ", area=" + area + "]";
	}

}
