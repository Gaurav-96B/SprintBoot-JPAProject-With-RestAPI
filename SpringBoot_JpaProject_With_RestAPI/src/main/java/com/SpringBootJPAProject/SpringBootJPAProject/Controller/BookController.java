package com.SpringBootJPAProject.SpringBootJPAProject.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootJPAProject.SpringBootJPAProject.DAO.BookRepository;
import com.SpringBootJPAProject.SpringBootJPAProject.Model.Book;
import com.SpringBootJPAProject.SpringBootJPAProject.Service.BookService;
@RestController
public class BookController {
@Autowired
BookService bs;

	@PostMapping("/bookdata")
	public String insertData(@RequestBody Book book)
	{
		bs.insert(book);
		return "insert sucessfully";
	}
	@GetMapping("/bookdata")
	public List<Book> getData()
	{
		return (List<Book>) bs.get1();
	}
	@DeleteMapping("/bookdata")
	public void deleteData()
	{
		bs.delete();
	}
	@PutMapping("/bookData/{book_name}")
	public String updateData(@RequestBody Book book,@PathVariable String book_name)
	{
		bs.update1(book,book_name);
		return "update sucessfully";
	}

}
