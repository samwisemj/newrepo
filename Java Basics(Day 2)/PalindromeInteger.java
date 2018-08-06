import java.io.*;
class PalindromeInteger
{
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String args[])throws Exception
	{
		System.out.println("Enter a value");
		StringBuilder str=new StringBuilder(br.readLine());
		StringBuilder reverseStr=new StringBuilder(str.reverse());
		str.reverse();
		if(str.equals(reverseStr))
			System.out.println(str+" is Palindrome");
		else
			System.out.println(str+" is not Palindrome");
	}
}