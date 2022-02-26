package com.syntax.class10;

public class HomeWorkReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//From an array of integer elements find the largest numbers.
		
		int[] number = { 15, 45, 10, 32};
		
		int largest= number[0];
		//start with one we don't need to compare 15 with 15
		for (int n = 1; n < number.length; n++) {
			if (number[n] > largest) {
				largest = number[n];
			}
		}
	System.out.println(largest);
	largest = number[0];
	
	 for (int num:number) {
		 if(num > largest) {
			 largest=num;
		 }
	 }
	 System.out.println(largest);
	
	}

}
