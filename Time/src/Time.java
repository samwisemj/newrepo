//a Time class with time's properties
public class Time {

	private int hours;
	private int minutes;
	public void set(int hours,int minutes)
	{
		this.hours=hours;
		this.minutes=minutes;
	}
	public void display()
	{
		System.out.println(hours+"h "+minutes+" mins");
	}
	public Time sum(Time n)//adds instance Time and arg Time
	{
		Time timeNumberSum = new Time();
		timeNumberSum.hours =hours+n.hours;
		timeNumberSum.minutes=minutes+n.minutes;
		while(timeNumberSum.minutes>=60)
		{
			timeNumberSum.hours+=1;
			timeNumberSum.minutes-=60;
		}
		return timeNumberSum;		
	}
}
