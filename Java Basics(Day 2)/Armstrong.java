import java.io.*;
class Armstrong
{
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public static boolean astrong(int n)
	{
		int sum=0,copy=n,r;
		while(n>0)
		{
			r=n%10;
			n/=10;
			sum=sum+(r*r*r);
		}
		if(sum==copy)
			return true;
		else return false;
			
	}
	public static void main(String args[])throws Exception
	{
		int i;
		for(i=100;i<1000;i++)
		{
			if(astrong(i))
			System.out.println(i+"is armstrong");
		}
	}
}