package classandobject;

            public class Animal {
				// Class and object are integral part on OOPS
				// is kind of a template which describe behavior/state of an object which it
				// support
				// class is a logical form
				// class represent set of properties that are common to all objects of one type
				// object is an instance of a class
				// object have 3 basics properties State,behavior,identity.
				// object is (logical and physical ) form
				// Categorization is similar compared to a class
				// an object Dog{name,eating/barking/sleeping/swimming/guarding ,
				// breed/color/age}

				String name = "Romeo"; // identity
				int age = 9;
				String color = "White";
				String breed = "Labrador";

				public static void main(String[] args) {
					// ways of creating an Object in Java
					// 1. by using new keyword

					new Animal(); // whenever we use new keyword to create an Object, we are instantiating the
									// Class
					Animal animal = new Animal(); // this is how it is represented
					Animal animal1 = new Animal();

					// animal and animal1 are object references
					// object references have the power to change the components inside an Object

					System.out.println(animal.name);
					System.out.println(animal.age);
					System.out.println(animal.color);
					System.out.println(animal.breed);

					animal1.name = "Honey";
					animal1.age = 1;
					animal1.color = "Black";
					animal1.breed = "Spitz";

					System.out.println(animal1.name);
					System.out.println(animal1.age);
					System.out.println(animal1.color);
					System.out.println(animal1.breed);

					animal = animal1;

					System.out.println(animal.name);
					System.out.println(animal.age);
					System.out.println(animal.color);
					System.out.println(animal.breed);

					System.out.println("*************************************");

					System.out.println(animal1.name);
					System.out.println(animal1.age);
					System.out.println(animal1.color);
					System.out.println(animal1.breed);

				}

				public void eating() {
					System.out.println("My Romeo loves to eat");
				}

				public void sleeping() {
					System.out.println("My Romeo loves to sleep");
				}

				public void guarding() {
					System.out.println("My Romeo hates to guard");
				}
			}
