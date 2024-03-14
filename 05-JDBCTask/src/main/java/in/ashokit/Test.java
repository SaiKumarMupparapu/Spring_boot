package in.ashokit;

import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("bean.xml");
		Service serviceObj = ctxt.getBean(Service.class);
		serviceObj.saved(3, "Docker", 1000);

	}

}
