//class to test Date
public class DateTest {

	public static void main(String[] args) {
		Date newDate=new Date(7,7,2018);
		Date anotherNewDate=new Date(1,1,1990);
		int ar[]=newDate.differenceFirstway(anotherNewDate);
		System.out.println("Date 1:-"+newDate);
		System.out.println("Date 2:-"+anotherNewDate);
		System.out.println("Total Days difference is "+ar[0]+"\nTotal Months difference is "+ar[1]+"\nTotal Years difference is "+ar[2]);
		
	}

}
