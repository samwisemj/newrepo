/**
 * Training super class
 */

/**
 * @author subhamsa
 *
 */
abstract class Training {

	private int id;
	private String subject;
	private double fees;
	public double getFees() {
		return fees;
	}

	//Ctor.....
	public Training(int id, String subject, double fees) {
		this.id = id;
		this.subject = subject;
		this.fees = fees;
	}

	public abstract double getOrderValue();
}
