package com.syntax.class12;


	

public class Phone {
	String name;
	String model;
	String color;
	String memory;
	
	void call() {
		System.out.println("iPhone is calling ");
	}
	void message() {
		System.out.println("iPhone is messaging");
	}
    void searching() {
    	System.out.println("iPhone is searching for address");
    }
    void printComplteInfo() {
    	System.out.println("name= "+ name);
    	System.out.println("name= "+ model);
    	System.out.println("color= "+ color);
    	System.out.println("memory= "+ memory);
    	

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone iPhone= new Phone();
		 iPhone.name="iPhone";
		 iPhone.model="12 Pro Max";
		 iPhone.color="black";
		 iPhone.memory="257 GB";
		 iPhone.call();
		 iPhone.message();
		 iPhone.searching();
		 
		 
		 
		 iPhone.printComplteInfo();
		 System.out.println("*********************");
		 
		 Phone pixel= new Phone();
		 pixel.name="Pixel";
		 pixel.model="Pixel Pro";
		 pixel.color="pink";
		 pixel.memory="127 GB";
		 
		 pixel.printComplteInfo();
		 System.out.println("*********************");
		 
		Phone nokia= new Phone();
		nokia.name="nokia";
		nokia.model="nokia 360";
		nokia.color="black";
		nokia.memory="64 GB";
		
		nokia.printComplteInfo();
		
		
		 
		 
		 
		


		
	}

}
