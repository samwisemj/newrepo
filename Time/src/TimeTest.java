//Testing the Time class
import java.io.*;
public class TimeTest {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args)throws Exception {
			
		System.out.println("Enter the first time");
		int hours=Integer.parseInt(br.readLine());
		int minutes=Integer.parseInt(br.readLine());
		
		Time timeNum1=new Time();
		timeNum1.set(hours, minutes);
		
		System.out.println("Enter the second time");
		hours=Integer.parseInt(br.readLine());
		minutes=Integer.parseInt(br.readLine());
		
		Time timeNum2=new Time();
		timeNum2.set(hours, minutes);
		
		//calc sum 
		Time sumOfTime=new Time();
		sumOfTime=timeNum1.sum(timeNum2);
		
		System.out.println("First Time");
		timeNum1.display();
		
		System.out.println("Second Time");
		timeNum2.display();
		
		System.out.println("Sum of Time");
		sumOfTime.display();

	}

}
