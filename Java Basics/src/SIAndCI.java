import java.util.Scanner;
public class SIAndCI{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the amount,rate and time");
		float amount = scanner.nextFloat();
		float rate = scanner.nextFloat();
		float time = scanner.nextFloat();
		
		System.out.println("Simple Interest:"+CalculateInterest.calcSimpleInterest(amount,rate,time));
		System.out.println("Compound Interest:"+CalculateInterest.calcCompoundInterest(amount,rate,time));
		
	}
}