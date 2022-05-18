package com.crud.view;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.crud.controller.StudentController;


import com.crud.model.Student;

public class DriveClass {

	public static void main(String[] args) throws Exception{
		String cont;
		do{
		System.out.println("***********************student Management**********************");
		System.out.println(" 1. Add Record");
		System.out.println("2. Update Record");
		System.out.println("3. Delete Record");
		System.out.println("4. View Records");
		System.out.println("5. View a Record");
		System.out.println("************************************************************************");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice");
		int choice =sc.nextInt();
		StudentController studentctrl=new StudentController();
		Student student;
		int rollno;
		String name;
		Date dob;
		int result;
		switch(choice){
		case 1: 
			System.out.println("Enter rollno, name, dob");
			rollno=sc.nextInt();sc.nextLine();
			name=sc.nextLine();
			dob=new SimpleDateFormat("yyyy-MM-dd").parse(sc.nextLine());
			student=new Student(rollno, name, dob);
			 result=studentctrl.insertRecord(student);
			if(result>0)
				System.out.println("Record Inserted");
			else
				System.out.println("Record not inserted");
			break;
		case 2:
			System.out.println("Enter rollno, name, dob");
			rollno=sc.nextInt();sc.nextLine();
			name=sc.nextLine();
			dob=new SimpleDateFormat("yyyy-MM-dd").parse(sc.nextLine());
			
			student=new Student(rollno,name,dob);
			
			result=studentctrl.updateRecord(student);
			if(result>0)
				System.out.println("Record Updated");
			else
				System.out.println("Record not Updated");
			break;
		case 3:
			System.out.println("Enter rollno");
			rollno=sc.nextInt();
			result=studentctrl.deleteRecord(rollno);
				if(result>0)
					System.out.println("Record Deleted");
				else
					System.out.println("Record not Deleted");
			break;
		case 4:
			ArrayList<Student> list=studentctrl.getAllRecords();
			if(list==null)
				System.out.println("No Record found");
			else{
			for(Student stud : list){
				System.out.println(stud.getRollno()+"\t"+stud.getStudname()+" "+stud.getDob());
			}
			}
			break;
		case 5:
			System.out.println("Enter rollno");
			rollno=sc.nextInt();
			student=studentctrl.getStudentByRollno(rollno);
			if(student==null)
				System.out.println("Record not found");
			else{
					System.out.println("Rollno="+student.getRollno());
					System.out.println("name="+student.getStudname());
					System.out.println("DOB="+student.getDob());
				}
			break;
		default: System.out.println("Wrong option");
		}
		System.out.println("Want to perform next operation? ");
		 cont=sc.next();
		}while(cont.equalsIgnoreCase("y"));
	}

		
		

	

}
