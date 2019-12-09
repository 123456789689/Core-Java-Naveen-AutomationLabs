package OOPConsepts;

public class MethodOverloadingTillAboveClassesReferNotes {

	public static void main(String[] args) {
		
		MethodOverloadingTillAboveClassesReferNotes obj= new MethodOverloadingTillAboveClassesReferNotes();
		
		obj.Sum();
		obj.Sum(20);
		obj.Sum(50.66, 50);

	}
	
	public static void main(int p) {

	}

	public static void main(int p, double d) {

	}                                                  // Main method can be overloaded but with different I/p or data types
	
	public void Sum() {
		System.out.println("Sum method ");
	}
	
	public void Sum(int m) {
		System.out.println("Sum method ");
		System.out.println(m);
	}
	
	public void Sum(double m, int p) {
		System.out.println("Sum method ");
		System.out.println(m*p);
	}


}
