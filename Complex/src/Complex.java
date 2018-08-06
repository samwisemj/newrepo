//a class that is used for complex numbers
public class Complex
{
	private float real;
	private float imaginary;
	public void set(float real,float imaginary)
	{
		this.imaginary=imaginary;
		this.real=real;
	}
	public void display()
	{
		System.out.println(real+" + "+imaginary+"i");
	}
	public Complex sum(Complex secondNo)
	{
		Complex complexNumberSum = new Complex();
		
		complexNumberSum.real = real + secondNo.real;
		complexNumberSum.imaginary = imaginary + secondNo.imaginary;
		return complexNumberSum;		
	}
}
