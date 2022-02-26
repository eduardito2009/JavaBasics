package com.syntax.class06;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner day=new Scanner(System.in);
		
		System.out.println("Please enter numerical value of todays day.");
		 
		 
		int whatDay=day.nextInt();
		 
		 if(whatDay>=1 && whatDay<=5) {
			 System.out.println("It is a weekday");
		 }else if (whatDay==6 || whatDay==7) {
			 System.out.println("It is weekend");
			 
		 }else {
			 System.out.println("Invalid day");
		 }
		
				

	}

}
