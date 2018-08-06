import java.util.Scanner;
public class Discount{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Marked Price of the Item:");
		int newItem = scanner.nextInt();
		float discount = 0.35f*newItem;
		float newItemPrice = newItem - discount;
		System.out.println("Marked Price="+newItem);
		System.out.println("Discount="+discount);
		System.out.println("Discounted Price="+newItemPrice);
	}
}