/**
 * A sample vehicle class with some well defined properties
 */


/**
 * @author subhamsa
 *
 */
public class Vehicle {
	private int speed;
	private int direction;
	private String nameOfOwner;
	private static int highestVehicleID=1000;//initializer....initial id is 1000...we assume that id is a 4 digit no and increases ever for every vehicle thats generated
	
	public static int getHighestVehicleID() {
		return highestVehicleID-1;
	}

	private int vehicleID;
	
	//the two constant that will be helpful to turn the vehicle...make a note that this must be protected or public as we need to accesss this from outside the class , without using an instance
	protected static final int TURN_LEFT=0;
	protected static final int TURN_RIGHT=1;
		
	
	public Vehicle() {
		vehicleID=highestVehicleID;
		highestVehicleID++;
		nameOfOwner="Unspecified(Test Car)";
	}
	
	public Vehicle(String nameOfOwner) {
		this();
		this.nameOfOwner = nameOfOwner;
	}
	//getters and setters for the accessible variables
	public int getSpeed() {
		return speed;
	}
	
	//changes the speed of the vehicle to the passed in value
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getDirection() {
		return direction;
	}
	
	
	//CHANGES THE VEHICLE DIRECTION or (the turn method that was talked about)
	public void setDirection(int direction) {
		this.direction = direction;
		if(this.direction<0)
			this.direction+=360;
		this.direction %=360;
	}
	
	//stops the vehicle ie speed=0
	public void stopVehicle()
	{
		setSpeed(0);
	}
	
	//if vehicle turns left we subtract 90 degrees else add 90 degrees
	public void turnLeftorRight(int constant)
	{
		setDirection( (constant==0)?((this.direction-90)%360):((this.direction+90)%360)  );
	}

	@Override
	public String toString() {
		return "Vehicle [speed=" + speed + ", direction=" + direction + ", nameOfOwner=" + nameOfOwner + ", vehicleID="
				+ vehicleID + "]";
	}
	
}
