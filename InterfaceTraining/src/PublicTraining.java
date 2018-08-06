/**
 * Public training class that extends to the Training class
 */

/**
 * @author subhamsa
 *
 */
public class PublicTraining extends Training{
	private int participants;

	//ctor....
	public PublicTraining(int id, String subject, double fees,int participants) {
		super(id, subject, fees);
		this.participants=participants;
		// TODO Auto-generated constructor stub
	}
	

	//returns fees * participants
	@Override
	public double getOrderValue() {
		return getFees()*participants;
	}
	
}
