package javaDataTypes;

public class TwoDimArray {

	public static void main(String[] args) {

		String s1[][] = new String[3][3];

		System.out.println(s1.length);
		System.out.println(s1[0].length);

		s1[0][0] = "a";
		s1[0][1] = "b";
		s1[0][2] = "c";

		s1[1][0] = "a1";
		s1[1][1] = "b1";
		s1[1][2] = "c1";

		s1[2][0] = "a11";
		s1[2][1] = "b11";
		s1[2][2] = "c11";

		System.out.println(s1[2][2]);

		for (int row = 0; row < s1.length; row++) {
			for (int col = 0; col < s1[0].length; col++) {
				System.out.println(s1[row][col]);
			}
		}

	}

}
