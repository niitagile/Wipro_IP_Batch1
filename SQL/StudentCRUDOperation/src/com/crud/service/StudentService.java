package com.crud.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.crud.model.Student;
import com.crud.util.DBConnection;

public class StudentService {
	
	Connection con=null;
	
	public StudentService(){
		
	}
	
	public ArrayList<Student> getAllRecords(){
		ArrayList<Student> list=new ArrayList<>();
		Statement stmt=null;
		try{
			
			//To get all Records
			con=DBConnection.getConnection();
			 stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from studentdetails");
			//Add all Records in ArrayList		
							
			while(rs.next()) {
				
				list.add(new Student(rs.getInt(1),rs.getString(2),rs.getDate(3)));
						
			}
			con.close();
			
			}
			catch(Exception e){
				e.printStackTrace();
			}	
			
			
		return list;
		}
		//Insert Record in Table
		public int insertRecord(Student student){
			int result=0;
			try{
				con=DBConnection.getConnection();
				java.sql.Date sdob=new java.sql.Date(student.getDob().getTime());
				//To insert records 
				PreparedStatement ps=con.prepareStatement("insert into studentDetails(rollno, studname,dob) values(?,?,?)");
				ps.setInt(1,student.getRollno());
				ps.setString(2,student.getStudname());
				ps.setDate(3, sdob);
				result=ps.executeUpdate();
				con.close();
				}
				catch(Exception e){
					e.printStackTrace();
				}
			return result;
		
		}
		public int deleteRecord(int rollno){
			int result=0;
			try{
				con=DBConnection.getConnection();
				
				PreparedStatement ps=con.prepareStatement("delete from studentdetails where rollno=?");
				
				ps.setInt(1,rollno);
				
				result=ps.executeUpdate();
				}
				catch(Exception e){
					e.printStackTrace();
				}
			return result;
		}
		
		public int updateRecord(Student student){
			int result=0;
			try{
				con=DBConnection.getConnection();
				java.sql.Date sdob=new java.sql.Date(student.getDob().getTime());
				
				//To insert records 
				PreparedStatement ps=con.prepareStatement("update studentDetails set studname=?,dob=? where rollno=?");
				ps.setInt(3,student.getRollno());
				ps.setString(1,student.getStudname());
				ps.setDate(2, sdob);
				result=ps.executeUpdate();
				con.close();
				
				}
				catch(Exception e){
					e.printStackTrace();
				}
		
			return result;
		}
		public Student getStudentByRollno(int rollno){
			Student student=null;
			try{
				con=DBConnection.getConnection();
				PreparedStatement ps=con.prepareStatement("Select * from studentdetails where rollno=?");
				ps.setInt(1, rollno);
				ResultSet rs=ps.executeQuery();
				if(rs.next())
					student=new Student(rs.getInt(1),rs.getString(2),rs.getDate(3));
				
				con.close();
				}
				catch(Exception e){
					e.printStackTrace();
				}
			return student;
		}

}
