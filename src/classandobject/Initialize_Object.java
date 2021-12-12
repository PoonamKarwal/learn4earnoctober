package classandobject;

           public class Initialize_Object {
				String color;
				int age;

				public static void main(String[] args) {
					// How do we initialize the object?
					// 1. By reference variable
					// 2.by Method
					// 3 . by Constructor

					Initialize_Object romeo = new Initialize_Object();
					romeo.color = "Black";
					romeo.age = 10;

					romeo.initObject("black", 10);
					romeo.Display();
				}

				public void initObject(String c, int a) {
					color = "c";
					age = 2;
				}

				public void Display() {
					System.out.println(color + "" + age);
				}
			}
