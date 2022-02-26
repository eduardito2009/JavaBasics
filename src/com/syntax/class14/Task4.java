package com.syntax.class14;

public class Task4 {
	String createEmail(String userName, String lastName, String emailType) {
		return userName+lastName+"@"+ emailType+ " .com";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Task4 obj=new Task4();
         System.out.println(obj.createEmail("chris", "miran", "gmail"));
	}

}
