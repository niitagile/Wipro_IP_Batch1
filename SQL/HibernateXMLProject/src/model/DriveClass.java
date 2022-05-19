package model;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DriveClass {

	public static void main(String[] args) {
		//Object of bean class
		Student student=new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rollno");
		student.setRollno(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter studentname");
		student.setName(sc.nextLine());
		System.out.println("Enter marks");
		student.setMarks(sc.nextFloat());
		
		/*Configuration con=new Configuration();
		SessionFactory sessionFactory=con.configure("hibernate.cfg.xml").buildSessionFactory();*/
		
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();//configure()--> reads 2 file 1 hibernate.cfg.xml, UserDetails.hbm.xml
				Session session=sessionFactory.openSession();
				session.beginTransaction();
				session.save(student);
				
				session.getTransaction().commit();

	}

}
