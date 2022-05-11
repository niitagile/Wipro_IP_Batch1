package collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;
public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> listName=new ArrayList<>();
		listName.add("Kavita");
		listName.add("Manish");
		listName.add("Nimesh");
		listName.add(1,"Jyoti");
		
	//listName.add(67);
		System.out.println(listName);
		//System.out.println((Integer)listName.get(4)+10);
		System.out.println("Element present="+listName.contains("Manish"));
		listName.remove(2);
		System.out.println(listName);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*ArrayList <String>listName=new ArrayList<>();//generic type declaration
		listName.add("Kavita");
		listName.add("Manish");
		listName.add("Nimesh");
		listName.add(1,"Jyoti");
		//listName.add(67);
		System.out.println(listName);
		System.out.println(listName.contains("Neha"));
		
		ArrayList<String> list=new ArrayList<>();
		list.addAll(listName);
		list.add("Ritu");
		//list.clear();
		//list.remove("Nimesh");
		//System.out.println(list);
		
		/*Vector<String> v=new Vector<>();
		LinkedList<String> l=new LinkedList<>();*/
		
		//ArrayList <char>listName=new ArrayList<>();//Error
		
		/*ListIterator lt=list.listIterator();// readonly but forward and backword
		while(lt.hasNext())
			System.out.println(lt.next());
		while(lt.hasPrevious())
			System.out.println(lt.previous());
		
		Iterator it=list.iterator();// readonly and forward only
		while(it.hasNext())
			System.out.println(it.next());
		
		
		for(String obj : list)
			System.out.println(obj);
		
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}*/
		
	}

}
