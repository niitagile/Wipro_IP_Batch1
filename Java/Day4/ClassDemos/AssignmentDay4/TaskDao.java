package AssignmentDay4;

import java.util.Scanner;

//Data Access Object-- We are performing all task on object
public class TaskDao {
	Task tasklist[]=new Task[20];
	static int pos=0,taskid=0;
	void insert(){
		
		Task task=new Task();
		task.setTaskId(++taskid);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter tasktitle");
		task.setTaskTitle(sc.nextLine());
		System.out.println("Enter task Description");
		task.setTaskText(sc.nextLine());
		System.out.println("Enter task assigned To");
		task.setAssignedTo(sc.nextLine());
		
		tasklist[pos]=task;
		pos++;
	}
	void delete(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter taskid which you want to delete");
		int id=sc.nextInt();
		
		boolean flag=false;
		for(int i=0;i<pos;i++){
			
			if(tasklist[i].getTaskId()==id){
				tasklist[i]=null;
				flag=true;
				break;
			}
		}//Loop finished
		if(flag==true)
			System.out.println("Task deleted");
		else
			System.out.println("Task not deleted");
		displayAll();	
	}
	void update(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter taskid which you want to update");
		int id=sc.nextInt();
		sc.nextLine();
		boolean flag=false;
		int i;
		for(i=0;i<pos;i++){
			
			if(tasklist[i].getTaskId()==id){
				
				flag=true;
				break;
			}
		}//Loop finished
		if(flag==true){
		System.out.println("Enter tasktitle");
		tasklist[i].setTaskTitle(sc.nextLine());
		System.out.println("Enter task Description");
		tasklist[i].setTaskText(sc.nextLine());
		System.out.println("Enter task assigned To");
		tasklist[i].setAssignedTo(sc.nextLine());
			System.out.println("Task is updated");
		}
			else
			System.out.println("Task not found");
		displayAll();	
		
	}
	void displayAll(){
		System.out.println("*******************************************************");
		System.out.println("Taskid \t tasktitle \t\t\t taskdescription \t\t\t task AssignedTo");
		System.out.println("*******************************************************");
		for(Task t : tasklist){
			if(t!=null){
				System.out.println(t.getTaskId()+"\t"+t.getTaskTitle()+"\t\t"+t.getTaskText()+"\t"+t.getAssignedTo());
				
			}
		}
		
	}

}
