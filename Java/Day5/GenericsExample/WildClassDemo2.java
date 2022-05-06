package GenericsExample;

import java.util.ArrayList;

abstract class Shape{
	abstract void draw();
}
class Square extends Shape{

	@Override
	void draw() {
		System.out.println("Print Square");
		
	}
	
}

class Rectangle extends Shape{

	@Override
	void draw() {
		System.out.println("Print Rectangle");
		
	}
	
}
public class WildClassDemo2 {

	
	public static void drawAll(ArrayList<? extends Shape> list) {
		for(Shape obj : list) {
			obj.draw();
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Rectangle>list=new ArrayList<>();
		list.add(new Rectangle());
		list.add(new Rectangle());

		ArrayList<Square>list1=new ArrayList<>();
		list1.add(new Square());
		list1.add(new Square());
		
		drawAll(list);
		drawAll(list1);
	}

}
