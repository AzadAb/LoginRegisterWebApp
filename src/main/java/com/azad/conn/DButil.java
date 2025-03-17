package com.azad.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButil {
	private static final String URL="jdbc:mysql://localhost:3306/login";
	private static final String USERNAME = "root";
	private static final String PASSWORD= "Azad@8088";
	
static	{
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	}
public static Connection getConnection() throws SQLException {
	System.out.println("connection is building ");
	return DriverManager.getConnection(URL,USERNAME,PASSWORD);
}
}
