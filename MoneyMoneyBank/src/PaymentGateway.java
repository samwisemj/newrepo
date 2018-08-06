/**
 * This class is a payment gateway class that assists in balance transfers
 */

/**
 * @author subhamsa
 *
 */
public class PaymentGateway {
	
	//we will withdraw and see if it returns or false,
	//if true then the amount is withdrawn because sufficient balance 
	//is present,and we deposit the same to the receiver
	// else payment wont be successful
	
	public static boolean transfer(SavingsAccount sender,SavingsAccount reciever,double amount)
	{
		if(sender.withdraw(amount))
		{
			reciever.deposit(amount);
			return true;
		}
		else return false;
	}

}
