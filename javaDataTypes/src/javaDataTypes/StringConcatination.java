package javaDataTypes;

public class StringConcatination {

	public static void main(String[] args) {

		/* Logic to find highest number */
		int a = 60000000;
		int b = 81500;
		int c = 300;

		// nested if-else

		if (a > b & a > c) {
			System.out.println("a is greater");
		} else if (b > c) {
			System.out.println("b is greater");
		} else {
			System.out.println("c is greater");
		}
		// StringConcatination
		// + is the Concatenation operator
		{
			int g = 100;
			int h = 300;


			String x = "hi";
			String y = "bye";

			System.out.println(g + h + x + y);
			System.out.println(x + y + g + h);
			System.out.println(x + y + (g + h));
			System.out.println("Value of a is:" + a);
			System.out.println("value of a & b is:" + (a + b));
		}
	}
}
