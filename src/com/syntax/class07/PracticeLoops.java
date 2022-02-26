package com.syntax.class07;

public class PracticeLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sumEven=0;
		int sumOdd=0;
		for(int i=1; i<=50; i++) {
			
			if(i%2==0) {
			
			sumEven=sumEven+i;
			}else {
				sumOdd=sumOdd+i;
				
			}
			
			System.out.println("The sum of all even numbers = "+ sumEven + " and the sum of all odd numbers = " +sumOdd);
		}
		
	}
	
}
