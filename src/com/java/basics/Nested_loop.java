package com.java.basics;

       public class Nested_loop {

			public static void main(String[] args) {
				// For loop inside afor loop is called Nested loop.
				// inner loop excutes completely with one exection of outer loop
				// outer loop excutes once --10
				// outer loop excutes 2nd time ---10
				/*
				 * for(int i = 1;i<=10; i++) { for (int j = 1; j<=10; j++) {
				 * System.out.println("j = " +j);
				 * 
				 * } System.out.println("for reputation of 1:" +i); }
				 * 
				 * }
				 * 
				 * }
				 */
				for (int i = 1; i <= 5; i++) {
					for (int j = 1; j <= i; j++) {
						System.out.println();

					}
					for (int j = 1; j <= i; j++) {
						System.out.print("1");
					}
				}
			}
		}