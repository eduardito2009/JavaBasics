package com.syntaxclass03;

public class ShortandOperatorsjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// = means assignment operator
		// +, -, *, /, % 
		
		int num=100;
		num=num+100;
		
		num+=100; // This means exactly the same as --> num=num+100
		
		System.out.println(num);// 300
		
		int num1=50;
		num1=num1+500;
		System.out.println(num1);
		num1+=200;
		System.out.println(num1);
		num1-=60;
		System.out.println(num1);
		int cakePiece=11;
		cakePiece=cakePiece/4;
		System.out.println(cakePiece);
		int cake=25;
		cake%=7;
		System.out.println(cake);
				
		

	}

}
