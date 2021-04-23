package jsm.jdbc.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_ex03_update {

	//UPDATE//
	private String dbUrl = "jdbc:mysql://localhost/test1";
	private String user = "dbadmin";
	private String password = "2Wsxcde3";
	private String stQuery = "update customer set email='hd@isracard.co.il' WHERE first_name='jojo' ";
	
	public Jdbc_ex03_update() { 

		try {

			// Get a Connection to Database //
			Connection myConnection = DriverManager.getConnection(dbUrl, user, password);

			// Create a Statement object //
			Statement myStatement = myConnection.createStatement();

			// executeUpdate - execute query //
			int rowsAffected = myStatement.executeUpdate(stQuery);
			
			System.out.println("rows Affected :: " + rowsAffected);
			System.out.println("update complete");


			// Statement close//
			myStatement.close();

			// Connection close//
			myConnection.close();

		}
		// import java.sql.SQLException; //
		catch (SQLException e) {
			System.out.println("ErrorCode :: " + e.getErrorCode());
			System.out.println("LocalizedMessage :: " + e.getLocalizedMessage());
			System.out.println("Message :: " + e.getMessage());
			System.out.println("SQLState :: " + e.getSQLState());
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		Jdbc_ex03_update j = new Jdbc_ex03_update();
	}

}

