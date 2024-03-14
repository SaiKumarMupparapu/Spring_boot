package in.service.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("springBean.xml");
		ServiceImp bean = con.getBean(ServiceImp.class);
		System.out.println(bean.getName(100));
	}

}
