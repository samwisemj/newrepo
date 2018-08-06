//abstrcat savings account class
abstract class SavingsAccount extends BankAccount{

	private boolean isSalaried;
	private static final float MINBAL=1000.00f;
	
	public static float getMinbal() {
		return MINBAL;
	}
	
	public SavingsAccount(int accNo,String accName,float accBal,boolean isSalaried) {
		super(accNo,accName,accBal);
		this.isSalaried=isSalaried;
	}
	
	@Override
	public void withdraw(float amount) 	
	{
		if(getAccBal()-amount>=MINBAL)
		{
			setAccBal(getAccBal()-amount);
		}
	}
	@Override
	public String toString() {
		return "Account Name "+getAccName()+"\nAccount Number "+getAccNo()+"\nAccount Balance "+getAccBal()+"\nSalaried "+isSalaried;
	}
	public boolean isSalaried() {
		return isSalaried;
	}
}
