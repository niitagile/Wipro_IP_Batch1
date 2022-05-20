package com.virtusa.beans;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Store {
	public static void main(String[] args) {
		ArrayList<Answer> ansList= new ArrayList<Answer>();
		
		Question question1=new Question();
		 question1.setQues("What is Hibernate");
		
		 Answer ans1=new Answer();
		 ans1.setAnswers("Hibernate is a framework");
		 ans1.setPostedBy("Anita");
		 ansList.add(ans1);
		 
		 Answer ans2=new Answer();
		 ans2.setAnswers("Hibernate is based on ORM");
		 ans2.setPostedBy("Sunil");
		 ansList.add(ans2);
		 
		 question1.setAnswers(ansList);
		 
	    SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(question1);
		
		session.getTransaction().commit();
	}

}
