package paracons;

public class Pcnstr {
	int id;  
	String name;  
	   Pcnstr(int i,String n)
	   { 
		    id = i;  
		    name = n;
		    
		    }  
	   void display(){System.out.println(id+" "+name);}  
	   
	public static void main(String[] args) {
		
		 Pcnstr p1 = new  Pcnstr(101,"Pravakar");  
		 Pcnstr p2 = new Pcnstr(102,"Rajesh");  
		p1.display();
		p2.display();

	}

}
