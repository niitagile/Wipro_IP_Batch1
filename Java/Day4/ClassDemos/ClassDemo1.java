package ClassDemos;

import java.util.Scanner;

class Student{
	private int rollno;
	private String name;
	private float marks;
	public void getInfo(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rollno");
		rollno=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name");
		name=sc.nextLine();
		System.out.println("Enter marks");
		marks=sc.nextFloat();
	}
	public void display(){
		System.out.println("rollno="+rollno);
		System.out.println("name="+name);
		System.out.println("marks="+marks);
		
	}
	
	//Constructor- a special block which is having same name as class 
	//and use to initialize objects
	//If We are not creating any constructor then compiler will create 1 constructor
	public Student(){
		rollno=0;
		name=null;
		marks=0.0f;
	}
	
}
public class ClassDemo1 {

	public static void main(String[] args) {
		Student student1=new Student();
		
		student1.display();
		student1.getInfo();
		System.out.println("After calling getInfo");
		student1.display();
		
		
Student student2=new Student();
		
		student2.display();
		student2.getInfo();
		System.out.println("After calling getInfo");
		student2.display();

	}

}
