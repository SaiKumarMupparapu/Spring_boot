package in.ashokit;

import java.sql.SQLException;

public interface IRecordInsert {
	int inserted(int id,String name,int price) throws SQLException;

}
