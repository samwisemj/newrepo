//concrete current account implementation for mmbank
public class MMCurrentAccount extends CurrentAccount{

	public MMCurrentAccount(int accNo, String accName, float accBal, float creditLimit) {
		super(accNo, accName, accBal, creditLimit);
	}
	
	//overriding withdraw at current account
	public void withdraw(float amount) {
		if(amount<getCreditLimit()+getAccBal())
			setAccBal(getAccBal()-amount);
	}
	
	@Override
	public String toString() {
		return "Account Name "+getAccName()+"\nAccount Number "+getAccNo()+"\nAccount Balance "+getAccBal()+"\nCreditLimit "+getCreditLimit();
	}

}
