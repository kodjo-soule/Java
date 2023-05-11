package com.kodjo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserModel {
	private DBAcces dbaccess ;
	User user ;
	
	public UserModel(DBAcces db) {
		this.dbaccess = db;
	}
	
	public boolean authenticate(User user) throws SQLException {
		String username = user.getUsername();
		String password = user.getPassword();
		String query = "SELECT * FROM users WHERE username = ? AND password = ?";
		if (dbaccess.connect()) {
			PreparedStatement stm = dbaccess.getConnection().prepareStatement(query);
			stm.setString(1,username);
			stm.setString(2,password);
			ResultSet rs = stm.executeQuery();
			dbaccess.disconnect();
			return rs.next();
		}
		dbaccess.disconnect();
		return false;
	}
	public boolean addUser(User user) throws SQLException {
		String username = user.getUsername();
		String password = user.getPassword();
		String query = "INSERT INTO users (username,password) VALUES (?, ?)";
		this.dbaccess.connect();
		PreparedStatement stm = dbaccess.getConnection().prepareStatement(query);
		stm.setString(1, username);
		stm.setString(2, password);
		int rowInserted = stm.executeUpdate();
		dbaccess.disconnect();
		return rowInserted > 0 ;	
	}
	public boolean deleteUser(String login) throws SQLException {
		String query = "DELETE FROM users WHERE username = ? " ;
		dbaccess.connect();
		PreparedStatement stm = dbaccess.getConnection().prepareStatement(query);
		stm.setString(1, login);
		int rowsDeleted = stm.executeUpdate();
		dbaccess.disconnect();
		return rowsDeleted > 0 ;
	}
	public boolean updateUser(User user) throws SQLException {
		String username = user.getUsername();
		String newPassword = user.getPassword();
		String sql = "UPDATE users SET password = ? WHERE username = ?";
		dbaccess.connect();
		PreparedStatement stmt = dbaccess.getConnection().prepareStatement(sql) ;
        stmt.setString(1, newPassword);
        stmt.setString(2, username);
        int rowsUpdated = stmt.executeUpdate();
        dbaccess.disconnect();
        return rowsUpdated > 0  ;
	}
	
	public List<User> getAllUsers() {
        List<User> userList = new ArrayList();
        String sql = "SELECT * FROM users";
        try {
            PreparedStatement stmt = this.dbaccess.getConnection().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                User user = new User(id, name, email);
                userList.add(user);
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userList;
    }
}
