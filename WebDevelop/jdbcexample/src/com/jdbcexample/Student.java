package com.jdbcexample;
/*
 * mysql> create table Student(id int primary key auto_increment,name varchar(20), age int);

 */
public class Student {
	private Integer age,id;
	private String name;
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
