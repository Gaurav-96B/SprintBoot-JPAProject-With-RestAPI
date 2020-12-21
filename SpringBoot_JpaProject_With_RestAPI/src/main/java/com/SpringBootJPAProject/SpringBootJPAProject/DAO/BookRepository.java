package com.SpringBootJPAProject.SpringBootJPAProject.DAO;

import org.springframework.data.repository.CrudRepository;

import com.SpringBootJPAProject.SpringBootJPAProject.Model.Book;

public interface BookRepository extends CrudRepository<Book,Integer> {

}
