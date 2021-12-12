package classandobject;

                   public class Student {
						String name;
						int student_id;
						int age;

						public static void main(String[] args) {

							Student st1 = new Student("Rohit", 121, 11);
							Student st2 = new Student("Rahul", 122, 12);
							// st1.name = "Rohit";
							// st1.student_id = 121;
							// st1.age = 11;
							System.out.println(st1.name + " " + st1.student_id + " " + st1.age);
							System.out.println(st2.name + " " + st2.student_id + " " + st2.age);

						}

						public Student(String name, int student_id, int age) {
							this.name = name;
							this.student_id = student_id;
							this.age = age;
							// Student st2 = new Student();
							// st2.name = "Rahul";
							// st2.student_id = 122;
							// st2.age = 12;

						}

					}
