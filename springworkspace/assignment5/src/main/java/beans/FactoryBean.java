package beans;

public class FactoryBean {
	
	public static Singleton getA()
	{
		return Singleton.getSingletonInst();
	}
}
