package com.example.library.model;

public class MemberCode {
	
	private int status;
	private String message;
	Member member;
	login login;
	AdminLogin adminLogin;
	
	public MemberCode(int status, AdminLogin adminLogin, String message) {
		super();
		this.status = status;
		this.message = message;
		this.adminLogin = adminLogin;
	}
	public AdminLogin getAdminLogin() {
		return adminLogin;
	}
	public void setAdminLogin(AdminLogin adminLogin) {
		this.adminLogin = adminLogin;
	}
	public login getLogin() {
		return login;
	}
	public void setLogin(login login) {
		this.login = login;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public MemberCode(int status, String message, Member member) {
		super();
		this.status = status;
		this.message = message;
		this.member = member;
	}
	
	public MemberCode(login login,int status, String message ) {
		super();
		this.status = status;
		this.message = message;
		this.login = login;
	}
	public MemberCode() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
