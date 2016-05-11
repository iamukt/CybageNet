package beans;

public class Singleton {
	private Singleton()
	{
		System.out.println("Singletion class executed");
	}
	public static Singleton getSingletonInst()
	{
		return new Singleton();
	}
}
