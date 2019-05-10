package org.bach.common.hive;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class HiveJdbcClient {

	private static String driverName = "org.apache.hive.jdbc.HiveDriver";

	public static void main(String[] args) throws Throwable {
		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(1);
		}
		Connection con = DriverManager.getConnection("jdbc:hive2://test01:10000/test", "", "");
		Statement stmt = con.createStatement();
		
		ResultSet resultSet = stmt.executeQuery("show tables");
		while (resultSet.next()) {
			String table = resultSet.getString(1);
			System.out.println(table);
		}
		resultSet.close();
		resultSet = stmt.executeQuery("desc test2");
		while (resultSet.next()) {
			String table = resultSet.getString(1);
			System.out.println(table);
		}
		
		resultSet.close();
		resultSet = stmt.executeQuery("select data[0] from test2 limit 10");
		while (resultSet.next()) {
			String table = resultSet.getString(1);
			System.out.println(table);
		}
	}

}
