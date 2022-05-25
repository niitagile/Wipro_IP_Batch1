package com.jdbcexample;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		StudentJDBCTemplate studentJDBCTemplate=(StudentJDBCTemplate)context.getBean("studentJDBCTemplate");
		studentJDBCTemplate.create("anisha", 12);
		studentJDBCTemplate.create("heena", 15);
		studentJDBCTemplate.create("ayan", 13);
		
		//show all records
		List<Student> students=studentJDBCTemplate.listStudents();
		for(Student rec : students) {
			System.out.println(rec.getId()+" "+rec.getName()+" "+rec.getAge());
		}
		
		//delete record
		studentJDBCTemplate.delete(2);
	}

}
