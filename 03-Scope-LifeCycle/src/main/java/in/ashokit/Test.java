package in.ashokit;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ConfigurableApplicationContext con= new ClassPathXmlApplicationContext("bean.xml");
		Engine bean1 = con.getBean(Engine.class);
	//	Engine bean2 = con.getBean(Engine.class);
	//	System.out.println(bean1.hashCode());
	//	System.out.println(bean2.hashCode());
		bean1.doWork();
		con.close();
		
	}

}
