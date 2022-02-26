package com.suntax.class11;

import java.util.Arrays;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a 2D array of integer values. Print the sum of all numbers
		//Pseudo programming
		//create the 2D array
		//Print the sum of all numbers
		
		//Create the 2D array
		int[][] array2D= {{10,10,10},{10,10,10},{10,10,10,}};
		//print out the elements of an array with out a loops
		
		//sum all the elements of the array
		int sum=0;
				for(int x=0;x<array2D.length; x++) {
					System.out.println(Arrays.toString(array2D));
					for(int y=0;y<array2D.length; y++) {
						sum=sum+array2D[x][y];
	}

}
				System.out.println("Sum of array element is " +sum);
}
}