package com.syntax.class06;

public class ArithmeticDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    /**
     *  +, -, * , /, %
     *  
     */
		
		int number1=10;
		int number2=10;
		System.out.println(number1+number2);
		
		String name="Abdul";
		String name2="Gulnar";
		System.out.println(name+name2);
		char letter1='A';
		char letter2='B';
		
		/***************************/
		
		System.out.println(number1*number2);
		System.out.println((int)'A');// finding the value of char A, AscII table A=65
		//System.out.println(name*name2);not defined for this case
		System.out.println(letter1*letter2);
		
		int number3=10;
		int number4=3;
		double number5=10;
		double number6=3;
		System.out.println(number3/number4);
		System.out.println(number5/number6);
		/********************************************/
		
		double f=5.3;
		if(f==5.3f) {
			System.out.println("Magic");
			
		}else {
			System.out.println("Simple math");
		}
	}

}
