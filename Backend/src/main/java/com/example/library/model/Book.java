/*
 This is Model for Book
 */

package com.example.library.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "book")
public class Book {

	@Id
	private int bookId;
	private int isbnNo;
	private String name;
	private String author;
	private String publisher;
	private String category;
	
	@Temporal(TemporalType.DATE)@DateTimeFormat(pattern = "YYYY-MM-dd")
	private Date publishedDate;
	
	@Override
	public String toString() {
		return "Book [id=" + bookId + ", isbnNo=" + isbnNo + ", name=" + name + ", author=" + author + ", publisher="
				+ publisher + ", category=" + category + ", dateOfBirth=" + publishedDate + "]";
	}
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public int getbookId() {
		return bookId;
	}
	
	public void setbookId(int id) {
		this.bookId = id;
	}
	public int getIsbnNo() {
		return isbnNo;
	}
	public void setIsbnNo(int isbnNo) {
		this.isbnNo = isbnNo;
	}
	public Book(int bookId, int isbnNo, String name, String author, String publisher, String category, Date publishedDate) {
		super();
		this.bookId = bookId;
		this.isbnNo = isbnNo;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.category = category;
		this.publishedDate = publishedDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Date getPublishedDate() {
		return publishedDate;
	}
	public void setPublishedDate(Date publishedDate) {
		this.publishedDate = publishedDate;
	}

}
