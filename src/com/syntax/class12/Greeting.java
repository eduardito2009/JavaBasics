package com.syntax.class12;

public class Greeting {
	
	void sayHello(String name) {
		System.out.println("Hello "+ name);
	}
	void sayHelloManyTimes(String name) {
		for (int i=0;i<5;i++) {
			System.out.println("Hello "+ name);
		}
		
	}
	void sayHelloNumberOfTimes(String name,int times) {
		for (int i=0;i<times;i++) {
			System.out.println("Hello "+ name);
		}
		
	}
// method inside of a class Greeting
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeting greeter=new Greeting();
		greeter.sayHelloNumberOfTimes("Christian",10);
				

	}

}
