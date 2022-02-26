package com.syntax.class12;

public class EvenOddNumber {
	void checkValue(int value) {
		if (value %2 ==0) {
			System.out.println(value + " is even");
		}else {
			System.out.println(value + " is odd");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         EvenOddNumber obj= new EvenOddNumber();
         
         obj.checkValue(40);
         
	}

}
