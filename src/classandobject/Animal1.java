package classandobject;

             public class Animal1 {
 
	         public static void main(String[] args) {
					Animal1 romeo = new Animal1();
					romeo.eating();
					romeo.barking();

					birds moti = new birds();
					moti.fly();
					moti.speak();
					Vehicle vehicles = new Vehicle();
					vehicles.carDrive();
					vehicles.truckDrive();

				}

				public void eating() {
					System.out.println("romeo eats");

				}

				public void barking() {
					System.out.println("romeo barks");

				}
			}

			class birds {

				public void fly() {
					System.out.println("Moti is flying");

				}

				public void speak() {
					System.out.println("Moti is speaking");

				}

			}

			class Vehicle {
				void truckDrive() {
					System.out.println("Truck drive");

				}

				void carDrive() {
					System.out.println("Car drives");
				}
			}
