import java.io.*;
public class TestCountries {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args)throws Exception {
		
		System.out.println("Enter the number of countries you want to enter details for");
		int n=Integer.parseInt(br.readLine());
		Country countryArray[]=new Country[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the name, area and population for country "+(i+1));
			countryArray[i]=new Country(br.readLine(), Integer.parseInt(br.readLine()), Long.parseLong(br.readLine()));
			//new Country(name,are,pop)
		}
		
		//initializing the name temporarily
		String largestAreaName=countryArray[0].getName(),largestPopulationName=countryArray[0].getName(),largestDensityName=countryArray[0].getName();
		
		//initializing temporary values
		int largestArea=countryArray[0].getArea();
		long largestPopulation=countryArray[0].getPopulation();
		double largestDensity=countryArray[0].getDensity();
		
		for(int i=0;i<n;i++)//calculates the largest attributes all at once!!
		{
			if(countryArray[i].getArea()>largestArea)
			{
				largestArea=countryArray[i].getArea();
				largestAreaName=countryArray[i].getName();
			}
			
			if(countryArray[i].getPopulation()>largestPopulation)
			{
				largestPopulation=countryArray[i].getPopulation();
				largestPopulationName=countryArray[i].getName();
			}
				
			if(countryArray[i].getDensity()>largestDensity)
			{
				largestDensity=countryArray[i].getDensity();
				largestDensityName=countryArray[i].getName();
			}
			
		}
		
		System.out.println("The Largest Area Is "+largestArea+"\nCountry is "+largestAreaName);
		System.out.println("The Largest Population Is "+largestPopulation+"\nCountry is "+largestPopulationName);
		System.out.println("The Largest Density Is "+largestDensity+"\nCountry is "+largestDensityName);
		
	}
}


