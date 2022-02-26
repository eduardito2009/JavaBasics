package com.syntax.class06;

import java.util.Scanner;

public class CalculatorIfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the first number");
		int num1=scan.nextInt();
		
		System.out.println("Please enter the operator");
		char operator=scan.next().charAt(0);
		
		System.out.println("Please neter the second number");
        
		int num2=scan.nextInt();
		int result=0;
		if (operator == '+') {
			result =num1+num2;
		}else if(operator=='-') {
			result =num1-num2;
		}else if(operator =='*') {
			result =num1*num2;
		}else if(operator =='/') {
			result =num1/num2;
		}else {
			System.out.println("Error");
		}
		System.out.println(num1+ "" + operator + "" + num2 + "=" + result);
		
	}
/********************************************************************/
}

