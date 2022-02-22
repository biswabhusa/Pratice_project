package com.emailid;
import java.util.*;
import java.util.regex.*;
public class Emailid {


		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			// Email list :
			String list[]= {"biswabhusandash8@gmail.com","miku@gmail.com","ram@gmail.com"};
			//Email pattern :
			String pattern="([a-z0-9]+)@gmail.com";
			Pattern p=Pattern.compile(pattern);

			while(true) {
			// User input Email :
			System.out.println("Enter your Email :");
			String Email=sc.next();
			Matcher m=p.matcher(Email);
			// Matching Email in correct format :
			boolean b=m.matches();
			if(b==true) {
				//After matched checking the email from list : 
				 boolean c=Arrays.asList(list).contains(Email);
					if(c==true) {
						System.out.println("Your Email id is Successfully Authenticate\n 'Thank you'");
					break;
					}
					else System.out.println("Your Email id is not Authenticate");
				}
			
			// 
			else {
				System.out.println("Please Enter valid email ID \n 'Try again :'");
			//Used to repeat the above code if Email is in wrong format :
			System.out.println("Repeat again?(y/n) :");
			char c=sc.next().charAt(0);
			if(c=='y'||c=='Y') continue;
			else
				System.out.println("...Thank you...");
			break;
				}
			}
		}
	}