package in.ashokit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("bean.xml");
		EmpServiceImp EmpServiceObj = ctxt.getBean(EmpServiceImp.class);
		EmpServiceObj.add();
		EmpServiceObj.search();
		System.out.println("===============");
		EmpServiceObj.get();
		System.out.println("===============");
		EmpServiceObj.remove();
		EmpServiceObj.modify();

	}

}
