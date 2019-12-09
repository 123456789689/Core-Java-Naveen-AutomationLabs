package OOPConsepts;

public class WrapperClasses {

	public static void main(String[] args) {

		String x = "100";
		System.out.println(x + 20); // 10020

		// Convert String to int

		// Can be converted to String, Boolean, Int

		/* Note: Charter (data type) can not be converted to Wrapper class */

		String y = "3000";
		int r = Integer.parseInt(y); // .parseInt converts value String to int
		System.out.println(r);

		String o = "25.36";
		double p = Double.parseDouble(o); // .parseDouble converts value String to double
		System.out.println(p + 10);

		// Convert int to string

		/*
		 * double u = 25.36; Integer.valueOf(i); //Not possible because double datatype
		 * can not be converted to int System.out.println(i+10);
		 */

		int u = 200;
		String r1 = String.valueOf(u); // .valueof converts value of int to String
		System.out.println(r1 + "ABCD");

	}

}
