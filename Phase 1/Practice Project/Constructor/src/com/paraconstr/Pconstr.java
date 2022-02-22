package com.paraconstr;

public class Pconstr {
	int id;  
	String name;  
	   Pconstr(int i,String n)
	   { 
		    id = i;  
		    name = n;
		    
		    }  
	   void display(){System.out.println(id+" "+name);}  
	   
	public static void main(String[] args) {
		
		 Pconstr p1 = new  Pconstr(111,"biswa");  
		 Pconstr p2 = new Pconstr(112,"miku");  
		p1.display();
		p2.display();

	}

}
