package beans;

public class Circle 
{
	int radius;
	public Circle(int radius)
	{
		System.out.println("Circle Instantiated");
		this.radius= radius;
	}
	public void getArea()
	{
		float area = 3.14f * radius; 
		System.out.println("Area of the Circle is: "+area);
	}
}
