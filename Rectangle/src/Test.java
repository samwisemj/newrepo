//testing Rectangle class
import java.io.*;
public class Test {

	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args)throws Exception {
		
		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle();
		
		System.out.println("Enter the length and breadth of the First rectangle");
		r1.setLength(Double.parseDouble(br.readLine()));
		r1.setBreadth(Double.parseDouble(br.readLine()));
		
		System.out.println("Enter the length and breadth of the Second rectangle");
		r2.setLength(Double.parseDouble(br.readLine()));
		r2.setBreadth(Double.parseDouble(br.readLine()));
		
		r1.calculateArea();
		r2.calculateArea();
		r1.calculatePerimeter();
		r2.calculatePerimeter();
		
		System.out.println("RECTANGLE 1:-");
		r1.displayProps();
		System.out.println("RECTANGLE 2:-");
		r2.displayProps();
		
		if((r1.getBreadth()!=r2.getBreadth()) &&(r1.getLength()!=r2.getLength()) )
		{
			if(r1.getArea()==r2.getArea())
				System.out.println("The area of the two rectangles are equal");
			else
				System.out.println("The area of the two rectangles are not equal");
		
			if(r1.getPerimeter()==r2.getPerimeter())
				System.out.println("The Perimeter of the two rectangles are equal");
			else
				System.out.println("The Perimeter of the two rectangles are not equal");

		}
	}

}
