package exception_Handling.Arrays;

import java.io.FileInputStream;
import java.io.IOException;

public class FileHandling2 {

	public static void main(String[] args) {
		
		try(FileInputStream fin=new FileInputStream("abc.txt");) {
			
			int num;
			while((num=fin.read())!=-1){
				System.out.println((char)num);
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

	}

}
