import java.io.*;
import java.util.ArrayList;
import java.net.InetAddress;
import java.util.Scanner;

class StartMenu
{
	static void show()
	{
		DisplayTools.printDash();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("[1] Enter ip");
		System.out.println("[2] Find all devices");
		System.out.println("[3] Exit");
		
		System.out.print("\n\n>> ");
		
		String s;
		while(true)
		{
			try{
				s = br.readLine();
				break;
			}
			catch(IOException e){
				System.out.println("Invalid input. try again.\n>> ");
			}
		}
			
		switch(s)
		{
			case "1": 
				System.out.print("Enter ip: ");
				while(true)
				{
					try{
						JMClient.connectIp = br.readLine();
						break;
					}
					catch(IOException e){
						System.out.println("Invalid input. try again.\n>> ");
					}
				}
				break;
				
			case "2":
				checkHosts("192.168.0");
				break;
				
			case "3":
				System.exit(0);
		}
	}
	
	private static void checkHosts(String subnet){
		ArrayList<String> connectedIpList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		
		//For a given subnet this part searches for all the available ip.
		int timeout=100, j=0;
		System.out.println("Searching...");
		for (int i=1;i<255;i++)
		{
		   String host=subnet + "." + i;
		   try{
			   if (InetAddress.getByName(host).isReachable(timeout)){
					connectedIpList.add(host);
					System.out.println("[" + (++j) + "] " + host);
				}
			} catch(Exception e){}
		}
		System.out.println("Search completed");
		
		
		
		// Connect to an ip
		
		while(true)
		{
			System.out.println("Enter 0 to go back or enter the ip to connect to\n\n>>");
			int choice  = sc.nextInt();
			if(choice <= j)
			{
				if(choice!=0) JMClient.connectIp=connectedIpList.get(j-1);
				else show();
				break;
			}
			else
			{
				System.out.println("Invalid. Try again.\n>> ");
			}
		
		}
	}
}


			
