
public class TestCheck extends Check {

	public static void main(String[] args) {

		Check check = new Check();
		// trying to access the private variable directly will give error
		//		System.out.println(check.privateVariable);

		/*
		 * accessing the protected, public and the default variables should just be fine
		 */

		System.out.println(check.defaultVariable);
		System.out.println(check.protectedVariable);
		System.out.println(check.publicVariable);
	}

}