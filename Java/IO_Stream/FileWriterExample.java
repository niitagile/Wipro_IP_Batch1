package IO_Classes;
import java.io.*;
public class FileWriterExample{
public static void main(String args[])  {
FileWriter f= null;
try{
 	f =new FileWriter("D:\\register.txt");
	char c[]= "We want to do fun".toCharArray();
  	f.write("Hello ");
	f.write(c,0,12);
	f.write("\n ");	 
	f.write("XYZ");
 
} catch(IOException ioe){} 
finally{
	try{	if(f!=null)f.close();} 
	catch(IOException e){}} 
 }}
