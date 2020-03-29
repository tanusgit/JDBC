package queries;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TestSelect {
//get all employees by id

	public static void main(String[] args) {
		String readByNameQuery = 
				 "Select * from employee";
		//resultset stores query result
		ResultSet rs = JdbcUtilities.getResult(readByNameQuery);
		try {
			if(rs!=null){
				System.out.println("-------\n Printing ALL rows--------------");
				while(rs.next()){
					//get columns for every row
					int id = rs.getInt("id");
					String name = rs.getString("name");
					int salary = rs.getInt("salary");
					System.out.println(id +", " + name +", "+salary);
				}
				System.out.println("\n -----------  Printing ALL rows end ---------------");
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			JdbcUtilities.closeConnection();
		}
	}
}


