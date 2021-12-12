package Metods_concept;

         public class Overloading {

	     public static void main(String[] args) {
				// Why main method is static?
				// Ans: The class overloading need not an create object of main
				// Can main method be overload? Ans: yes
				// what is the method overloaded?
	    	    //Ans: whenever a method with the same name is loaded with extra parameters
				
				System.out.println("This is the original main method");
				main(100);
				main(args = new String[3], args = new String[4]);
				Overloading overloading = new Overloading();
				overloading.test();
				overloading.test(100);
				overloading.test(10,20 );

			}

			public static void main(int i) {
				System.out.println("This is the overloded main method");

			}

			public static void main(String[] args1, String[] args2) {
				System.out.println("This is the overloded main method in a different way");

			}
			public void test() {
				System.out.println("This is the non-static and non-overloaded methos");
				
			}
			public void test(int i) {
				System.out.println("This is the non-ststic and non-overloded with one parameters");
				
			}
			public void test(int k,int l) {
				System.out.println("This is the non-ststic and non-overloded with 2 parameters");
			}
		}
