package beans;

public class Triangle {
	
	private int height;
	private int base;
	public Triangle()
	{
		System.out.println("Triangle Instantiated");
		
	}
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public void getArea()
	{
		float area = 0.5f * base * height; 
		System.out.println("Area of the Triangle is: "+area);
	}
}
