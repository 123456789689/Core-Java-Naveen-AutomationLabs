package javaDataTypes;



public class ArrayConcepts {

	public static void main(String[] args) {
		
		double d[] = new double[3];
		
		d[0] = 10.5;
		d[1] = 20.36;
		d[2] = 30.696;
		
		System.out.println(d.length);
		
		for(int l=0; l<d.length; l++) {
			System.out.println(d[l]);
		}
		


	}

}
