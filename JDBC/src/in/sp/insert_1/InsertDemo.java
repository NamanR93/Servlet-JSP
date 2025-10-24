package in.sp.insert_1;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;

public class InsertDemo {

	public static void main(String[] args) throws Exception {
		
		String name1  = "amit";
		String email1 = "amit@gmail.com";
		String pass1 = "54321";
		String gender1 = "male";
		String city1 = "Bihar";
		
		// 1 Load the required JDBC Driver

		Class.forName("com.mysql.cj.jdbc.Driver");

		// 2 Establish the Connection

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "numun.23!");

		// 3

//		PreparedStatement ps = con
//				.prepareStatement("insert into register values('naman','naman@gmail.com','12345','male','M.P')");
		
		PreparedStatement ps = con.prepareStatement("insert into register values(?,?,?,?,?)");
		ps.setString(1, name1);
		ps.setString(2, email1);
		ps.setString(3, pass1);
		ps.setString(4, gender1);
		ps.setString(5, city1);
		
		int i = ps.executeUpdate();

		if (i > 0) {
			System.out.println("Record Inserted Successfully...");
		} else {
			System.out.println("Record Insertion Failed...");
		}

		// 4 Close the Connection

		con.close();
	}

}
