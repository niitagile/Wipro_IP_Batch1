package com.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.beans.Address;
import com.beans.EmployeeDetails;

public class Store {
	public static void main(String[] args) {
		EmployeeDetails e1=new EmployeeDetails();    
	    e1.setName("Kartik");    
	    e1.setEmail("Kartik@gmail.com");    
	        
	    Address address1=new Address();    
	    address1.setAddressLine1("F-9, ABC nagar");    
	    address1.setCity("Ghaziabad");    
	    address1.setState("UP");    
	    address1.setCountry("India");    
	    address1.setPincode(201301);
	    
	     //Bidirectional Relationship   
	    e1.setAddress(address1);    
	    address1.setEmployee(e1); 
	    
	    SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(e1); //empid, empname, email, addressobject-> addressid, state.., e1
		
		session.getTransaction().commit();
	}

}
