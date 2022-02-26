package com.syntax.class06;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter grade");
		
		
		  String grade=scan.next();
		  String explanation=null;
		   
		  switch(grade) {
		  case"A":
			  explanation="Excellent";
			  break;
		  case"B":
			  explanation="Good";
			  break;
		  case"C":
			  explanation="Average";
			  break;
		  case"D":
			  explanation="Bad";
			  break;
			  default:
				  explanation="Not Acceptable";}
		  System.out.println("If "+ grade+ " is " + explanation);
		  
			   
			  
			  
		  
		  }
		  
		   

	}


