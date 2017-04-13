package com.dremingdean.javaee;

public class InvertedTriangleStarPattern {

	public static void main(String[] args) {
		   int i, j;
	        i = 1;
	        while (i < 10) {
	            j = 1;
	            while (j < i) { 
	                System.out.print(" "); 
	                j++;
	            }

	            j = 1;
	            while (j <= (10 - i) * 2 - 1) { 
	                System.out.print("*");
	                j++;
	            }
	            i++;
	            System.out.println(); 
	        }
	}
}
