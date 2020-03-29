package queries;

public class TestUpdate {
	public static void main(String[] args) {
		String updateQuery = 
				 "update  employee set name = 'Minaxi', salary = 25 where id = 24";
		int res = JdbcUtilities.executeQuery(updateQuery);
		if(res==0){
			System.out.println("update failed");
		}else{
			System.out.println("update succes");
		}
		
	}
}
