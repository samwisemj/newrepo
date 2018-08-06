//abstract class for bank factory
public abstract class BankFactory {

	protected abstract SavingsAccount getNewSavingsAccount(String acccName,float accBal,boolean isSalaried);

	protected abstract CurrentAccount getNewCurrentAccount(String accName, float accBal,float creditLimit );
}
