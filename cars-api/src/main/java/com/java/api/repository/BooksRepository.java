package com.java.api.repository;

import javax.persistence.criteria.CriteriaBuilder.In;

import org.springframework.data.repository.CrudRepository;

import com.java.api.entity.Books;

public interface BooksRepository extends CrudRepository<Books, Integer>{

}
