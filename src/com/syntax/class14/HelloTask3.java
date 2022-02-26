package com.syntax.class14;
// 
public class HelloTask3 {
	String sayHello(String country) {
		switch(country) {
		case"USA":
			return"Hello";
			
		case"France":
			return"Bonjour";
			
		case "Spain":
			return"Hola";
			default:
				return"Unknown";
			
					
			
		}
	}
	
	public static void main(String[] args) {
		HelloTask3 object=new HelloTask3();
		String country=object.sayHello("Spain");
		System.out.println(country);

	}

}
