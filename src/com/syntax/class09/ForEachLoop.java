package com.syntax.class09;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cities= {"Washington DC", "Miami", "Los Angeles", "New York"};
		
		
		for(String city:cities) {
			System.out.println(city);
		}
	
		System.out.println("-----------------");
	int [] numbers= {10, 20, 30, 40};
	
	for (int num:numbers) {
		System.out.println(num);
	}
	System.out.println("-----------------");
	char[]grades= {'A', 'B', 'C','D'};
	 for (char grade:grades) {
		 System.out.println(grade+" ");
	 }
	 System.out.println("-----------------");
	 // for (dataType varName:nameOfTheArray){
	 // System.out.println("varName");
	 String[] countries= {"USA","Canada","Afghanistan", "Moldova", "Morroco"};
	 for (String country:countries) {
		 System.out.println(country);
		 
		}
	 }
	
	}
	


