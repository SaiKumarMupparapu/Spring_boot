package in.ashokit;

import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;

public class BookDAO implements IRecordInsert {
	private JdbcTemplate jdt;

	public void setJdt(JdbcTemplate jdt) {
		this.jdt = jdt;
	}

	@Override
	public int inserted(int id, String name, int price) throws SQLException {
		//Connection con = jdt.getDataSource().getConnection();
		return jdt.update("insert into book values(?,?,?)", id, name, price);
	}

}
