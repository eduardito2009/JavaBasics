package com.syntax.class08;

public class BreakKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=1; i<=5; i++) {
			System.out.println("I am code inside for loop");
			if(i==3) {
				
			
			break;// with break and output is print one time
			      // remove break output will print 3 times
			}
		}
         System.out.println("End of the code");
	}

}
