import java.io.*;
class StringReversal
{
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public static String reverse(String s) 
	{
		String temp="";
		for(int i=0;i<s.length();i++)
			temp=s.charAt(i)+temp;
		return temp;
	}
	public static void main(String args[])throws Exception
	{
		String nstr="";
		String temp="";
		System.out.println("Enter a string");
		String s=br.readLine();
		
		while(true)
		{
			s=s.trim();
			if(s.indexOf(' ')==-1)
			{
				temp=s;
				s="";
				temp=reverse(temp);
				nstr=nstr+' '+temp;
				break;
			}
			else
			{
				temp=s.substring(0,s.indexOf(' '));
				temp=temp.trim();
				s=s.substring(s.indexOf(' '));
				temp=reverse(temp);
				nstr=nstr+' '+temp;
				temp="";
			}
		}
		System.out.println(nstr);
	}
}