package com.syntax.class09;

public class AllValuesFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] grade= {'A','B','C','D'};
		
		int size=grade.length;
		System.out.println("Numbers of elements is="+ size);
		
		//System.out.println(grade[1]);
		//System.out.println(grade[2]);
		//System.out.println(grade[3]);
		
		for (int i=0; i<=grade.length;i++) {
			//System.out.println(grade[i] + " ");
			
		}
		
		System.out.println("---------------- ");
		String[] cities= {"Washington DC", "Miami", "Los Angeles", "New York"};
		
		for (int a=0; a<cities.length; a++) {
			System.out.println(cities[a]+" ");
			
		}

	}
}