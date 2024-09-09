package com.evergent.corejava.JDBC;
import java.sql.*;
public class PreparedStatementEx2 {
	public static void main(String[] args)throws Exception  {
			System.out.println("MySQL Connect Example.");
			Connection conn = null;
			String url = "jdbc:mysql://localhost:3306/";
			String dbName = "evergentdb";
			String driver = "com.mysql.jdbc.Driver";
			String userName = "root"; 
			String password = "admin";	 
				Class.forName(driver);
				conn = DriverManager.getConnection(url+dbName,userName,password);
				
				String query="insert into Info1 values(?,?,?)";	
				   
				//Step1 :  Get PreparedStatement 
				PreparedStatement pstmt=conn.prepareStatement(query);
				
				//Step2 :  Set parameters
				pstmt.setInt(1,10);
				pstmt.setString(2,"Tom");
				pstmt.setDouble(3,55000.66);
				//Step3 : execute the query
				int i=pstmt.executeUpdate();
				System.out.println("Record inserted count :"+i);
			   	//Execute query once again
				pstmt.setInt(1,11);
				pstmt.setString(2,"jerry");
				pstmt.setDouble(3,60000.66);
				i=pstmt.executeUpdate(); 			
				System.out.println("Query executed for the second time count :"+i);				
		}
	} 
