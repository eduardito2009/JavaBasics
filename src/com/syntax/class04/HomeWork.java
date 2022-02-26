package com.syntax.class04;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		System.out.println("Please eneter your city");
		 
		String city=input.next();
		System.out.println("Please enter temperature");
		int farenheight, celsius;
		farenheight = input.nextInt();
		
		celsius=((farenheight-32)*5)/9;
		System.out.println("The temperature in " + city+ "is" + celsius);
		
		
		 
		
		
		
	
		
		
		
	
		
		
		
		
		

	}
	

}
