package com.azad.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButil {
	private static final String URL="";
	private static final String USERNAME = "";
	private static final String PASSWORD= "";
	
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
