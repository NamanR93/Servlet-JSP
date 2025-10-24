package in.sp.Fetch_4;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;

public class Fetch {

	public static void main(String[] args) throws Exception {


			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","numun.23!");
			
			PreparedStatement ps = con.prepareStatement("select * from register");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				String name1 = rs.getString("name");
				System.out.println(name1);
				
				//System.out.println("name:" + rs.getString("name"));
			}
			con.close();
	}

}
