package com.java.basics;

           public class If_else {

	       public static void main(String[] args) {
		
				/*
				 * int i =10; int j = 20; int k = 30;
				 * 
				 * //WAP to find largest number using if else
				 * 
				 * if (i>j &j>k) { System.out.println("i is the largest "); }else if(j>i&i>k) {
				 * System.out.println("j is the largest"); }else {
				 * System.out.println("k is the largest"); }
				 * 
				 * }
				 */

//while loop are used we need to iterate a certain condiitn multiple no. of times
//step1 : initilise
//step2: aplly the condition
//step3 : inc/dec
				int i = 1;

				while (i < 10) {
					System.out.println("the value of i os :" + i);
					i = i++; // infinite
					i = i + 1;// finite
					i = ++i; // finite
					int j = 2;
					while (j != 0) {
						System.out.println("My statemnet is true");
						j = j + 1; // infinite
						j = j - 1; // finite
					}

				}
			}
		}