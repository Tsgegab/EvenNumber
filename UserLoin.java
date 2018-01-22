import java.util.Scanner;
public class UserLoin{
	public static void main(String [] args){
		
		String username;
		int password;


		Scanner input = new Scanner(System.in);
		System.out.print("Enter usernmae and password");

		username = input.next();
		password = input.nextInt();


			if(username.equals("Tsegab") && (password==1234))
				System.out.println("Wellcom to Csc201"+ username);
			else
			System.out.println("Invald username or password");
		}
}
