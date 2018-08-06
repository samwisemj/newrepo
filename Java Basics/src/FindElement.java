import java.util.Scanner;
public class FindElement{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the dimensions of the 2d matrix");
		int row = scanner.nextInt();
		int col = scanner.nextInt();
		int array[][] = new int [row][col];
		int i,j,flag = 0;
		System.out.println("Enter "+(row*col)+" number of elements into the array");
		for (i=0;i<row;i++){
			for(j=0;j<col;j++)
				array[i][j] = scanner.nextInt();
		}
		
		System.out.println("The array is:");
		for (i=0;i<row;i++){
			for(j=0;j<col;j++)
				System.out.print(array[i][j]+"\t");
			System.out.println();
		}
		
		System.out.println("Enter the element to search for:");
		int value = scanner.nextInt();
		for (i=0;i<row;i++){
			for(j=0;j<col;j++){
				if(value == array[i][j]){
					System.out.println("The value "+value+" found in the array");
					flag++;
					break;
				}
			}
		}
		if (flag == 0)
			System.out.println("The value "+value+" was not found in the array");
	}
}