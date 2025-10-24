package in.sp.update_2;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;

public class UpdateDemo {

	public static void main(String[] args) throws Exception {

		
		String name1 = "amit";
		String city1 = "pune";
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "numun.23!");
		
		PreparedStatement ps = con.prepareStatement("update register set city=? where name=?");
		ps.setString(1, city1);
		ps.setString(2, name1);
		
		int x = ps.executeUpdate();
		if(x>0) {
			System.out.println("Record Updated Successfully");
	}else {
		System.out.println("Record Updation Failed");
	}
		
		con.close();
	}

}
