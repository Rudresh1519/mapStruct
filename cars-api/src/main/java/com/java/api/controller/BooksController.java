package com.java.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java.api.entity.Authors;
import com.java.api.entity.Books;
import com.java.api.service.BooksService;

@RestController
@RequestMapping("/books")
public class BooksController {

	@Autowired
	private BooksService booksservice;
	
	@RequestMapping("/")
    public List<Books> getAllBooks()
    {
    	return booksservice.getAllBooks();
    }
	
	@RequestMapping("/{bookId}")
    public Optional<Books> getBooks(@PathVariable int bookId)
    {
    	return booksservice.getBooks(bookId);
    }
    
	@RequestMapping(method=RequestMethod.POST ,value= "/")
    public void addBooks(@RequestBody Books books)
    {
    	booksservice.addBooks(books);
    }
    
	@RequestMapping(method=RequestMethod.PUT,value="/{bookId}")
    public void updateBooks(@PathVariable int bookId,@RequestBody Books books)
    {
    	booksservice.updateBooks(bookId,books);
    }
    
	@RequestMapping(method=RequestMethod.DELETE,value="/{bookId}")
    public void deleteBooks(@PathVariable int bookId)
    {
    	booksservice.deleteBooks(bookId);
    }
	
}
