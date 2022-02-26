package com.syntax.class08;

public class IfElseDeno6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String day="Sunday";
		if(day.equals("Sunday")) {
			System.out.println("Its weekend");
		}else if(day.equals("Saturday")) {
			System.out.println("Its weekend");
		}else {
			System.out.println("Its week day");
		}
				
if(day.equals("Sunday") || day.equals("Saturday")) {
	System.out.println("Its weekend");
}else {
	System.out.println("Its weekday");
}
	}

}
