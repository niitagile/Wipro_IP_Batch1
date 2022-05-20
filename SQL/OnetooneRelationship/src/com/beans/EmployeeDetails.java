package com.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class EmployeeDetails {    
	@Id  
    @GeneratedValue(strategy=GenerationType.AUTO)  
	 @PrimaryKeyJoinColumn 
	private int employeeId;    
	@Column(length=20)
    private String name,email;   
	
	
	  @OneToOne(targetEntity=Address.class,cascade=CascadeType.ALL)  
	private Address address;
	
	
	
	
	public int getEmployeeId() {  
	    return employeeId;  
	}  
	public void setEmployeeId(int employeeId) {  
	    this.employeeId = employeeId;  
	}  
	public String getName() {  
	    return name;  
	}  
	public void setName(String name) {  
	    this.name = name;  
	}  
	public String getEmail() {  
	    return email;  
	}  
	public void setEmail(String email) {  
	    this.email = email;  
	}  
	public Address getAddress() {  
	    return address;  
	}  
	public void setAddress(Address address) {  
	    this.address = address;  
	} 
  
}   