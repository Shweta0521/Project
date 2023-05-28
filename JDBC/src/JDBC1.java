import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
                                                                                                                
//Insert the student data using statement
public class JDBC1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
                                                                                                                                                                                                
		try {
			String sql = "insert into emp (name, id, phone) values ('Williams',456,9798566)";
					
			Class.forName("com.mysql.cj.jdbc.Driver"); // load the driver
			// to establish the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://local_host:3306/db", "local_host", "mysql@123456");

			// create the sql statement
			Statement statement = con.createStatement();
                              
			// submit the sql statement to database..

			//statement.executeUpdate(sql);
			statement.execute(sql);

			System.out.println("Insertion successfully...");
                                                                                                        
			// close the resources.                   
			con.close();
			statement.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
