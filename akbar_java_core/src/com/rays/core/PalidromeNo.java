package com.rays.core;

public class PalidromeNo {
	
	public static void main(String [] args) {
		
		int i = 121;
		int temp = i;
		int r = 0;
		int rnum = 0;
		
		while(temp> 0) {
			
			r = temp % 10;
			rnum = rnum * 10 + r;
			temp = temp / 10;
			
		}
		
		if (i == rnum) {
			
			System.out.println(i + " is Palidrome");
		}else {
			
			System.out.println(i + " is not palidrome");
		}
		
	}

}
