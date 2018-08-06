import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DuplicateCharacters {
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string");
		String str=br.readLine();
		int i;
		int ar[]=new int [123];
		for(i=0;i<str.length();i++)
		{
			if(ar[str.charAt(i)]==0)
			{
				System.out.print(str.charAt(i));
				ar[str.charAt(i)]=1;
			}
		}
		
	}
}
