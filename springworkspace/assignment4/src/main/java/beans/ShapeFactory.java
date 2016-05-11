package beans;

public class ShapeFactory {
	private Circle cc;
	private Triangle tt;
	int radius;
	public ShapeFactory(int radius) {
		this.radius = radius;
	}
	public Circle getCircleInst()
	{
		return new Circle(radius);
	}
	public Triangle getTriangleInst()
	{
		return new Triangle();
	}
}

