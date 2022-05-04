package AssignmentDay4;

import java.util.Scanner;

public class TaskManager {

	public static void main(String[] args) {
		TaskDao taskdao=new TaskDao();
		Scanner scan=new Scanner(System.in);
		int pos=0;
		int upos,i,choice;
		String search;
		boolean flag;
		while(true){
		System.out.println("Enter 1 Add 2 update 3 delete 4 Display 0 Exit");
		choice=scan.nextInt();
		scan.nextLine();
				
		flag=false;
		switch(choice){
		
		case 1 : 
					taskdao.insert();
					
					break;
		case 2 : 	taskdao.update();
					break; 
		case 3 : taskdao.delete();
					break;
		case 4 : 	taskdao.displayAll();
							
					break;
		case 0 : System.exit(0);			
		default : System.out.println("Wrong choice");
		}//switch closed
		}//while closed
	}

	}

