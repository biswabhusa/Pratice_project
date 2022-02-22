package Fl;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Flappend {

	public static void main(String[] args) throws IOException {
		
		FileWriter a = new FileWriter("C:\\Users\\Biswa Bhusan Dash\\eclipse-workspace\\file handling\\WritingFile.txt",true);
		BufferedWriter b= new BufferedWriter(a);
		b.write("I am biswabhusan dash");
		b.newLine();
		b.close();
	    a.close();
	    System.out.println("File appended");
	}
}
