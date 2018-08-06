/**
 * 	Corporate training class that extends the training super class
 */

/**
 * @author subhamsa
 *
 */
public class CorporateTraining extends Training {

	private int days;
	//ctor....
		public CorporateTraining(int id, String subject, double fees,int days) {
			super(id, subject, fees);
			this.days=days;
			// TODO Auto-generated constructor stub
		}
		

		//returns fees * days
		@Override
		public double getOrderValue() {
			return getFees()*days;
		}
		
	
}
