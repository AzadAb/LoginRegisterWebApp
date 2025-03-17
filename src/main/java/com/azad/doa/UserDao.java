package com.azad.doa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.azad.conn.DButil;

public class UserDao implements UserDo  {

	
	public  boolean  isvalidUser(String username, String password) {
		String query = "select * from users where username=? and password=?";
		try {
			Connection con = DButil.getConnection();
			PreparedStatement pre_statement = con.prepareStatement(query);
			
			pre_statement.setString(1,username);
			pre_statement.setString(2,password);
			
			ResultSet result = pre_statement.executeQuery();
			
			
			return result.next();
		}   catch(SQLException e) {
			 e.printStackTrace();
			 return false;
		}
		
	}

	@Override
	public boolean addUser(User user) {
		String query = "insert into users (username,email,password) values(?,?,?)";
		try (
				Connection conn = DButil.getConnection();
				PreparedStatement pre_statement = conn.prepareStatement(query))
		
		{
			String username = user.getUsername();
			String password = user.getPassword();
			String email = user.getEmail() ;
			
			pre_statement.setString(1,username);
			pre_statement.setString(2,email);
			pre_statement.setString(3,password);
			
			int row_affected = pre_statement.executeUpdate();
			System.out.println("User is added successfully");
			return row_affected>0;
			
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}

	
}
