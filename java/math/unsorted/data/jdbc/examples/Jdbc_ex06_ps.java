package jsm.jdbc.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


///
/// TODO fix data base permission for dbadmin + create permission + create statment 
///

public class Jdbc_ex06_ps {

	private String dbUrl = "jdbc:mysql://localhost/test1";
	private String user = "dbadmin";
	private String password = "2Wsxcde3";
//	private String stQuery = "select * from employees where last_name = 'shalom' and salary>3000; ";

	//public Jdbc_ps() { //constructor//	}
			
	public Jdbc_ex06_ps() {
		
//		try {
//			System.out.println("update data");

//			// Get a Connection to Database //
//			Connection myConnection = DriverManager.getConnection(dbUrl, user, password);
//
//			// Create a Statement object //
//			Statement myStatement = myConnection.createStatement();
//
//			// executeUpdate - execute query //
//			ResultSet myResultSet = myStatement.executeQuery(stQuery);
//
//			// new line //
//			System.out.println("");
//
//			///
//			// Process Result set //
//			while (myResultSet.next()) {
//
//				// read Data by "column"
//				System.out.print("" + myResultSet.getString("id"));
//				System.out.print(", " + myResultSet.getString("first_name"));
//				System.out.print(", " + myResultSet.getString("last_name"));
//				System.out.print(", " + myResultSet.getString("department"));
//				System.out.print(", " + myResultSet.getString("salary"));				
//				System.out.println("");
//
//			}
//
//			// Statement close//
//			myStatement.close();
//
//			// Connection close//
//			myConnection.close();

//		}
//		// import java.sql.SQLException; //
//		catch (SQLException e) {
//			System.out.println("ErrorCode :: " + e.getErrorCode());
//			System.out.println("LocalizedMessage :: " + e.getLocalizedMessage());
//			System.out.println("Message :: " + e.getMessage());
//			System.out.println("SQLState :: " + e.getSQLState());
//			e.printStackTrace();
//		}
			
	}//constructor
	
	public static void main(String[] args) {
		Jdbc_ex06_ps p = new Jdbc_ex06_ps();
	}//main
	
} //class
