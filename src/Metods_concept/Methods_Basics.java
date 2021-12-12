package Metods_concept;

          public class Methods_Basics {
	
				// Methods are independent units of execution .They have a certain logic and they
				// execute that logic under certain conditions.
                //Access Modifiers+ Statics(optional) + return type+ logic {--}(body)
				// Statics Method ,Non-Statics Method
				// public,protected,private,default
				// default method are only created in References
				private static void bedroom() {
					System.out.println("This is my private method bedroom");

				}

				protected static void kitchen() {
					System.out.println("This is my protected method kitchen");

				}

				public static void main(String[] args) {

					System.out.println("This is the main method");
					test();
					int K = test1(); // allocation , memory reference
					System.out.println(K);

					String S4 = test2();
					System.out.println(S4);
					boolean b3 = test3();
					System.out.println(b3);
					bedroom();
					kitchen();

				}

				public static void test() {
					System.out.println("This is the test method");

				}

				public static int test1() {
					System.out.println("This is the test1 method");
					int i = 10;
					int j = 20; // This method does not return any value because this method has a void and void
								// does not have an return value
					int k = i + j; // if we write int instead of void ,it will run.
					return k;
				}

				public static String test2() {
					System.out.println("This is the test2 method");
					String S1 = "java";
					String S2 = "C#";
					String S3 = "python";
					String S4 = S1 + S2 + S3;
					return S4;

				}

				public static boolean test3() {
					System.out.println("This is the test3 method");
					boolean b1 = true;
					boolean b2 = false;
					boolean b3 = 1 < 2;
					return b3;

				}
			}