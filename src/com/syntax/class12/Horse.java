package com.syntax.class12;

public class Horse {
	//attributes, fields, properties
	String name;
	String breed;
	int age;
	double weight;
	// Behaviors, methods and functions
	void run() {
		System.out.println(name+ " is running");
	}
	void eat() {
		System.out.println(name+ " is eating");
	}
	
	void printCompleteInfo() {
		System.out.println("name ="+name);
		System.out.println("breed ="+breed);
		System.out.println("age ="+age);
		System.out.println("weight ="+weight);
	}

	public static void main(String[] args) {
		
		// lillysHorse is the object we are name the object
		//use a new key when we create the object
		Horse lillysHorse= new Horse();
		 lillysHorse.name="spirit";// Accessing the property name on object and setting its value
		 lillysHorse.breed="stallion";
		 lillysHorse.age=20;// Specific values we gave to the object
		 lillysHorse.weight=400;
		 lillysHorse.run();
		 //Everything that ends with a semicolon is a statement
		 
		 lillysHorse.printCompleteInfo();
		 System.out.println("************************");
		 Horse mrAsHorse= new Horse();
		 mrAsHorse.name="Tuzik";
		 mrAsHorse.breed="Mustang";
		 mrAsHorse.age=15;
		 mrAsHorse.weight=450;
		 mrAsHorse.run();
				 
		 mrAsHorse.printCompleteInfo();
		 
		

	}

}
