package com.syntax.class06;

import java.util.Scanner;

public class Task1 {


	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Which country are you coming from");
		
	String country=scan.next();
	String language=null;
	 switch(country) {
	 case"Brasil":
		 language="portuguesse";
		 break;
	 case"USA":
		 language="English";
		 break;
	 case"Germany":
		 language="Deutsch";
		 break;
		 default:
			 language="Unknown";
	 }
	 System.out.println(" In " + country + " people speak " + language);
		 
		 
	 }
	
		

	}


