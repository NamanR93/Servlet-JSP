package in.sp.Delete_3;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;

public class DeleteDemo {

	public static void main(String[] args) throws Exception {
		
		String name1 = "amit"
				
;		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "numun.23!");
		
		PreparedStatement ps = con.prepareStatement("delete from register where name=?");
		ps.setString(1, "name1");
		
		int x = ps.executeUpdate();
		
		if(x>0) {
			System.out.println("Record Deleted Successfully");
			}else {
				System.out.println("Record Deletion Failed");
			}
		
		con.close();
		
		
		
}
}
