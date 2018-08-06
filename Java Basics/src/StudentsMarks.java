import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StudentsMarks {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int maths[]=new int [3];
		int science[]=new int [3];
		int english[]=new int[3];
		
		System.out.println("Enter the marks for Maths,Science and English for Student 1 respectively");
		maths[0]=Integer.parseInt(br.readLine());
		science[0]=Integer.parseInt(br.readLine());
		english[0]=Integer.parseInt(br.readLine());
		
		System.out.println("Enter the marks for Maths,Science and English for Student 2 respectively");
		maths[1]=Integer.parseInt(br.readLine());
		science[1]=Integer.parseInt(br.readLine());
		english[1]=Integer.parseInt(br.readLine());
		
		System.out.println("Enter the marks for Maths,Science and English for Student 3 respectively");
		maths[2]=Integer.parseInt(br.readLine());
		science[2]=Integer.parseInt(br.readLine());
		english[2]=Integer.parseInt(br.readLine());
		
		System.out.println("Student 1 obtained:-\nMaths ="+maths[0]+"\nScience ="+science[0]+"\nEnglish ="+english[0]);
		System.out.println("Student 2 obtained:-\nMaths ="+maths[1]+"\nScience ="+science[1]+"\nEnglish ="+english[1]);
		System.out.println("Student 3 obtained:-\nMaths ="+maths[2]+"\nScience ="+science[2]+"\nEnglish ="+english[2]);
		
		System.out.println("Total Marks obtained by Student 1 ="+(maths[0]+science[0]+english[0]));
		System.out.println("Total Marks obtained by Student 2 ="+(maths[1]+science[1]+english[1]));
		System.out.println("Total Marks obtained by Student 3 ="+(maths[2]+science[2]+english[2]));
		
		System.out.println("Average in Maths = "+(maths[0]+maths[1]+maths[2]));
		System.out.println("Average in Science = "+(science[0]+science[1]+science[2]));
		System.out.println("Average in English = "+(english[0]+english[1]+english[2]));
		
	}

}
