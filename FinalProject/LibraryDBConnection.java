package com.evergent.library.DAO;
import java.sql.Connection;
import java.sql.DriverManager;
public class LibraryDBConnection {
      public static Connection getConnection() throws Exception {
	        Class.forName("com.mysql.jdbc.Driver");
	        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydb", "root", "admin");
	        return conn;
	    }
	}
