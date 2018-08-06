//generic abstract class for the bank account
public abstract class BankAccount {
	private int accNo;
	private String accName;
	private float accBal;

	//constructor
	public BankAccount(int accNo, String accName, float accBal) {
		this.accNo = accNo;
		this.accName = accName;
		this.accBal = accBal;
	}

	protected int getAccNo() {
		return accNo;
	}

	@Override
	abstract public String toString();
	
	//common deposit funct....need not be overriden
	protected void deposit(float amount)
	{
		accBal+=amount;
	}
	
	abstract protected void withdraw(float amount);

	//generic getters and setters for required fields
	
	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	protected void setAccBal(float accBal) {
		this.accBal = accBal;
	}

	public float getAccBal() {
		return accBal;
	}

}
