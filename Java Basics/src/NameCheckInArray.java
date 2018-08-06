import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NameCheckInArray {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the no of names you want to enter");

		int n = Integer.parseInt(br.readLine());
		String array[] = new String[n];
		System.out.println("Enter the names in the array");
		for (int i = 0; i < n; i++) {
			array[i] = br.readLine();
		}
		System.out.println("Enter a name to be searched");
		String name=br.readLine();
		int i,c=0;
		for(i=0;i<n;i++)
		{
			if(name.equals(array[i])) c++;
		}
		System.out.println("The name occured "+ c+ " times");
	}

}
