package com.rays.excepiton;

public class TestArthmeticExcepetion {
	
	public static void main (String[] args) {
	
	int a = 5;
	int b = 0;
	
	
	try {
	          int c = a/b;
	
         	System.out.println("C ="  + c);
	} catch(ArithmeticException e) {
		
		System.out.println("exception =" +e.getMessage());
	}

}
}