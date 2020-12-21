package com.SpringBootJPAProject.SpringBootJPAProject.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.SpringBootJPAProject.SpringBootJPAProject.DAO.BookRepository;
import com.SpringBootJPAProject.SpringBootJPAProject.Model.Book;
@Component
public class BookService {

	@Autowired
	BookRepository br;
	public void insert(Book book)
	{
		br.save(book);
	}
	public List<Book> get1()
	{
		return (List<Book>) br.findAll();
	}
	public void delete()
	{
		br.deleteAll();
	}
	public void update1(Book book,String book_name)
	{
		book.setBook_name(book_name);
		br.save(book);
	}
	
	
	
}
