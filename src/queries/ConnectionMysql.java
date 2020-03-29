package queries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMysql {
/*
1.Load the driver jar class
2.Create connection object
3.create statement obj
//statement obj is used to execute queries (insert/update/delete/read)
call executeUpdate() method for -->insert/update/delete
call executeQuery() method for --> select statements
4.Create ResultSet obj only for Read queries
5.close connection , statement, resultset

for oracle:

public static void main(String[] args) throws SQLException {
		try {
			String driverClassName = "oracle.jdbc.driver.OracleDriver";
			String connStr = "jdbc:oracle:thin:@localhost:1521:xe";
			String userName = "scott";
			String password = "oracle";
			
			//load class using driverClassName
			Class.forName(driverClassName);
			//get conn obj using connStr + userName +password
			con = DriverManager.getConnection(connStr, userName, password);
			
			// C R U D 
			
		} catch (Exception e) {
			System.out.println("error  :" + e.getMessage());
		}
		if(con==null){
			System.out.println("conn failed");
		}else{
			System.out.println("conn sucess");
		}
		con.close();
	}

 */
	public static void main(String[] args) throws SQLException {
		Connection con = null;
		try {
			String driverClassName = "com.mysql.cj.jdbc.Driver";
			//we need to set the time zone SET GLOBAL time_zone = '+3:00'; 
			String connStr = "jdbc:mysql://127.0.0.1:3306/mysql";
			String userName = "root";
			String password = "Tanusree1@";
			
			//load class using driverClassName
			Class.forName(driverClassName);
			//get conn obj using connStr + userName +password
			//Class.forName("com.mysql.cj.jdbc.Driver");
			
		//	Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mysql", "root", "Tanusree1@");
			con = DriverManager.getConnection(connStr, userName, password);
			System.out.println("connection success");
			// C R U D 
			
		} catch (Exception e) {
			System.out.println("error  :" + e.getMessage());
		}
		if(con==null){
			System.out.println("conn failed");
		}else{
			System.out.println("conn sucess");
		}
		con.close();
	}
	
	
	

}
