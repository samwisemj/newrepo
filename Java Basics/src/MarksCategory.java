import java.util.Scanner;
public class MarksCategory{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the three marks:");
		int marksOne = scanner.nextInt();
		int marksTwo = scanner.nextInt();
		int marksThree = scanner.nextInt();
		
		if (marksOne>60&&marksTwo>60&&marksThree>60)
			System.out.println("Passed");
		else if((marksOne>60&&marksTwo>60)||(marksOne>60&&marksThree>60)||(marksTwo>60&&marksThree>60))
			System.out.println("Promoted");
		else
			System.out.println("Failed");
	}
}