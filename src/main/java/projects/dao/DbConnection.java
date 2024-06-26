package projects.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import projects.exception.DbException;

public class DbConnection {

		private static String HOST = "localhost";
		private static String PASSWORD = "password";
		private static int PORT = 3306;
		private static String SCHEMA = "projects";
		private static String USER = "projects";
		
		
	public static Connection getConnection() {
		String url = String.format("jdbc:mysql://%s:%d/%S?user=%s&password=%s", HOST, PORT, SCHEMA, USER, PASSWORD);
		
	try {
		Connection conn = DriverManager.getConnection(url); 
		System.out.println("Connection to schema '" + SCHEMA + " ' is successeful."); 
		return conn; 
	} catch (SQLException e) {
		System.out.println("Unable to get connection at \" + url ");
		throw new DbException("Unable to get connection at \" + url");
	}
}

}
