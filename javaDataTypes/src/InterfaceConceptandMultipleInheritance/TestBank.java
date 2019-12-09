package InterfaceConceptandMultipleInheritance;

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println(USBank.minbankbalance); //static method should be called from method name or class name

		HSBCBank hs = new HSBCBank();

		hs.Credit();
		hs.Debit();
		hs.Transfermoney();
		hs.Mutualfunds();

		// Dynamic polymarphisam: Child class object can be referred by parent interface
		// variables

		USBank p = new HSBCBank();
		p.Credit();
		p.Debit();


	}

}
