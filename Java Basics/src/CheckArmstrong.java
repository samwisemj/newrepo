import java.util.Scanner;
public class CheckArmstrong{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		if(ArmstrongNumber.findArmstrong(number))
			System.out.println("The number "+number+" is an Armstrong Number");
		else
			System.out.println("The number "+number+" is an not Armstrong Number");
	}
}