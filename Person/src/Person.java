import java.time.LocalDate;
/**
 * A person class with some basic implementation about props of a person
 */

/**
 * @author subhamsa
 *
 */
public class Person {

	private String name;
	private Date dob;

//		
	public Person(int d, int m, int y, String name) {
		dob = new Date(d, m, y);
		this.name = name;
	}

	public void display() {
		
		System.out.println("Name " + name);
		// converting into dd mm yyyy
		String day = Integer.toString(dob.getD()), month = Integer.toString(dob.getM()),
				year = Integer.toString(dob.getY());
		if (dob.getD() < 10)
			day = "0" + day;
		if (dob.getM() < 10)
			month = "0" + month;

		// printing using this format
		System.out.println("DOB:- " + day + "/" + month + "/" + year);
		
		//Converting current time to my local date class
		LocalDate now = LocalDate.now();
		int currentMonth = now.getMonthValue();
		int currentYear = now.getYear();
		int currentDay = now.getDayOfMonth();
		Date currentDate = new Date(currentDay, currentMonth, currentYear);
		int ageArray[] = dob.differenceSecondWay(currentDate);
		System.out.println("Age is " + ageArray[0] + " days, " + ageArray[1] + " months and " + ageArray[2] + " years");
	}
	
	//checks older one of the instantiating object and arg object
	public void olderOne(Person p)
	{
		int ageDifference[]=dob.differenceSecondWay(p.dob);
		//System.out.println("Age difference is " + ageDifference[0] + " days, " + ageDifference[1] + " months and" + ageDifference[2] + " years");
		
		System.out.println(this.name+" is older than "+p.name+" by "+ ageDifference[0] + " days, " + ageDifference[1] + " months and " + ageDifference[2] + " years");
	}
}
