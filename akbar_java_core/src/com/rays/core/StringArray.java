package com.rays.core;

public class StringArray {
	
	public static void main(String [] args) {
		
		String []str = { "ram", "Akbar", "lucky", "amit", "Salman"};
		
		System.out.println("Length of string =  " + str.length);
		
		System.out.println("Find name ram = " + str[0]);
		
		System.out.println("----For Each loop---");
		
		for (String b : str)
		{
			System.out.println(b);
			
			
		}		
	}

		
		
}
