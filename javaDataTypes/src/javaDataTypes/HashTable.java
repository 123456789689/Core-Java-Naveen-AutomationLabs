package javaDataTypes;

import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
		
		Hashtable ht = new Hashtable ();
		
		ht.put("A", 456);
		ht.put("F", 'K');
		ht.put(1, 500);
		
		System.out.println(ht.size());
		
		ht.put(8, 600);
		
		System.out.println(ht.size());

		

	}

}
