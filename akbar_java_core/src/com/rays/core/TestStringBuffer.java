package com.rays.core;

public class TestStringBuffer {
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Akbar");
		
		System.out.println("sb = " +sb);
		
		sb.append(" mansuri");
		
		System.out.println("sb = "+ sb);
		
		sb.reverse();
		
		System.out.println("sb  = " +sb);
		
		sb.delete(3, 8);
		
		System.out.println("sb = " +sb);
		
		
		
		
		
	}

}
