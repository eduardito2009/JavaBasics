package com.syntax.class10;

public class AllValuesFrom2Darray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              int[][] numbers= {
				
				{10,20,30,},// 0 d array
			 {100,200,300,400},// 1 d array
			{1000,2000}// 2 d array
	
              } ;
              int size=numbers.length;//when used with 2D array gives # of 1d Arrays that we stored
              System.out.println(size);
              
              int sizeOf1Array=numbers[0].length;
              System.out.println("Size of first array = " + sizeOf1Array);
              int sizeOf2Array=numbers[1].length;
              System.out.println("Size of second array = " + sizeOf2Array);
              int sizeOf3Array=numbers[2].length;
              System.out.println("Size of third array = " + sizeOf3Array);
             
	// Retrieving
	for (int i=0; i<numbers.length;i++) {
		for (int j=0;j<numbers[i].length; j++) {
			System.out.print(numbers[i][j]+" ");
		}
	}
	}
	}

