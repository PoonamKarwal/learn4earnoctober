package classandobject;

           public class Inheritance_Concept {

	       public static void main(String[] args) {
				Child child = new Child();
				child.Money();
				child.Bungalow();

			}

			public void Money() {
				System.out.println("Parents money");
			}

			public void Bungalow() {
				System.out.println("Parennts property");
			}
		}

		class Child extends Inheritance_Concept {

		}