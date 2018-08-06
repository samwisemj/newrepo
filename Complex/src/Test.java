import java.io.*;
//tester class for fomplex class
public class Test 
{

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception 
	{
		System.out.println("Enter the first complex number");
		float real=Float.parseFloat(br.readLine());
		float imaginary=Float.parseFloat(br.readLine());
		
		Complex complexNum1=new Complex();
		complexNum1.set(real, imaginary);
		
		System.out.println("Enter the second complex number");
		real=Float.parseFloat(br.readLine());
		imaginary=Float.parseFloat(br.readLine());
		
		Complex complexNum2=new Complex();
		complexNum2.set(real, imaginary);
		
		//calc sum 
		Complex sumOfComplex;
		
		sumOfComplex= complexNum1.sum(complexNum2);
		
		System.out.println("First Complex Number");
		complexNum1.display();
		
		System.out.println("Second Complex Number");
		complexNum2.display();
		
		System.out.println("Sum of Complex Numbers");
		sumOfComplex.display();
		
		}

}
