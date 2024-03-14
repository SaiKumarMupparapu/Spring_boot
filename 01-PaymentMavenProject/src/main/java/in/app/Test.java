package in.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("SpringBean.xml");
		Resturant rst = context.getBean(Resturant.class);
       rst.collectBill(1200);
       
       
	}

}
