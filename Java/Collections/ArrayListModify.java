package collections;


import java.util.LinkedList;

public class ArrayListModify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList <String>listName=new LinkedList<>();//generic type declaration
		listName.add("Kavita");
		listName.add("Manish");
		listName.add("Nimesh");
		listName.add("Jyoti");
		for(int i=0;i<listName.size();i++){
			listName.set(i,listName.get(i).toUpperCase());
			System.out.println(listName.get(i));
		}
		

	}

}
