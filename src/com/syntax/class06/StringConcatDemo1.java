package com.syntax.class06;

public class StringConcatDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="10";
		int number1=10;
		char letter1='A';
		System.out.println(letter1+name+number1);
		
		System.out.println(letter1+number1+name);
		
		System.out.println(10+10+"10");
		//"10" has been treaded as a String because of the quotation 

		System.out.println(10+10+"10"+10+10);
		System.out.println(10+10+"10"+(10+10));


	}

}
