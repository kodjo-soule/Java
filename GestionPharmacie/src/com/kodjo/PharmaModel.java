package com.kodjo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.mysql.cj.jdbc.exceptions.SQLExceptionsMapping;



public class PharmaModel {
	private Connection conn ;
	Pharma Pharma ;
	//
	//Statement stmt = null;
	PreparedStatement stm = null;
	ResultSet rs = null;
	//
	
	
	public void testQuery(){
		System.out.println("Execution de testQuery");
		try {
		    stm = conn.prepareStatement("select * from users");
		    rs = stm.executeQuery(); 
		    while(rs.next()) {
		    	System.out.println("-----------------------------------");
		    	System.out.println("Username : " + rs.getString("username"));
		    	System.out.println("Password : " + rs.getString("password"));
		    	System.out.println("-----------------------------------");
		    }
		    
		}
		catch (SQLException ex){
		    
		    System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
		}
		finally {
		    
		    if (rs != null) {
		        try {
		            rs.close();
		        } catch (SQLException sqlEx) { } // ignore

		        rs = null;
		    }

		    if (stm != null) {
		        try {
		            stm.close();
		        } catch (SQLException sqlEx) { } // ignore

		        stm = null;
		    }
		}
		
    	
	}
	
	public PharmaModel(Connection conn) {
		System.out.println("Initialisation de UserModel");
		this.conn = conn;
		
	}
	
	public boolean authenticate(Pharma pharma){
		
		String username = user.getUsername();
		String password = user.getPassword();
		
		String query = "SELECT * FROM users where username = ? and password = ? ";
		
		try {
			this.stm = conn.prepareStatement(query);
			stm.setString(1, username);
			stm.setString(2, password);
			rs = stm.executeQuery();
			if(rs.next()) {
				JOptionPane.showMessageDialog(null, "User existe dans la base");
				return true;
			}else {
				JOptionPane.showMessageDialog(null, "User n'existe pas dans la base");
				return false;
			}
		}catch(SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
		    return false;
		}
		
			
		
		
	}
	public boolean addUser(Pharma pharma){
		String username = user.getUsername();
		String password = user.getPassword();
		String query = "INSERT INTO users (username,password) VALUES (?, ?)";
		try {
			stm = conn.prepareStatement(query);
			stm.setString(1, username);
			stm.setString(2, password);
			int rowInserted = stm.executeUpdate();
			return rowInserted > 0 ;
		}catch(Exception ex){
			System.out.println("SQLException: " + ex.getMessage());
			return false;
		}finally {
			if(stm != null){
				try{stm.close();}catch(SQLException ex) {}	
			}else {
				stm = null;
			}
			
		}
	}
	public boolean deleteUser(String login){
		String query = "DELETE FROM users WHERE username = ? " ;
		try {
			stm = conn.prepareStatement(query);
			stm.setString(1, login);
			int rowsDeleted = stm.executeUpdate();
			return rowsDeleted > 0 ;
		}catch(SQLException ex) {
			System.out.println("SQLException " + ex.getMessage());
			return false ;
		}finally {
			if (stm != null) {
				try {stm.close();}catch (SQLException e) {}
			}else {
				stm = null;
			}
		}
	}
	public boolean updateUser(Pharma pharma){
		String username = Phar.getUsername();
		String newPassword = user.getPassword();
		String sql = "UPDATE users SET password = ? WHERE username = ?";
		try {
			stm = conn.prepareStatement(sql) ;
	        stm.setString(1, newPassword);
	        stm.setString(2, username);
	        int rowsUpdated = stm.executeUpdate();
	        return rowsUpdated > 0 ;
	   }catch(SQLException e){
		   System.out.println("SQLException : " + e.getMessage());
		   return false ;
	   }finally{
		   if(stm != null){
			   try{stm.close();}catch(SQLException e) {}  
		   }else {
			   stm = null;
		   }
		   
	   }
        
	}
	
	
	
	
	public List<User> getAllUsers() {
        List<User> userList = new ArrayList();
        String sql = "SELECT * FROM users";
        try {
            stm = this.conn.prepareStatement(sql);
            rs = stm.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String username = rs.getString("username");
                String password = rs.getString("password");
                User user = new User(username, password);
                userList.add(user);
                
            }
            return userList ;
            
        }catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
            return userList ;
        }
        finally {
        	if(stm != null) {
        		try{stm.close();}catch(SQLException e) {}
        	}else{
        		stm = null;
        	}
        	
        	if(rs != null) {
        		try {
					rs.close() ;
				} catch (SQLException e) {
					
				}
        	}else{
        		rs = null;
        	}
		}
	}	
}
