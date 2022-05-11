import java.util.ArrayList;
import java.util.Scanner;

class StudentDetails{
	private int rollno;
	private String name;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public StudentDetails(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	
	
}
public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<StudentDetails> list=new ArrayList<>();
		/*StudentDetails s1=new StudentDetails(1,"Anil");
		list.add(s1);*/
		//list.add(new StudentDetails(1,"Anil"));
		Scanner sc=new Scanner(System.in);
		int local_rollno;
		String local_name;
		for(int i=1;i<=3;i++){
			System.out.println("Enter rollno");
			local_rollno=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter name");
			local_name=sc.nextLine();
			list.add(new StudentDetails(local_rollno,local_name));
			
		}	
		
		for(StudentDetails obj :list){
			
			System.out.println(obj.getRollno()+" "+obj.getName());
			
		}
		
	}

}
