package javaDataTypes;

public class IncrementalDecrementalOperator {

	public static void main(String[] args) {

		int i = 1;
		int l = i++; // post increment
		System.out.println(i); // 2
		System.out.println(l); // 1

		int o = 2;
		int m = l--;
		System.out.println(o); //2
		System.out.println(m); // 1
		
		int b = 1;
		int c = ++b;
		System.out.println(b); //2  //pre increment
		System.out.println(c); //2
		
		int r = 2;
		int e = --r;
		System.out.println(r);  //1
		System.out.println(e);  //1

	}

}
