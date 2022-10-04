
public class PaintThings {

	public static void main(String[] args) {

		Sphere sp = new Sphere(15);
		double sphereArea = sp.area();
		Paint p1 = new Paint();
		double finalSphereAmount = p1.amount(sphereArea);
		System.out.println(sp.toString());
		System.out.println("Sphere Paint Amount = " + String.format("%.2f", finalSphereAmount));

		Rectangle rec = new Rectangle(20, 35);
		double recArea = rec.area();
		double finalRecAmount = p1.amount(recArea);
		System.out.println(rec.toString());
		System.out.println("Rectangle Paint Amount = " + String.format("%.2f", finalRecAmount));

		Cylinder cyl = new Cylinder(10, 30);
		double cylArea = cyl.area();
		double finalCylArea = p1.amount(cylArea);
		System.out.println(cyl.toString());
		System.out.println("Cylinder Paint Amount = " + String.format("%.2f", finalCylArea));

	}

}
