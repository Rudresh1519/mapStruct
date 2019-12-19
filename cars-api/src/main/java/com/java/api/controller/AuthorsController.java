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
import com.java.api.service.AuthorsService;

@RestController
@RequestMapping("/authors")
public class AuthorsController {

	@Autowired
	AuthorsService authorsservice;
	
	@RequestMapping("/")
    public List<Authors> getAllAuthors()
    {
    	return authorsservice.getAllAuthors();
    }
	
	@RequestMapping("/{authorId}")
    public Optional<Authors> getAuthors(@PathVariable int authorId)
    {
    	return authorsservice.getAuthors(authorId);
    }
    
	@RequestMapping(method=RequestMethod.POST ,value= "/")
    public void addAuthors(@RequestBody Authors authors)
    {
    	authorsservice.addAuthors(authors);
    }
    
	@RequestMapping(method=RequestMethod.PUT,value="/{authorId}")
    public void updateAuthors(@PathVariable int authorId,@RequestBody Authors authors)
    {
    	authorsservice.updateAuthors(authorId,authors);
    }
    
	@RequestMapping(method=RequestMethod.DELETE,value="/{authorId}")
    public void deleteAuthors(@PathVariable int authorId)
    {
    	authorsservice.deleteAuthors(authorId);
    }
    
}

