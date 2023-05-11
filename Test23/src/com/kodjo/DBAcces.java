package com.kodjo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBAcces {
	//Attributes
	private String url ;
	private String user ;
	private String password ;
	
	private Connection conn ;
	
	//Constructors
	DBAcces(String url, String user, String password){
		this.url = url;
		this.user = user;
		this.password = password;
	}
	public boolean connect() {
		try {
			this.conn = DriverManager.getConnection(this.url, this.user, this.password);
			return true ;
		}catch (SQLException e	) {
			System.out.println("Erreur lors de la connexion à la base de données : " + e.getMessage());
		}
		
		return false ;
	}
	public void disconnect() {
		try {
			if(conn != null) {
				conn.close();
			}
		}catch(SQLException e) {
			System.out.println("Erreur de la fermeture de la base de donnees : " + e.getMessage());
		}
	}
	public Connection getConnection() throws SQLException {
		return this.conn ;
	}
}
