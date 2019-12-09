package MethodOverridingInheritancePolymorphismTopCastingAndDownCasting;

public class TestClass {

	public static void main(String[] args) {

		/*
		 * Static Polymorphism or Compile time Polymorphism Definition: At the time of
		 * compilation java will decide which method to call
		 */

		BMW b = new BMW();
		b.Start();
		b.Stop();
		b.Safetyfeature();
		b.Refuel();
		b.Engine();

		System.out.println("******");

		Car c = new Car();
		c.Start();
		c.Stop();
		c.Engine();
		// c.Safetyfeature(); because this can access only Car class methods 

		System.out.println("******");
		
		//Top/up casting
		Car c1 = new BMW();  /*Child class object can be referred by parent class reference variable is called 
		-- dynamic Polymorphism or Runtime Polymorphism*/
		c1.Start();
		c1.Stop();
		c1.Refuel();
		//c1.Safetyfeature(); throws error because parent can not access the child methods 
		
		//Down casting not possible
		BMW b1 = (BMW)new Car(); //ClassCastException

	}

}
