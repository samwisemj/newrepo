//class to test  Parent1,Parent2 and Child
public class TestChildParent {

	public static void main(String[] args) {
		Parent1 parent1;
		Parent2 parent2;
		
		//upcasting and calling from the Inherited Class object reference
		parent1=new Child();
		parent1.display();
		
		//upcasting and calling from the Interface object reference
		parent2=new Child();
		parent2.display();
	}

}
