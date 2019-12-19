package com.java.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.api.entity.Authors;
import com.java.api.entity.Books;
import com.java.api.repository.BooksRepository;

@Service
public class BooksService {

	@Autowired
	private BooksRepository booksrepository;
	
    public List<Books> getAllBooks() {
		
		return (List<Books>) booksrepository.findAll();
	}

	public Optional<Books> getBooks(int bookId) {
		
		return booksrepository.findById(bookId);
	}

	public void addBooks(Books books) {
		
		booksrepository.save(books);
	}

	public void updateBooks(int bookId, Books books) {
		
		booksrepository.save(books);
	}

	public void deleteBooks(int bookId) {
		
		booksrepository.deleteById(bookId);	
	}
 
	
}
