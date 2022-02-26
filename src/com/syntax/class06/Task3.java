package com.syntax.class06;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Is there any sale");
		
		String answer=scan.next();
		switch(answer) {
		case"no":
			System.out.println("you are not going for shopping");
			break;
		case"yes":
			System.out.println("Please enter item price");
			double price=scan.nextDouble();
			double percent;
			if (price<20) {
				percent=0.10;
			}else if(price>=20 && price<=100) {
				percent=0.20;
			}else if(price>100 && price<500) {
				percent=0.30;
			}else {
				percent=0.50;
			}
			double discount=price*percent;
			double priceAfterDiscount = price-discount;
			System.out.println("After the discount $" + discount + "the price reduce from $" + price + "to $" + priceAfterDiscount);
		break;
		default:
			System.out.println(" Please enter a valid answer!");
		}
		
		
		
		

	}

}
