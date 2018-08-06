
public class TestOfMoneyMoneyBank {

	public static void main(String[] args) {
		
			SavingsAccount account1=new SavingsAccount(SavingsAccount.getNextAccountNumber(),"Mehta");
			SavingsAccount account2=new SavingsAccount(SavingsAccount.getNextAccountNumber(),"Kumaar",1000.00);
			SavingsAccount account3=new SavingsAccount(SavingsAccount.getNextAccountNumber(),"Ramesh");
			SavingsAccount account4=new SavingsAccount(SavingsAccount.getNextAccountNumber(),"Suresh",1000.00);
			
			System.out.println("After creating the account:--");
			System.out.println(account1);
			System.out.println(account2);
			System.out.println(account3);
			System.out.println(account4);
			
			
			account1.withdraw(100.00);
			account2.deposit(1000.00);
			
			//a correct payment
			boolean statusCorrectPayment = PaymentGateway.transfer(account4, account3, 200.00);
			//an incorrect payment
			boolean statusIncorrectPayment = PaymentGateway.transfer(account1, account2, 99999.00);
			
			System.out.println("After some transaction");
			System.out.println(account1);
			System.out.println(account2);
			System.out.println(account3);
			System.out.println(account4);
			
			System.out.println("The status of two payment:-\nstatusCorrectPayment="+statusCorrectPayment+"\nstatusIncorrectPayment="+statusIncorrectPayment);
	}
}
