package Arrays;

import java.util.Scanner;

/*As a user I should be able to add the task into an array
2. As a user I should be able to update the task in the array
3. As a user I should be able to delete the task in the array
4. As a user I should be able to search a task from an array 
5. As a user I should be able to see all task
*/
public class TaskManager {

	public static void main(String[] args) {
		//String task1="go to market",task2="purchase pencil",task3="return amount",task4="play game";
		//String task[]={"go to market","purchase pencil","return amount","play game"};
		String task[]=new String[10];
		Scanner scan=new Scanner(System.in);
		int pos=0;
		int upos,i,choice;
		String search;
		boolean flag;
		while(true){
		System.out.println("Enter 1 Add 2 update 3 delete 4 search 5 Display 0 Exit");
		choice=scan.nextInt();
		scan.nextLine();
				
		flag=false;
		switch(choice){
		
		case 1 : 
					System.out.println("Enter task");
					if(pos>=10){
						System.out.println("Storage full");
					}
					else
					{
						task[pos]=scan.nextLine();
						System.out.println("Task Added "+pos);
						pos++;
						
					}
					break;
		case 2 : System.out.println("Enter position of the task(0-9)");
					upos=scan.nextInt();
					scan.nextLine();
					System.out.println("Enter updated task");
					task[upos]=scan.nextLine();
					System.out.println("Task Updated");
					break; 
		case 3 : System.out.println("Enter position of the task(0-9)");
					upos=scan.nextInt();
					for( i=upos;i<task.length-1;i++){
						task[upos]=task[i];
						
					}
					
					System.out.println("Value Deleted");
					break;
		case 4 : 	System.out.println("Enter task to be searched");
					search=scan.nextLine();
					for( i=0;i<task.length;i++){
						if(task[i].equalsIgnoreCase(search)){
							flag=true;
							break;
						}
						
					}
					if (flag==true)
						System.out.println("Task found at "+i);
					else
						System.out.println("Task not found");
					break; 
					
		case 5 : 	for(String val : task){
							if (val!=null)
							System.out.println(val);
					}
					break;
		case 0 : System.exit(0);			
		default : System.out.println("Wrong choice");
		}
		}
	}

}
