package com.syntax.class13;

public class MethodsDemo4 {
	
	double checkDiscount(boolean isSaleOn, double originalPrice, double discount ) {
		if(isSaleOn) {
			return (originalPrice-originalPrice*discount);
			
		}else {
			return originalPrice;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsDemo4 obj=new MethodsDemo4();
		System.out.println(obj.checkDiscount(false, 100, .15));
		System.out.println(obj.checkDiscount(true, 100, .15));

	}

}
