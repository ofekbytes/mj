package jsm.jdbc.examples.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test_001 {

	// SELECT//
	private String dbUrl = "jdbc:mysql://localhost:3306/mysql"; // with port: 3306
//	private String dbUrl = "jdbc:mysql://localhost/test1";
	private String user = "root"; // "jron"; // "dbadmin";
	private String password = "2Wsxcde3"; // "2Wsxcde3";
	private String stQuery = "select * from user";

	public Test_001() {

		try {

			// Get a Connection to Database //
			// import java.sql.Connection; // = // import java.sql.DriverManager; //
			Connection myConnection = DriverManager.getConnection(dbUrl, user, password);

			// Create a Statement object //
			// import java.sql.Statement;//
			Statement myStatement = myConnection.createStatement();

			// Execute Sql Query //
			// import java.sql.ResultSet; //
			ResultSet myResultSet = myStatement.executeQuery(stQuery);

			// new line //
			System.out.println("");

			///
			// Process Result set //
			while (myResultSet.next()) {

				// read Data by "column"
				System.out.print("" + myResultSet.getString("User"));
				System.out.print(", " + myResultSet.getString("password"));
//				System.out.print(", " + myResultSet.getString("last_name"));
//				System.out.print(", " + myResultSet.getString("phone"));
//				System.out.print(", " + myResultSet.getString("email"));
				System.out.println("");

			}

			// ResultSet - close //
			myResultSet.close();

			// Statement close//
			myStatement.close();

			// Connection close//
			myConnection.close();

		}
		// import java.sql.SQLException; //
		catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
