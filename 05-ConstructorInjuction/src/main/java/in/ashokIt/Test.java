package in.ashokIt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("bean.xml");
		Student stdObj = con.getBean(Student.class);
		System.out.println(stdObj);
		
	}

}
