package com.crud.model;

import java.util.Date;

public class Student {
	private int rollno;
	private String studname;
	private Date dob;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getStudname() {
		return studname;
	}
	public void setStudname(String studname) {
		this.studname = studname;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Student(int rollno, String studname, Date dob) {
		super();
		this.rollno = rollno;
		this.studname = studname;
		this.dob = dob;
	}
	
}
