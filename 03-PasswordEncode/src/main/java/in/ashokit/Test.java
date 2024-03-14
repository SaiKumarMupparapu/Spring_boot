package in.ashokit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("bean.xml");
		PasswordEncode bean = con.getBean(PasswordEncode.class);
		System.out.println("Encoded Password :"+bean.pasEncoded("S@i0011"));
	}

}
