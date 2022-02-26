package com.syntax.class09;

public class HomeWork4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []numbers=new int[3];
		numbers[0]=100;
		numbers[1]=200;
		numbers[2]=300;
		  
		  if (numbers[0]>numbers[1] && numbers[1]>numbers[2]) {
			  System.out.println(numbers[0]+ " is the largest");
		  }else if (numbers[1]>numbers[0] && numbers[1]>numbers[2]) {
			  System.out.println(numbers[1]+ " is the largest");
		  }else if (numbers[2]>numbers[0] && numbers[2]>numbers[1]) {
			  System.out.println(numbers[2]+ " is the largest");

	}

}
}