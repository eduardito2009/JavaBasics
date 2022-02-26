package com.syntax.class09;

public class HomeWork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create an array of animals and store 5 elements into it. Using 2 different loops 
		String[] animals= {"dog", "cat", "duck", "monkey", "Bear"};
		for (int a=0; a<animals.length; a++) {
			System.out.print(animals[a]+" ");
			
	}
		System.out.print("-------------------");

		
		String[] animals1= {"dog", "cat", "duck", "monkey", "Bear"};
		for (String animal:animals) {
			System.out.println(animal);
		}
		
	}
	}
