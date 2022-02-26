package com.syntax.class09;

public class HomeWork1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Create an array of cars and store 6 elements into it. Using 2 different loops
		
		String[] cars=new String[6];
		
		cars[0]="BMW";
		cars[1]="Buggati";
		cars[2]="Ferrari";
		cars[3]="Lexus";
		cars[4]="Honda";
		cars[5]="Toyota";
		System.out.println(cars[0] + " "+ cars[1] + " " +cars[2]+ " "+cars[3]+" "+cars[4]+" "+ cars[5]);
		
		System.out.println("-----------------------");
		
		
	
		String[] brands= {"BMW","Buggati","Ferrari","Lexus","Honda","Toyota"};
		
		System.out.println("My favorite car is "+ brands[1]);
	}
}