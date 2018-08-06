//a concrete class which extends o bank factory
public class MMBankFactory extends BankFactory {

	private static int uniqueCAcNo = 10000;
	private static int uniqueSAcNo = 50000;

	@Override
	protected SavingsAccount getNewSavingsAccount(String accName, float accBal, boolean isSalaried) {
		
		SavingsAccount sa=new MMSavingsAccount(uniqueSAcNo,accName,accBal,isSalaried); 
		return sa;
	}
	
	@Override
	protected CurrentAccount getNewCurrentAccount(String accName, float accBal, float creditLimit) {
		
		CurrentAccount ca=new MMCurrentAccount(uniqueCAcNo,accName,accBal,creditLimit);
		return ca; 
		
	}

}
