package com.kodjo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBAccess {
	//Attributes
	private String url ;
	private String user ;
	private String password ;
	
	private Connection conn ;
	
	//Constructors
	DBAccess(String url, String user, String password){
		this.url = url;
		this.user = user;
		this.password = password;
		
		try {
            // The newInstance() call is a work around for some
            // broken Java implementations

            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        } catch (Exception ex) {
            // handle the error
        }
		
	}
	public boolean connect() {
		try {
			this.conn = DriverManager.getConnection(this.url, this.user, this.password);
			System.out.println("Connect to " + this.url);
			return true ;
		}catch (SQLException e	) {
			System.out.println("Erreur lors de la connexion à la base de données : ");
		}
		
		return false ;
	}
	public void disconnect() {
		try {
			if(conn != null) {
				conn.close();
				System.out.println("Disonnect to " + this.url);
			}
		}catch(SQLException e) {
			System.out.println("Erreur de la fermeture de la base de donnees : " + e.getMessage());
		}
	}
	public Connection getConnection() throws SQLException {
		return conn ;
	}
}
