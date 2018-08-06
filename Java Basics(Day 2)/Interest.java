import java.io.*;

//import java.util.*;
class Interest {
	public static void main(String args[])throws Exception {
	double amount,principal,rate,time;
	int n=1;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter a Principal , rate and time in years");
	principal=Double.parseDouble(br.readLine());
	rate=Double.parseDouble(br.readLine());
	time=Double.parseDouble(br.readLine());
	
	amount=Math.pow(principal*(1+(rate/n)),(n*time));
	System.out.println("Simple Interest Amount"+(((principal*rate*time)/100.0)+principal));
	System.out.println("Compund interest amount compounded anually "+amount);
	
}
}