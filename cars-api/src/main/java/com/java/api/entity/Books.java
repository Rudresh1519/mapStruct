package com.java.api.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Books {

	@Id
	private int bookId;
	private String bookName;
	private int price;
	
	@ManyToMany(mappedBy = "books")
	//@JoinColumn(name="authorId" )
	//@JoinTable(name="Authors_Books",joinColumns = {@JoinColumn(name="bookId")},inverseJoinColumns = {@JoinColumn(name="authorId")})
	@JsonIgnoreProperties(value="books")
	private List<Authors> authors;
	
	
	public List<Authors> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Authors> authors) {
		this.authors = authors;
	}

	public Books() {
		
	}
	
	public Books(int bookId, String bookName, int price, List<Authors> authors) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.price = price;
		this.authors=authors;
	}

	public int getBookId() {
		return bookId;
	}
	
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
