public class ArmstrongNumber{
	public static boolean findArmstrong(int number){
		int copy=number,lastDigit,sum=0;
		while(copy!=0){
			lastDigit = copy%10;
			sum += Math.pow(lastDigit,3);
			copy /= 10;
		}
		if(sum == number)
			return true;
		else 
			return false;
	}
}
