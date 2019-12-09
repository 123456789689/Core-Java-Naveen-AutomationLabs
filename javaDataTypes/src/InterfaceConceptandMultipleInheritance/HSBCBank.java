package InterfaceConceptandMultipleInheritance;

public class HSBCBank implements USBank,BrazilBank { // we are achieving multiple Inheritance 
	// Is-a relationship

	//If a class is implementing any interface, then its mandatory to define/override all the methods of Interface
	public void Credit() {
		System.out.println("HSBC-----Credit");
	}

	//methodOverride from parent interface USBank
	public void Debit() {
		System.out.println("HSBC----Debit");
	}
	//HSBC own method/ separate method
	public void Transfermoney() {
		System.out.println("HSBC---TransferMoney");
	}
	
	
	//Brazilbank method ethodOverride from BrazilBank 
	public void Mutualfunds() {
		System.out.println("HSBC----Mutual funds");
	}
	

	

}
