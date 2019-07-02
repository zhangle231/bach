package org.bach.common.db.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import junit.framework.TestCase;

public class Test extends TestCase {

	public void testMain() {

		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://10.5.0.34:3306/ab_common";
		String username = "etl_user";
		String password = "etl_user";
		Connection conn = null;

		try {
			Class.forName(driver);
			conn = (Connection) DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} // classLoader,加载对应驱动

//		String sql = "select * from ab_common.DATA_SYNC_TABLES order by SOURCE_USR,SOURCE_TBL";
		String sql = "show tables;";
		PreparedStatement pstmt;
		try {
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			int col = rs.getMetaData().getColumnCount();
			System.out.println("============================");
			for (int i = 1; i <= col; i++) {
				System.out.print(rs.getMetaData().getColumnName(i) + "\t");
			}
			System.out.println("");
			while (rs.next()) {

				for (int i = 1; i <= col; i++) {
					if (i >= 8) {
						if ("Y".equals(rs.getString(i))) {
							System.out.print(rs.getString(3) + "." + rs.getString(4) + "\t");
						} else {
							System.out.print("\t");
						}
					} else {
						System.out.print(rs.getString(i) + "\t");
					}
				}
				System.out.println("");
			}
			System.out.println("============================");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
