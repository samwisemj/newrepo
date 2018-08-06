import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SearchAndSort {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of elements");
		int n = Integer.parseInt(br.readLine());
		int ar[] = new int[n];
		int i, j, temp, search;
		System.out.println("Enter the elements in the array");
		for (i = 0; i < n; i++) {
			ar[i] = Integer.parseInt(br.readLine());
		}
		// bubble sort
		for (i = 0; i < n - 1; i++) {
			for (j = 0; j < n - i - 1; j++) {
				if (ar[j] > ar[j + 1]) {
					temp = ar[j];
					ar[j] = ar[j + 1];
					ar[j + 1] = temp;
				}
			}
		}
		System.out.println("Enter the elements to be searched in the array");
		search=Integer.parseInt(br.readLine());
		
		for (i = 0; i < n - 1; i++) {
			if(ar[i]==search)
			{
				System.out.println("Search element is present in the array");
				System.exit(1);
			}
		}
		System.out.println("Search element is not present in the array");
	}

}
