package com.java.api.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Authors {

	@Id
	private int authorId;
	private String authorName;
	private String place;
	
	@ManyToMany
	@JoinTable(name="Authors_Books", joinColumns = { @JoinColumn(name="authorId") }, inverseJoinColumns = { @JoinColumn(name="bookId") })
	@JsonIgnoreProperties(value="authors")
	private List<Books> books;
	
	public List<Books> getBooks() {
		return books;
	}

	public void setBooks(List<Books> books) {
		this.books = books;
	}

	public Authors() {
		
	}
	
	public Authors(int authorId, String authorName, String place, List<Books> books) {
		super();
		this.authorId = authorId;
		this.authorName = authorName;
		this.place = place;
		this.books = books;
	}

	public int getAuthorId() {
		return authorId;
	}
	
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	
	public String getAuthorName() {
		return authorName;
	}
	
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
	public String getPlace() {
		return place;
	}
	
	public void setPlace(String place) {
		this.place = place;
	}
	
	
	
}
