package in.ashokit;

import java.sql.SQLException;

public class Service {
	private IRecordInsert ir;

	public Service(IRecordInsert ir) {
		this.ir = ir;
	}

	public void saved(int id, String name, int price) throws SQLException {
		int inserted = ir.inserted(id, name, price);
		if (inserted > 0)
			System.out.println("record inserted");
		else
			System.out.println("record not inserted");
	}

}
