package com.syntaxclass03;

public class IfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scenario: I need to compare 2 numbers and I have to find which is bigger
		 */
		
		int numb1=100;
		int numb2=50;
		
		if (numb1>numb2) {
			System.out.println(numb1 +" is larger than " +numb2);
			
		}
		double money=5;
		double coffee=4.99;
		
		// If I have more money than a price of the coffee--> I am buying coffee
		
		if (money>coffee) { // {}inside block of code when condition is true
			System.out.println("I am buying the coffee");
		}
		
		// if(money=coffee){Error because if condition always must be boolean
		// wes use double--> because of the wrong operator//}

	}

}
