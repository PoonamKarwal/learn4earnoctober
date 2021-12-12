package com.java.basics;

       public class Increment_decrement {

	   public static void main(String[] args) {
			int i = 10; // latest value of i 10
			i = 20; // latest value of i is 20

			int j = i++; // latest value of j is 20 and latest value of i is 21
			System.out.println("the latest value of i is " + i);
			System.out.println("the latest value of j is " + j);

			int k = ++j; // latest value of j is 21,latest value of k is 21
			System.out.println("the latest value of k is: " + k);
			System.out.println("the latest value of j is: " + i);
			int l = k++ + ++k;// latest value of k is 21 and latest value of l is
			int m = l++;

			System.out.println(i);
			System.out.println(j);
			System.out.println(k);

			System.out.println(l);
			System.out.println(m);
		}
	}
//++i pre increment
//i++ post inc
//--i pre decre
//i-- post decre
//Two principles * Left to right and second is Latest value choose