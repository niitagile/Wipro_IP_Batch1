package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="empaddress")
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	int addreessid;
	
	@Column(length=20)
	String city;
	
	public int getAddreessid() {
		return addreessid;
	}
	public String getCity() {
		return city;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	@OneToOne(targetEntity = Employee.class)
	Employee employee;
	
	public void setAddreessid(int addreessid) {
		this.addreessid = addreessid;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

}
