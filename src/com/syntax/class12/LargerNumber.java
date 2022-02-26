package com.syntax.class12;

public class LargerNumber {
	void largerNumber(int num1, int num2) {
		if(num1>num2) {
			System.out.println(num1+ " is larger");
		}else {
			System.out.println(num2+ " is larger");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         LargerNumber obj=new LargerNumber();
         obj.largerNumber(50, 100);
	}

}
