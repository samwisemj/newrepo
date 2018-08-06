/**
 * country class with a few country properties
 */

/**
 * @author subhamsa
 *
 */
public class Country {

	private String name;
	private int area;
	private long population;
	private double density;
	
	public String getName() {
		return name;
	}
	public int getArea() {
		return area;
	}
	public long getPopulation() {
		return population;
	}
	public double getDensity() {
		return density;
	}
	
	public Country(String name,int area, long population) {
		this.area = area;
		this.population = population;
		this.density = population/area;
		this.name=name;	
	}	
}
