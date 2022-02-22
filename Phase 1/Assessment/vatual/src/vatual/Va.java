package vatual;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Va {

	public static void main(String[] args)throws IOException {
		
		//-------------------create a new file-----------------------/
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the file name you want to create: ");
		
		String name=sc.nextLine();
		String path="C:\\Users\\Biswa Bhusan Dash\\eclipse-workspace\\vatual";
		//System.out.println(path+name);
		File f1=new File(path+name);
		f1.createNewFile();
		System.out.println("File created");
		

	//-------------------search a file-----------------------/
		System.out.println("Enter the file name that you want to search");
		String name1=sc.nextLine();
		File f3=new File(path+name1);

		if(f3.exists()){
		System.out.println("File " + f3.getName() + " exists in the directory");
			}
		else {
	    System.out.println("File do not exists");
			}


	//-------------------display the list of files in asc order-----------------------/
			File f=new File("C:\\Users\\Biswa Bhusan Dash\\eclipse-workspace\\vatual");
			String contents[] = f.list();
			
			System.out.println("File List in the current Directory: ");
			for(int i=0;i<contents.length;i++){
				System.out.println(contents[i]);
			}
			

	//-------------------delete a new file-----------------------/

			System.out.println("Enter the file name that you want to delete: ");
			String name2=sc.nextLine();
			File f2=new File(path+name2);
			
			if(f2.exists()){
				f2.delete();
				System.out.println("File " + f2.getName() + " is deleted");
			}
			else {
		        System.out.println("Delete operation failed");
		    }

	System.exit(0);

	}



		}