/**
 * Just a test class for the vehicle class. We shall create some objects and test our vehicle class
 */

/**
 * @author subhamsa
 *
 */
public class TestVehicle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Vehicle vehicle1=new Vehicle();
		Vehicle vehicle2=new Vehicle();
		
		Vehicle vehicle3=new Vehicle("Asish");
		vehicle3.setSpeed(80);
		
		vehicle1.setDirection(180);
		vehicle3.turnLeftorRight(Vehicle.TURN_RIGHT);
		
		vehicle2.setSpeed(80);
		vehicle2.setDirection(180);
		vehicle2.turnLeftorRight(Vehicle.TURN_LEFT);
		
		System.out.println("The highest vehicle serial number so far "+Vehicle.getHighestVehicleID());//returns the highest vehicle id so far
		
		vehicle2.stopVehicle();
		
		System.out.println("The current state of all the vehicles are :");
		System.out.println(vehicle1);
		System.out.println(vehicle2);
		System.out.println(vehicle3);
		
//		Vehicle v=new Vehicle("Samwise");
//			v.turnLeftorRight(Vehicle.TURN_LEFT);
//		System.out.println(v);
//		

	}

}
