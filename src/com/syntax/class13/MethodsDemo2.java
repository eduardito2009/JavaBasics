package com.syntax.class13;

public class MethodsDemo2 {
	//create a method that takes an animal name and person name if name is equal to Teyfur and animal is Horse
	//print camel other wise print horse
	
	void TeyfurandHorse(String personName, String animalName) {
		if ("Teyfur".equals(personName)&& "Horse".equals(animalName)) {
			System.out.println("This is a camel");
		}else if ("Horse".equals(animalName)) {
			System.out.println("This is a horse");
		}
	}
	public static void main (String[] args) {
		MethodsDemo2 obj=new MethodsDemo2();
		obj.TeyfurandHorse("Teyfur", "Horse");
		obj.TeyfurandHorse("Tarik" , "Horse");
	}


}
