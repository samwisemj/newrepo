public class Sub1 extends Base1 {

	int i;
	int j;
	//int k;

	public Sub1() {
		super(100);
		
		System.out.println("ctor.....Sub1()");
	}

	public Sub1(int i) {
		super(i);
		this.i = i;
		System.out.println("ctor.....Sub1(int)");
	}

	public Sub1(int i, int j) {
		super(i);
		this.i = i;
		this.j = j;
		System.out.println("ctor.....Sub1(int,int)");
	}

}
