package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {
	
	public static void main(String[] args) 
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		Circle cc = (Circle) ctx.getBean("circle");
		cc.getArea();
		Triangle tt = (Triangle) ctx.getBean("triangle");
		tt.getArea();
	}
	
}