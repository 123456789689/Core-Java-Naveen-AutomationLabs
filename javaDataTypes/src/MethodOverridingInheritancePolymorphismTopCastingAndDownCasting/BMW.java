package MethodOverridingInheritancePolymorphismTopCastingAndDownCasting;

public class BMW extends Car { // Has a relationship

	/*
	 * Def: When same method is present in both parent class & child class with same
	 * name & same number of arguments is called method Overriding
	 */

	public void Start() { // Overridden method
		System.out.println("Start----BMW");
	}

	public void Safetyfeature() {
		System.out.println("Safetyfeature----BMW");
	}

}
