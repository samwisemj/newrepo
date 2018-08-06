
public class Second extends First {
	int a;
	static int staticVariable=1;
	public Second()
	{
		super();
		System.out.println("Ctor... Form Second");
	}
	public void disp()
	{
		System.out.println("I am for class Second");
	}
	public static void staticMethod()
	{
		System.out.println("I am a static method");
	}
}
