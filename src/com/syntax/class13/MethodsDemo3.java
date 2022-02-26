package com.syntax.class13;

public class MethodsDemo3 {
	// int will specify the datatype that method will return
	//squareTheNumber name of the method
	//(int number) parameters of the method
	//return tell java what to return from this method
	int squareTheNumber(int number) {
		return number*number;
	}
int returnTheSameNumber(int number) {
	
	return number;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
MethodsDemo3 obj=new MethodsDemo3();//Object creation
int result=obj.squareTheNumber(3);
System.out.println(result);
System.out.println("____________________________");
//Object creation
int memo =obj.returnTheSameNumber(5);
System.out.println(memo);


	}

}
