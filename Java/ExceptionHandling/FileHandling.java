package exception_Handling.Arrays;
import java.io.*;
public class FileHandling {

	public static void main(String[] args) throws IOException {
		FileInputStream fin=null;
		try {
			fin=new FileInputStream("abc.txt");
			int num;
			while((num=fin.read())!=-1){
				System.out.println((char)num);
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		finally{
			
			
			fin.close();}
	}

}
