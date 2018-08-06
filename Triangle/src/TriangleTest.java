//Tests the Triangle class 
import java.io.*;
public class TriangleTest {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args)throws Exception {
		System.out.println("Enter the no of triangles you want to test");
		int n=Integer.parseInt(br.readLine());
		int i;
		Triangle ar[]=new Triangle[n];
		for(i=0;i<n;i++)
		{
			System.out.println("Enter the three sides for triangle"+(i+1));
			ar[i]=new Triangle(Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine()));
		}
		for(i=0;i<n;i++)
		{
			System.out.println("Triangle "+(i+1)+":");
			System.out.println("Equilateral :"+ar[i].isEquilateral());
			System.out.println("Isosceles :"+ar[i].isIsosceles());
			System.out.println("Scalene :"+ar[i].isScalene());
			System.out.println("Right Angled :"+ar[i].isRight());
		}
	}

}
