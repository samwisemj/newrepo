//Testing the Television class
import java.io.*;

public class TelevisionTest {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	//a simple menu driven switch case method
	public static void main(String[] args) throws Exception {

		Television tv = new Television();
		do {
			System.out.println(
					"1.Turn on/off Television\n2.Increase/Decrease volume\n3.Change channel\n4.Show Current state\nPLEASE PROVIDE AN INPUT:");
			int ch = Integer.parseInt(br.readLine());
			switch (ch) {
			case 1:
				tv.setState(!tv.getState());
				break;
			case 2:
				System.out.println("1 to Increase or 2 to Decrease ");
				if ((Integer.parseInt(br.readLine()) > 1))
					tv.setVolumeDecrease();
				else
					tv.setVolumeIncrease();
				break;
			case 3:
				System.out.println("Enter the channel number");
				tv.setChannel(Integer.parseInt(br.readLine()));
				break;
			case 4:
				System.out.println("Current State:-");
				System.out.println("State: " + (tv.getState() ? "on" : "off"));
				System.out.println("Volume " + tv.getVolume());
				System.out.println("Channel " + tv.getChannel());
				break;
			default:
				System.out.println("Invalid Input.Please Try Again");
			}

		} while (tv.getState());

	}

}
