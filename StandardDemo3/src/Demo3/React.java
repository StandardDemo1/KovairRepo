package Demo3;
import java.sql.*;
import javax.sql.*;
import javax.naming.*;


public class React {

	public static void main(String[] args) {
		
	
		        Connection con;
		        PreparedStatement pstmt;
		        try {
		           
		           con.setAutoCommit(true);
		            pstmt = con.prepareStatement("UPDATE COFFEES and " +
		                        "SET PRICE = ? " +
		                        "WHERE COF_NAME = ?");
		            pstmt.setFloat(1, price);
		            pstmt.setString(2, cofName);
		            pstmt.executeUpdate();

		            con.commit();
		            pstmt.close();

		        } finally {
		            if (con != null) con.close();
		        }
		    }

		    private DataSource ds = null;
		    private Context ctx = null;
		}


	}


