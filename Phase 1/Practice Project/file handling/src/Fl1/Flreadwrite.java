package Fl1;
import java.io.*;
public class Flreadwrite {
	
	public static void main(String[] args) throws IOException {
		FileInputStream r= new FileInputStream("C:\\Users\\Biswa Bhusan Dash\\eclipse-workspace\\file handling\\reading file.txt");
		FileOutputStream w = new FileOutputStream("C:\\Users\\Biswa Bhusan Dash\\eclipse-workspace\\file handling\\copied.txt");
		
		int i;
		
		//read value character by character and returns value-1
		while ((i=r.read())!=-1) {
			
			//to know the value of each character
			System.out.println(i);
			//write the value in the 
			w.write((char)i);
			
			
		}
		
		System.out.println("Text copied successfully");
	}
	

}
