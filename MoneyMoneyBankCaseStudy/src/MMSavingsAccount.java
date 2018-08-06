//concrete savings account implementation for mmbank
public class MMSavingsAccount extends SavingsAccount{

	public MMSavingsAccount(int accNo, String accName, float accBal, boolean isSalaried) {
		super(accNo, accName, accBal, isSalaried);
	}
	public void withdraw(float amount)
	{
		if(getAccBal()-amount>=SavingsAccount.getMinbal())
		{
			setAccBal(getAccBal()-amount);
		}
	}
	@Override
	public String toString() {
		return "Account Name "+getAccName()+"\nAccount Number "+getAccNo()+"\nAccount Balance "+getAccBal()+"\nSalaried "+isSalaried();
	}

}
