//To test our Vehicle interface
public class VDemo {

	public static void main(String[] args) {
		
		Vehicle v[]=new Vehicle[3];
		v[0]=new TwoWheeler();
		v[1]=new ThreeWheeler();
		v[2]=new FourWheeler();
		for(int i=0;i<v.length;i++)
		{
			if(v[i].getClass().getName()=="ThreeWheeler")
				v[i].start();
		}

	}

}
