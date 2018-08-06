//a general rectangle class
class Rectangle
{
	public double getLength() {
		return length;
	}

	public double getBreadth() {
		return breadth;
	}
	private double length;
	private double breadth;
	private double area;
	private double perimeter;
	Rectangle()
	{
		length=0;
		breadth=0;
		area=0;
		perimeter=0;
	}	
	
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}	

	public double getArea() {
		return area;
	}

	public double getPerimeter() {
		return perimeter;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	public void calculateArea()
	{
		area=length*breadth;
	}
	public void calculatePerimeter()
	{
		perimeter=2*(length+breadth);
	}
	public void displayProps()
	{
		System.out.println("Length:"+length+"\nBreadth:"+breadth+"\nArea:"+area+"\nPerimeter"+perimeter);
	}

}
