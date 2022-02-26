package com.syntax.class09;

public class ArrayIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1;
		// creating an Array that hold 4 elements(values)
		int []numbers=new int[4];
		// storing values/elements inside an array
		
		numbers[0]=90;
		numbers[1]=87;
		numbers[2]=89;
		numbers[3]=99;
		
		System.out.println(numbers[3]+numbers[0]);// 189 addition

		
		// I want to create an array of countries
       String[] countries=new String[5];
       countries[0]="USA";
       countries[1]="CANADA";
       countries[2]="Afghanistan";
       countries[3]="Moldova";
       countries[4]="Morroco";
       
       System.out.println(countries[3]+countries[4]);
       
       String[] names=new String[5];
       
       names[0]="Orsan";
       names[1]="Gulnar";
       names[2]="Zakirullah";
       names[3]="Christian";
       names[4]="Asel";
       // create an array to store different prices
       
       double []price= new double[4];
       
       price[0]=5.99;
       price[1]=3.99;
       price[2]=2.99;
       price[3]=4.99;
       System.out.println(price[1]+price[2]+price[3]+price[0]);  

	}

}
