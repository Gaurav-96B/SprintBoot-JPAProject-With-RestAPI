package com.SpringBootJPAProject.SpringBootJPAProject.Model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Book")
public class Book {
	@Id
	private int book_Id;
	private String book_name;
	private String author_name;
	
	public Book() {
		super();
	}
	public Book(int book_Id, String book_name, String author_name) {
		super();
		this.book_Id = book_Id;
		this.book_name = book_name;
		this.author_name = author_name;
	}
	public int getBook_Id() {
		return book_Id;
	}
	public void setBook_Id(int book_Id) {
		this.book_Id = book_Id;
	}
	
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getAuthor_name() {
		return author_name;
	}
	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}
	public String toString() {
		return "Book [book_Id=" + book_Id + ", book_name=" + book_name + ", author_name=" + author_name + "]";
	}
	
	

}
