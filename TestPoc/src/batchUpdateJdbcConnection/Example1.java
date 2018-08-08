package batchUpdateJdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Example1 {
	private static final String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String DB_CONNECTION = "";
	private static final String DB_USER = "";
	private static final String DB_PASSWORD = "";
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
 
			batchInsertRecordsIntoTable();
 
		} catch (SQLException e) {
 
			System.out.println(e.getMessage());
 
		}

	}
	private static void batchInsertRecordsIntoTable() throws SQLException {
		 
		Connection dbConnection = null;
		PreparedStatement preparedStatement = null;
 
		String insertTableSQL = "INSERT INTO test_prac"
				+ "(customer_id, order_id, data) VALUES"
				+ "(?,?,?)";
 
		try {
			dbConnection = getDBConnection();
			preparedStatement = dbConnection.prepareStatement(insertTableSQL);
 
			dbConnection.setAutoCommit(false);
 
			preparedStatement.setInt(1, 101);
			preparedStatement.setInt(2, 1111);
			preparedStatement.setString(3, "x");			
			preparedStatement.addBatch();
 
			preparedStatement.setInt(1, 102);
			preparedStatement.setInt(2, 1112);
			preparedStatement.setString(3, "y");
			preparedStatement.addBatch();
 
			preparedStatement.setInt(1, 103);
			preparedStatement.setInt(2, 1113);
			preparedStatement.setString(3, "z");
			preparedStatement.addBatch();
 
			preparedStatement.executeBatch();
 
			dbConnection.commit();
 
			System.out.println("Record is inserted into test_prac table!");
 
		} catch (SQLException e) {
 
			System.out.println(e.getMessage());
			dbConnection.rollback();
 
		} finally {
 
			if (preparedStatement != null) {
				preparedStatement.close();
			}
 
			if (dbConnection != null) {
				dbConnection.close();
			}
 
		}
 
	}
 
	private static Connection getDBConnection() {
 
		Connection dbConnection = null;
 
		try {
 
			Class.forName(DB_DRIVER);
 
		} catch (ClassNotFoundException e) {
 
			System.out.println(e.getMessage());
 
		}
 
		try {
 
			dbConnection = DriverManager.getConnection(
                              DB_CONNECTION, DB_USER,DB_PASSWORD);
			return dbConnection;
 
		} catch (SQLException e) {
 
			System.out.println(e.getMessage());
 
		}
 
		return dbConnection;
 
	}
 
	

}
