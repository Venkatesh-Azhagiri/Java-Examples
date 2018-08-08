package jdbcExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EgSelect1 {

	/**
	 * @param args
	 */
	static Connection conn;
	public static void main(String[] args) {
		try {
			loadDBConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	private static void loadDBConnection() throws SQLException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin", "", "");
			PreparedStatement prep = conn.prepareStatement("select user_name from test where user_id = ?");
			prep.setString(1, "admin");
			ResultSet resultSet = prep.executeQuery();
			while(resultSet.next()){
				System.out.println(resultSet.getString("user_name"));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
