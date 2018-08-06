public class Two {
	public static void main(String args[]) {

		First a = new First();
		Second b = new Second();
		a.disp();
		b.disp();
		
		//accessing static member
		System.out.println(Second.staticVariable);
		//accessing static method
		Second.staticMethod();
		
	}
}
