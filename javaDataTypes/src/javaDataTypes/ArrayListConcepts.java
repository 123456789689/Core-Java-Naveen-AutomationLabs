package javaDataTypes;

import java.util.ArrayList;

public class ArrayListConcepts {

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		
		ar.add(100);
		ar.add("ABS");
		
		System.out.println(ar.size());
		
		System.out.println(ar.get(1));
		
		for(int count=0; count<ar.size(); count++) {
			System.out.println(ar.get(count));
		}
		
		//TO restrict to add only Integer, String  
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		
		ar1.add(50);
		System.out.println(ar1.size());
		
		
		
		

	}

}
