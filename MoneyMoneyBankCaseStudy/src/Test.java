//tester function that test whether the object factory works correctly 
public class Test {

	public static void main(String[] args) {
		//usingv the bankfactory to instantiate the derieved mmbankfactory
		BankFactory bankFactory = new MMBankFactory();
		
		//creating a saving account
		SavingsAccount sa=bankFactory.getNewSavingsAccount("Amit", 1000.00f, true);
		System.out.println(sa);
		
		//creating a current account
		CurrentAccount ca=bankFactory.getNewCurrentAccount("Suresh", 2000.00f, 1000.00f);
		System.out.println(ca);
	}

}
