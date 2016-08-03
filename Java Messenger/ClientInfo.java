import java.util.Scanner;

class ClientInfo
{
	String username;
	String connectToIp;
	Scanner sc = new Scanner(System.in);
	
	
	ClientInfo()
	{
		
		// Take user name
		DisplayTools.printDash();
		System.out.print("Enter your name(max 15 char): ");
		username = sc.nextLine();
		if(username.length()>15)username = username.substring(0, 14);
		System.out.println("Hello " + username);	
		DisplayTools.printDash();
	}
	
	
}
		
			
