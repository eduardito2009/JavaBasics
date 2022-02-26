package com.suntax.class11;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][] array2D= {{2,3,4},{5,6},{12,6,8,}};
int sumEven=0;
int sumOdd=0;

		
		
		//check if element is even if it is add it to sumEven variable
        //check if element is odd if it is add it to oddEven variable
       //Print the value for both
		for (int x=0; x <array2D.length;x++) {
			
		 for(int y=0;y<array2D[x].length; y++) {
				
					int element=array2D[x][y];
						if(element%2==0) {
							sumEven+=element;
						}else {
							sumOdd+=element;
							System.out.println(element);
						}
	}

}
		System.out.println("Sum of Even numbers " +sumEven);
		System.out.println("Sum of Odd numbers " +sumOdd);
	}
	
	
	
	



	}


