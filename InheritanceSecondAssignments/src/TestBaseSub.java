//testing class for testing inheritance
public class TestBaseSub {

	public static void main(String[] args) {
		
		//it will invoke super and non arg ctor
		Sub1 sub=new Sub1();
		
		//it will invoke base class and single arg ctor....
		sub=new Sub1(10);
		
		//it will invoke base class and double arg ctor....
		sub=new Sub1(10,20);
	
	}

}
