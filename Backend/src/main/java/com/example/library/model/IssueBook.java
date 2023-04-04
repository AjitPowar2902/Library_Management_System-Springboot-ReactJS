package com.example.library.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class IssueBook {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int issueBookId;
	
	private int bookId;
	private String memberUsername;
	
	
	
	@Temporal(TemporalType.DATE) @DateTimeFormat(pattern = "YYYY-MM-DD")
	private Date issueDate;
	@Temporal(TemporalType.DATE) @DateTimeFormat(pattern = "YYYY-MM-DD")
	private Date returnDate;
	
	
	
	
	public int getIssueBookId() {
		return issueBookId;
	}
	public void setIssueBookId(int issueBookId) {
		this.issueBookId = issueBookId;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	public IssueBook() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "IssueBook [issueBookId=" + issueBookId + ", bookId=" + bookId + ", memberUsername=" + memberUsername + ", issueDate="
				+ issueDate + ", returnDate=" + returnDate + "]";
	}

	public IssueBook(int bookId, String memberUsername) {
		super();
		this.bookId = bookId;
		this.memberUsername = memberUsername;
	}
	public String getMemberUsername() {
		return memberUsername;
	}
	public void setMemberUsername(String memberUsername) {
		this.memberUsername = memberUsername;
	}
	
	

}
