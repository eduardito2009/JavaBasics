package com.syntax.class06;

public class SwitchDemo2 {

	public static void main(String[] args) {
		
		char choice='y';
		String answer;
		
		
		  switch (choice) {
		  
		  case 'y':
			  
			  answer="Yes";
			  
			  break;
		  case 'n':
		  answer="No";
				  break;
		  case 'm':
			  answer="Maybe";
			  break;
			  default:
				  answer="unknown";
				  
			  
		  
				  
		  
		  }
		  System.out.println(answer);
		  
		  System.out.println("----------------");
		  /*
		   * declare a variable to store a car
		   * based on the value of the car define the country of origin
		   * 
		   */
		  String car="Toyota";
		  String country;
		  switch(car) {
		  case "BMW":
			  country="Germany";
			  
			  break;
		  case"Ford":
			  country="USA";
			  break;
		  case "Lada":
			  country="Russia";
			  break;
		  case"Toyota":
			  country="Japan";
			  break;
			  default:
				  country="Unknown";
				  
			  
		  }
		  System.out.println(car +" is from " +country);
		

	}

}
