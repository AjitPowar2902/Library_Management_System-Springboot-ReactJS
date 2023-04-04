package com.example.library.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class AdminLogin {
	@Id
	 private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public AdminLogin(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public AdminLogin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
