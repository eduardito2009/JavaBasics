package com.syntax.class07;

import java.util.Scanner;

public class DoLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* create a secret number
		 * we want a user to guess our secret number
		 * 
		 * The moment user guessed my secret number--> my program should stop 
		 * Otherwise it should continue asking to guess my number
		 */
		
		int secretNumber=12;
		Scanner scan=new Scanner(System.in);
		int guessNumber;
		
		do {
			System.out.println("Please enter a number to win");
			guessNumber=scan.nextInt();
			
		}while(guessNumber!=secretNumber);
		System.out.println("Congratulations");
				
		

	}

}
