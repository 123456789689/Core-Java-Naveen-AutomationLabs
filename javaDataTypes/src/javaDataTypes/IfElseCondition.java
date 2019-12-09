package javaDataTypes;

public class IfElseCondition {

	public static void main(String[] args) {

		int a = 100;
		int b = 500;

		if (a > b) {
			System.out.println("a is greater");
		} else {
			System.out.println("b is greater");
		}
		int c = 200;
		int d = 500;

		if (c != d) {
			System.out.println("c & d are not same");
		} else if (c <= d) {
			System.out.println("c is greater");
		} else {
			System.out.println("None");
		}
	}

}
