package IO_Classes;

import java.io.*;  
class FileOutputStreamExample{  
  public static void main(String args[]){  
   try{  
     FileOutputStream fout=new FileOutputStream("abc.txt");  
     String s="Siva is mad";  
     byte b[]=s.getBytes();//converting string into byte array  
     fout.write(b);  
     fout.close();  
     FileInputStream fin=new FileInputStream("abc.txt");
     int val,i=0;
     char arr[]=new char[fin.available()];//array length=file length
     //read data till End of File
     while((val=fin.read())!=-1){
    	 	arr[i]=(char)val;
    	 	i++;
     }
     //convert array to String
     String ans=new String(arr);
     System.out.println(ans);
     System.out.println("success...");  
    }catch(Exception e){System.out.println(e);}  
  }  
}  
