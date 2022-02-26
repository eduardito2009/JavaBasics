package com.syntax.class06;

import java.util.Scanner;

public class CalculatorProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Please enter the first number");
		double num1=scan.nextDouble();
		
		System.out.println("Please enter the operator");
		String operator=scan.next();
		
		System.out.println("Please enter the second number");
		double num2=scan.nextDouble();
		
		double result=0;
		switch(operator) {
		case"+":
			result=num1 + num2;
			break;
		case"-":
			result=num1 - num2;
		case"*":
			result=num1 * num2;
			break;
		case"/":
			result=num1 / num2;
			break;
			default:
				System.out.println(" Invalid Operator");
			
		}
		System.out.println(num1+ "" + operator + "" + num2 + "=" + result);
		

	}

}
/******************************************************/

             //review task with Asel
  


