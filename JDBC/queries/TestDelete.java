package queries;

public class TestDelete {
	public static void main(String[] args) {
		String updateQuery = 
				 "delete from employee where id = 24";
		int res = JdbcUtilities.executeQuery(updateQuery);
		if(res==0){
			System.out.println("delete failed");
		}else{
			System.out.println("delete succes");
		}
		
	}
}
