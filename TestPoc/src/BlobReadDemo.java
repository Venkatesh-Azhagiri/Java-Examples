import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BlobReadDemo {
    private static String url = "jdbc:oracle:thin:@";
    private static String username = "";
    private static String password = "";

    public static void main(String[] args) throws Exception {
        Connection conn = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection(url, username, password);

            String sql = "SELECT file_data FROM test WHERE file_no = ?";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, 1313);
            //1310
            //1090 //file has data
            //1085 PDF
            //1088 txt
            ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
            	System.out.println("test sql");  
                

                byte[] buffer = new byte[256];
                Blob blob = resultSet.getBlob(1);
                byte[] ret =  blob.getBytes(1, (int)blob.length());
               System.out.println("blob***"+blob.getBinaryStream().read());
               FileOutputStream fos = new FileOutputStream("D:\\test.txt");
              // System.out.println("ret**"+ret[1]);
               fos.write(ret);          
                fos.close();
            }
        } catch (SQLException e) {
        	System.out.println("test*******");
            e.printStackTrace();
        } finally {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        }
    }
}
