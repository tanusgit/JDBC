package queries;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TestEmployeebyID {

	public static void main(String[] args) {
		String readByNameQuery = 
				 "Select * from employee where id=156";
		ResultSet rs = JdbcUtilities.getResult(readByNameQuery);
		try {
			if(rs!=null){
			 
				if(rs.next()){
					//get colms for every row
					int id = rs.getInt("id");
					String name = rs.getString("name");
					int salary = rs.getInt("salary");
					System.out.println(id +", " + name +", "+salary);
				}
			 else {
						System.out.println("invalid id");
       }
				
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
