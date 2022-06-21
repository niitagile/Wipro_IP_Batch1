package com.example.demo;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Address;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@SpringBootApplication
public class SpringBootH2ExampleApplication  implements CommandLineRunner{
	@Autowired
	EmployeeRepository emprepo;
	public static void main(String[] args)  {
		
		
		/*SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(emp1); //empid, empname, email, addressobject-> addressid, state.., e1
		
		session.getTransaction().commit();*/
		
		
		
		
		SpringApplication.run(SpringBootH2ExampleApplication.class, args);
	}
		@Override
		public void run(String... args) throws Exception{
			Employee emp1=new Employee();
			emp1.setEmpname("Mahesh Sharma");
			emp1.setEmail("mahesh@gmail.com");
			Address address=new Address();
			address.setCity("Delhi");
			emp1.setAddress(address);
			
			address.setEmployee(emp1);
			emprepo.save(emp1);
		}
}
