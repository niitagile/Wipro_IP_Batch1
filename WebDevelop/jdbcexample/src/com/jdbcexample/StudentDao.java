package com.jdbcexample;

import java.util.List;

import javax.sql.DataSource;

// Student table -- id, name, age
public interface StudentDao {
	//connection datasource
	public void setDataSource(DataSource ds);
	
	// use to create a record in student table
	public void create(String name, Integer age);
	//fetch a particular record
	public Student getStudent(Integer id);
	//fetch all records
		public List<Student> listStudents();
	//to update record
		public void update(Integer id, Integer age);
	//to delete record	
		public void delete(Integer id);
}
