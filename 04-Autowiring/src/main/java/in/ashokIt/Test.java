package in.ashokIt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("beans1.xml");
		ATM bean = con.getBean(ATM.class);
		bean.withdraw();
	}

}
