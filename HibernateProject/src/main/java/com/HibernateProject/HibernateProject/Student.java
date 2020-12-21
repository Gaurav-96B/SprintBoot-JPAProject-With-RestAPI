package com.HibernateProject.HibernateProject;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name="myStudents")
public class Student {
	@Id
	private int id;
	private String name;
	private String roll_no;

	public Student() {
		super();
	}
	public Student(int id, String name, String roll_no) {
		super();
		this.id = id;
		this.name = name;
		this.roll_no = roll_no;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(String roll_no) {
		this.roll_no = roll_no;
	}
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", roll_no=" + roll_no + "]";
	}
	
	
}
