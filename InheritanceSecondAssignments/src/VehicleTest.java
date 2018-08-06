
public class VehicleTest {

	public static void main(String[] args) {
			
		Vehicle myVehicle=new FourWheeler();//upcasting
		//method overriding
		myVehicle.start();
		
		//System.out.println(myVehicle.getClass().getName());
	}

}
