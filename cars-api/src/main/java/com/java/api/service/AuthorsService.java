package com.java.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.api.entity.Authors;
import com.java.api.repository.AuthorsRepository;

@Service
public class AuthorsService {

	@Autowired
	private AuthorsRepository authorsrepository;
	
	public List<Authors> getAllAuthors() {
		
		return (List<Authors>) authorsrepository.findAll();
	}

	public Optional<Authors> getAuthors(int authorId) {
		
		return authorsrepository.findById(authorId);
	}

	public void addAuthors(Authors authors) {
		
		authorsrepository.save(authors);
	}

	public void updateAuthors(int authorId, Authors authors) {
		
		authorsrepository.save(authors);
	}

	public void deleteAuthors(int authorId) {
		
		authorsrepository.deleteById(authorId);	
	}
 
	
	
	
	
}
