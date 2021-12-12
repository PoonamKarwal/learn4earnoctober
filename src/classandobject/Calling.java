package classandobject;

            public class Calling {

	       //Global Variables
	
			static String Language = "Automation"; // static Global Variable
			int time = 2;
			String complexity = "Medium";
			int Salary = 100000;

			// static has the capability to call static stuff only. Static cannot call
			// non-static
			// non-static can call static as well as non-static stuff
			// static can be directly called. Or called by class name

			public static void main(String[] args) {

				Calling calling = new Calling();
				// new Calling() - this is the object
				// calling - this is the object reference
				// Calling - this is the Class

				// static can be called directly or via the Class name
				Calling.Language = "Python";
				hello();
				Calling.hello();
				System.out.println(calling.Language);

				calling.bye(); // we are calling a non-static method. So we have to call it via object
								// reference

			}

			public static void hello() {
				int age = 20;
				String height = "Short"; // local variables because they are local to hello method and their operations'
											// vicinity is within hello
				System.out.println(Calling.Language);
				// static int j = 35; //local variables are neither static nor non-static

			}

			public void bye() { // non-static method
				System.out.println("Adios");
				int i = 100;

			}

			public void sleep() {
				int i = 200; // local variables should be initialized

			}
		}
