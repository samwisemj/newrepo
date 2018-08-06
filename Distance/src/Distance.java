//Distance class
public class Distance {
	
	private int feet;
	private float inches;
	
	//setter
	public void set(int feet,float inches)
	{
		this.feet=feet;
		this.inches=inches;
	}
	//displays feet and inches
	public void display()
	{
		System.out.println("Feet: "+feet+"ft\nInches: "+inches+"in");
	}
	//ctor....
	public Distance add(Distance n)
	{
		Distance distanceNumberSum = new Distance();
		distanceNumberSum.feet =feet+n.feet;
		distanceNumberSum.inches=inches+n.inches;
		return distanceNumberSum;		
	}
}
