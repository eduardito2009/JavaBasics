package com.syntax.class10;

public class ReviewArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Array- collection/group/container of values of same data Type
		 * Values inside array called elements
		 * Elements inside array stored based on indexes.
		 * First index in Array starts from 0
		 * int[] numbers=new int[3];
		 * numbers[0]=10;
		 * numbers[1]=20;
		 * System.out.println(numbers[3]); indexOutOfBond
		 * ---------------------------------------------------
		 * String[] weather={"hot", "cold", "rainy",}
		 * weather.length
		 * 
		 */
         int[] numbers= {15, 45, 10, 32};
         int size=numbers.length;
         int sum=0;
         for (int i = 0; i<size; i++) {
        	 sum+= numbers[i];
         }
	System.out.println("Sum of all elements in the array = " + sum);
	
	}
	

}
