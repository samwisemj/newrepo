import java.io.*;
public class LoginAuthenticate{
	public static void main(String args[])throws IOException{
		int count = 0;
		String userID,password;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do{
			System.out.println("Enter User ID and Password");
			userID = br.readLine();
			password = br.readLine();
			if (userID.equals("Admin")&&password.equals("pass")){
				System.out.println("Welcome!");
				break;
			}
			else{
				System.out.println("Invalid UserID/Password");
				count++;
			}
		}while(count<3);
		if(count == 3)
			System.out.println("Contact Admin");
	}
}