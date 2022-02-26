package com.syntax.class02;

public class CreatingVariables {

	public static void main(String[] args) {
		/* create a variable and assign a value
		 * 
		 * Declare a variable and initialize
		 */
	int age=25;


    int num;// declare a variable
    num=10; // initialize it
    int n1, n2, n3;
    
    n1=10;
    n2=20;
    n3=30;
    // Can I change a value of the variable?
    age=26; //reassigning the value of variable age
    System.out.println(age);
    // Java rules for identifiers
    
    // boolean break=false; Error --> do not use keyword as identifiers first rule
    // char 1character='A'; --> Error do not start identifier with a number or special characters second rule
    // Java allows you to use underscore or dollar sign as identifier
    double $price=1.99;
    double _value=2.99; // But preferable don't use $ or_ 
    // not rules, but we prefer to follow
    /*variable names  and methods should start with lower case
     * give variable a meaningful name
     */
	}
	
	
}