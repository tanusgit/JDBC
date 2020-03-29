package queries;

import java.util.Scanner;

public class TestInsert {
	static String name;
	static int salary;
	static int id;
	
	public static void main(String[] args) {
		input();
		String insertQuery = 
				 "insert into employee values (\"" + name + "\","+ id + "," + salary + ");";
		System.out.println(insertQuery);
		int res = JdbcUtilities.executeQuery(insertQuery);
		//int res =0;
		if(res==0){
			System.out.println("insert failed");
		}else{
			System.out.println("insert succes");
		}
		
	}
	
	public static void input() {
		Scanner m = new Scanner(System.in);
		System.out.println("enter name");
		name = m.nextLine();
		System.out.println("enter id");
		id = m.nextInt();
		System.out.println("enter salary");
		salary = m.nextInt();
	}
}