package com.syntax.class13;

public class MethodsDemo1 {
  void checkEvenOdd(int number) {
	  
	  //void is type of methods that don't return anything when called
	  //checkEvenOdd is the name of the method
	  
	  if(number%2==0) {
		  System.out.println("Even");
	  }else {
		  System.out.println("Odd");
		  
	  }
  }
void checkWeather(boolean isRaining) {
	if (isRaining) {
		System.out.println("I am staying home");
		
	}else {
		System.out.println("Lets go for a walk");
	}
}

	  
  
  public static void main(String[] args) {
	  
	  MethodsDemo1 object1=new MethodsDemo1();
	  object1.checkEvenOdd(120);// 12 is the int value on public class 
	  object1.checkEvenOdd(3);
	  object1.checkEvenOdd(7);
	  

	  		
}
}
