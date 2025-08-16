package JDBC_conn;

import java.sql.*;
public class prepare_stmt {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url="jdbc:mysql://localhost:3306/mydb";
		String user="root";
		String password="Yugandhar@1236";
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection(url, user, password);
		System.out.println("Connection created");
		String query="Insert into student1 (rollno, name, age) values (?,?,?)";
		PreparedStatement pst=con.prepareStatement (query);
		pst.setInt(1, 101);
		pst.setString(2, "Yugandhar");
		pst.setInt(3, 20);
		
		pst.setInt(1, 102);
		pst.setString(2, "Prakash");
		pst.setInt(3, 20);
		
		pst.setInt(1, 103);
		pst.setString(2, "Ayyappa");
		pst.setInt(3, 20);
		int rows=pst.executeUpdate();
		System.out.println(rows+"=Updated rows");
	}
}