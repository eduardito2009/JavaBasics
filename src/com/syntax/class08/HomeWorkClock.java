package com.syntax.class08;

public class HomeWorkClock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String time;
	for (int h=0; h<=24;h++) {
	
	
	 for (int min=0; min<=59;min++) {
		if(h<10 && min<10) {
			time="0"+h+":"+"0"+min;
			
		}else if (h<10 && min>10) {
			time="0"+h+":"+min;
			
		}else if (h>=10 && min<10) {
			time=h+":"+"0"+min;
			
		}else {
			time=h+":"+min;
			

		}
	 
		System.out.println(time);
	  
		  
	   
		   
		
	   
	
	   }
	 }
	}
	}	

	

