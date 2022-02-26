package com.syntax.class14;

import java.util.Scanner;

public class CreateCredentials {

	public static void main(String[] args) {
		
//Accept username, password and confirm password from a user and check following requirements:
		//Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
				//Password should be minimum 8 characters, if less → message=”Password is too short”.
				//Password cannot contain username if so, → message=”Password cannot contain username”.
				//Password should match confirmed password, if not  → message=“Passwords do not match”.
				//Only after all requirements met → message “Your username and password has been created”
	System.out.println("Please enter username");
      Scanner scan=new Scanner(System.in);
      String username=scan.nextLine();
      System.out.println("Please enter password");
      String password=scan.nextLine();
      
      if(username.isEmpty()&& password.isEmpty()){
    	  System.out.println("username and password cannot be empty");
      }else if(password.length()<8) {
    	  System.out.println("password is to short");
      }else if(password.contains(username)) {
    	  System.out.println("password cannot contain username");
      }else {
    	  System.out.println("confirm password");
    	  String confirmPassword=scan.nextLine();
      }if (password.equals("confirmPassword")) {
    	  System.out.println("Passwords do not match");
      }else {
    	  System.out.println("Your username and password has been created");
      }
      		
      
      
      
	
	
	
	}

}
