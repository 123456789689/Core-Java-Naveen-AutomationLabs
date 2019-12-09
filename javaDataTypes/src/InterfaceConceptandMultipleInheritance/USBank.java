package InterfaceConceptandMultipleInheritance;

public interface USBank {
	
	int minbankbalance = 100;  //final or fixed value if we derive in Interface 100 can not be changed to new value, but can be defined new one
	
	public void Credit();
	
	
	public void Debit();
	
	/*Interface T&C/properties
	**********
	 1.No method declaration
	 2.no method body -- only method prototype
	 3.In interface we can declare the variable, variables are by default static in nature
	 4.Variables value will not be changed, It's final/constant in nature
	 5.No static method in interface
	 6.No main method in interface
	 7.We can not create object of interface because its a static in nature/Interface is abstract in nature */

}
