//test class for A,B,C
public class TestABC {
	public static void main(String[] args) {
	
		//upcasting, ok
		A a=new C();
		a.disp1();
		
		//gives an error
			//a.disp2();
		
		//upcasting,hence ok...and no error
		B b=new C();
		b.disp1();
		b.disp2();
	}
}
