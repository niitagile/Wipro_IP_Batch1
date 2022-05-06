package GenericsExample;

class Addition<T>{
	T a, b;
	Addition(T a, T b){
		this.a=a;
		this.b=b;
	}
	
	void display() {
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}


public class GenericClassExample1 {
	public static void main(String[] args) {
		Addition<Integer> obj=new Addition<>(5,6);
	obj.display();
		
		Addition<Float> obj1=new Addition<>(5.5f,6.8f);
		obj1.display();
	}

}
