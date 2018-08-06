//class to test Distance
import java.io.*;
public class DistanceTest {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String args[])throws Exception
	{
	
		System.out.println("Enter the first distance");
		int feet=Integer.parseInt(br.readLine());
		float inches=Float.parseFloat(br.readLine());
		
		Distance distanceNum1=new Distance();
		distanceNum1.set(feet, inches);
		
		System.out.println("Enter the second distance");
		feet=Integer.parseInt(br.readLine());
		inches=Float.parseFloat(br.readLine());
		
		Distance distanceNum2=new Distance();
		distanceNum2.set(feet, inches);
		
		//calc sum 
		Distance sumOfDistance=new Distance();
		sumOfDistance=distanceNum1.add(distanceNum2);
		
		System.out.println("First Distance");
		distanceNum1.display();
		
		System.out.println("Second Distance");
		distanceNum2.display();
		
		System.out.println("Sum of Distance");
		sumOfDistance.display();
	}
	
}
