package com.syntax.class07;

public class ForLoopsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=3; i++) {
		System.out.println("Hello "+i);
		}
		
		/*i=1 is the condition
		 * i<=3 is the time we want the code to repeat
		 * i++/ -- is increment or decrement
		 */
        System.out.println("   MUTIPLICATION TABLE   ");
        
        /*3 X 1 =3
         * 3 x 2 = 6
         * 3 x 3 =9
         * 
         */
	int num=3;
	int result;
	
	for(int i=1; i<=10; i++) {
		
		result=num*i;
		 System.out.println(num+ " x "+i+ " = "+result);
	}
	
	System.out.println("   -  WHAT IS THE OUTPUT-  ");
	
	for(int i=0; i<=10; i+=3) {
	
	System.out.print(i+" ");
	
	
	}
	System.out.println("   -  WHAT IS THE OUTPUT-  ");
	int sum=0;
	
	for(int i=1; i<=5; i++) {
		
		sum+=i;
		System.out.print(sum);//Syso inside brackets prints 5 times
				                //Syso outside brackets prints 1 time
	}
	System.out.println("   -  WHAT IS THE OUTPUT-  ");
	
	int value=1;
	for(int i=1; i<4; i++) {
		value*=i;
		
		
	}

	}
	

	
}


