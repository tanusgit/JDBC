package queries;


public class TestInsert {
	public static void main(String[] args) {
		String insertQuery = 
				 "insert into employee values ('nisha', 24, 123)";
		int res = JdbcUtilities.executeQuery(insertQuery);
		if(res==0){
			System.out.println("insert failed");
		}else{
			System.out.println("insert succes");
		}
		
	}
}