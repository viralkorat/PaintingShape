
public abstract class Shape {

	String shapeName;

	public abstract double area();

	@Override
	public String toString() {
		return shapeName;
	}

}
