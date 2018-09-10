package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "Nemanja", "12345");	
		
		String query = "insert into primer (kolona) values (321)";
		Statement st = conn.createStatement();
		
		st.executeQuery(query);
		
		System.out.println("Prva izmena");
		
		
		System.out.println("");
	}

}
