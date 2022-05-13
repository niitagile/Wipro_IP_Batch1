package StreamsExample;

import java.util.*;  
class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class FilterExample {  
    public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",30000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        // This is more compact approach for filtering data  
     /*  productsList.stream()  
                             .filter(product -> product.price == 30000)  
                             .forEach(product -> System.out.println(product.name)); */
        
        
        //reduce all result to a report. reduce -- it reduces the output to 1 value
    /* float totalPrice2 = productsList.stream()  
                .map(product->product.price)
                .reduce(0.0f,Float::sum);   // accumulating price, by referring method of Float class  
        System.out.println(totalPrice2); //203000.0*/
      
     
        
        
        //find max price product details
        Product productA = productsList.stream()  
               .max((product1,product2)-> product1.price > product2.price ? 1: -1 ).get();
 
        	System.out.println(productA.price); 
        
    }  
}  