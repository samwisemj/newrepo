//abstract class for current account
public abstract class CurrentAccount extends BankAccount {

	private final float creditLimit;

	protected float getCreditLimit() {
		return creditLimit;
	}

	public CurrentAccount(int accNo, String accName, float accBal, float creditLimit) {
		super(accNo, accName, accBal);
		this.creditLimit = creditLimit;
	}

	@Override
	protected void withdraw(float amount) {
		if(amount<creditLimit+getAccBal())
			setAccBal(getAccBal()-amount);
	}
	
	@Override
	public String toString() {
		return "Account Name "+getAccName()+"\nAccount Number "+getAccNo()+"\nAccount Balance "+getAccBal()+"\nCreditLimit "+creditLimit;
	}
}
