package OOPConsepts;

public class StaticNonstaticDifference {

	// Global variables can be used throughout the functions with some condition

	String name = "Mourya";// Non static
	static int age = 25; // static

	public static void main(String[] args) {
		// How to call static method & variables

		// Static method can be used in 2 ways

		Sum(); // Directly calling method name
		System.out.println(age); // Directly calling method name

		StaticNonstaticDifference.Sum(); // Calling with class name
		System.out.println(StaticNonstaticDifference.age); // Calling with class name

		// How to call Non-static methods & variables

		// Create object & call

		StaticNonstaticDifference obj = new StaticNonstaticDifference();

		System.out.println(obj.name);
		obj.SendMail();

		// Can we access static method by using object reference? => yes but its not a
		// good practice, throws an warning.

		obj.Sum();
		System.out.println(obj.age);

	}

	public void SendMail() {
		System.out.println("Sendmail method *** Non stsic method");
	}

	public static void Sum() {
		System.out.println("Sum method *** Static metod");
	}

}
