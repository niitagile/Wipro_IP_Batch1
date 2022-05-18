package com.crud.controller;

import java.util.ArrayList;

import com.crud.model.Student;
import com.crud.service.StudentService;

public class StudentController {
	StudentService studService=new StudentService();
	public ArrayList<Student> getAllRecords(){
		ArrayList<Student> list=new ArrayList<>();
		list=studService.getAllRecords();
		return list;
		}
		//Insert Record in Table
		public int insertRecord(Student student){
			int result=0;
			result=studService.insertRecord(student);
			return result;
		
		}
		public int deleteRecord(int rollno){
			int result=0;
			result=studService.deleteRecord(rollno);
			return result;
		}
		
		public int updateRecord(Student student){
			int result=0;
			result=studService.updateRecord(student);
			return result;
		}
		public Student getStudentByRollno(int rollno){
			Student student=null;
			student=studService.getStudentByRollno(rollno);
			return student;
		}



}
