
public class SavingsAccount {

	private static int uniqueAccountNumber=456789;//initializer..
	private int accountNumber;
	private String name;
	private double accountBalance;
	
	
	//	For creating an account with zero balance
	public SavingsAccount(int accountNumber, String name) {
		this(accountNumber,name,0.0);
	}

	//creating an account with some deposit
	public SavingsAccount(int accountNumber, String name, double accountBalance) {
	
		this.accountNumber = accountNumber;
		this.name = name;
		this.accountBalance = accountBalance;
		uniqueAccountNumber++;
	}
	
	protected boolean withdraw(double amount)
	{
		if(amount>accountBalance)
			return false;
		
		accountBalance-=amount;
		return true;
	}
	
	protected void deposit(double amount)
	{
		accountBalance+=amount;
	}

	@Override
	public String toString() {
		return "SavingsAccount [accountNumber=" + accountNumber + ", name=" + name + ", accountBalance="
				+ accountBalance + "]";
	}
	
	public static int getNextAccountNumber()//retuns a new account number to assists the banker to open the account
	{
		return uniqueAccountNumber;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	
}
