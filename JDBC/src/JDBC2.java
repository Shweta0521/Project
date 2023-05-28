	
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class JDBC2 {
	   static final String DB_URL = "jdbc:mysql://localhost:3306/DB";
	   static final String USER = "local_host";
	   static final String PASS = "mysql@123456";

	   public static void main(String[] args) {
	      // Open a connection
	      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	         Statement stmt = conn.createStatement();
	      ) {		      
	         // Execute a query
	         System.out.println("Inserting records into the table...");          
	         String sql = "INSERT INTO emp() VALUES ('Williams',18, 1455655)";
	         stmt.executeUpdate(sql);
	        /* sql = "INSERT INTO Registration VALUES (101, 'Mahnaz', 'Fatma', 25)";
	         stmt.executeUpdate(sql);
	         sql = "INSERT INTO Registration VALUES (102, 'Zaid', 'Khan', 30)";
	         stmt.executeUpdate(sql);
	         sql = "INSERT INTO Registration VALUES(103, 'Sumit', 'Mittal', 28)";
	         stmt.executeUpdate(sql);*/
	         System.out.println("Inserted records into the table...");   	  
	      } catch (SQLException e) {
	         e.printStackTrace();
	      } 
	   }
	}


