package GenericsExample;
public class GenericMethodTest2 {
   // generic method printArray
  static void print(int arr[]) {
	  for(int val : arr)
	  System.out.println(val);
  }
  static void print(float arr[]) {
	  for(float val : arr)
	  System.out.println(val);
  }
  static void print(String arr[]) {
	  for(String val : arr)
	  System.out.println(val);
  }
   public static void main(String args[]) {
     int arr[]= {1,2,3,4};
     float farr[]= {5.6f,4.5f,6.7f};
     String sarr[]= {"Neel","Mohit","Ritesh"};
     print(arr);
     print(farr);
     print(sarr);
     
   }


}