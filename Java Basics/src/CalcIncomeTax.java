import java.util.Scanner;
public class CalcIncomeTax{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your income");
		double income = scanner.nextDouble();
		if(income>0&&income<=180000)
			System.out.println("No Tax");
		else if (income>180000&&income<=300000)
			System.out.println("Tax="+0.10*income);
		else if (income>300000&&income<=500000)
			System.out.println("Tax="+0.20*income);
		else if (income>500000&&income<=1000000)
			System.out.println("Tax="+0.30*income);
	}
}