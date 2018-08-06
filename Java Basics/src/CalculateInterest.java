public class CalculateInterest{
	public static double calcSimpleInterest(float amount,float rate,float time){
		return (amount*rate*time/100);
	}
	
	public static double calcCompoundInterest(float amount,float rate,float time){
		return (amount*Math.pow((1+rate/100),time));
	}
}