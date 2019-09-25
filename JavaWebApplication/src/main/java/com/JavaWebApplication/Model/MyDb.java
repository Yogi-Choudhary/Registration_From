package com.JavaWebApplication.Model;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyDb {
	
	Connection con = null;
	public Connection getCon() {
		
		try {
			Class.forName("com.mysql.driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javawebapplication","root","");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return con;
		 
	}

}
