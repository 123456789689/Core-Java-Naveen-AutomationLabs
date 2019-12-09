package OOPConsepts;

public class Car {

	int mod;
	int wheels;

	public static void main(String[] args) {

		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		
		
		//before shifting the reference
		
		int mod = 2014;
		int wheels = 4;
		
		
		//after shifting the reference
		
		a=b;
		b=c;
		c=a;
		
		
		a.mod=10;
		System.out.println(a.mod);//10
		a.mod=30;
		System.out.println(a.mod);//30
		System.out.println(c.mod);


	}

}
