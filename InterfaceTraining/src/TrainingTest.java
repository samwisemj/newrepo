/**
 * A class that test the training hierarchy 
 */

/**
 * @author subhamsa
 *
 */
public class TrainingTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Training train=new PublicTraining(1234,"Java",5000.00,50);
		System.out.println("Public Training for Java @ 5000.00 per participants will be "+train.getOrderValue()+" for 50 participants");
		
		train=new CorporateTraining(1235, "BigData", 35_000.00, 4);
		System.out.println("Corporate Training for BigData @ 35,000.00 per day will be "+train.getOrderValue()+" for 4 days");
		
	}

}
