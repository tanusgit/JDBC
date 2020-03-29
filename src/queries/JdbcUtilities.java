package queries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtilities {

	static Connection con = null;

	public static Connection getConnection() {
		// 1. Loading the Driver
		try {
			String driverClassName = "com.mysql.cj.jdbc.Driver";
			// we need to set the time zone SET GLOBAL time_zone = '+3:00';
			String connStr = "jdbc:mysql://127.0.0.1:3306/databaseEmployee";
			String userName = "root";
			String password = "Tanusree1@";

			// load class using driverClassName
			Class.forName(driverClassName);
			// get conn obj using connStr + userName +password
			con = DriverManager.getConnection(connStr, userName, password);
		} catch (Exception e) {
			System.out.println("error  :" + e.getMessage());
		}
		return con;
	}

	public static int executeQuery(String sql) {
		int res = 0;
		try {
			Connection connection = getConnection();
			//createStatement() from library
			Statement st = connection.createStatement();
			res = st.executeUpdate(sql);
			//mysql has autocommit so we dont need the following method
			//connection.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}

		return res;
	}

	public static ResultSet getResult(String sql) {
		ResultSet rs = null;
		try {
			Connection connection = getConnection();
			Statement st = connection.createStatement();
			rs = st.executeQuery(sql);
			connection.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}

	public static void closeConnection() {
		// 1. Loading the Driver
		try {
			if (con != null) {
				con.close();
			}
		} catch (Exception e) {
			System.out.println("error  :" + e.getMessage());
		}
	}
}
