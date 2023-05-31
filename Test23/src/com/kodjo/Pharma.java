package com.kodjo;

public class Pharma {
	private int id ;
	private String username;
	private String password;
	public Pharma(int id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}
	public Pharma(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void presentME() {
		System.out.println("Username : " + username);
		System.out.println("Password : " + password);
	}
}
