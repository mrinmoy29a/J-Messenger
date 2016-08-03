import java.io.*;  
import java.net.*;  
import java.util.regex.*;

class JMClient{  
	
	static String connectIp="";
	
	void runClient() 
	{  
		boolean connected = false;
		
		while(!connected)
		{
			try{    
					if(!validateIp()) break;
					Socket s=new Socket(connectIp, 6666);  
					DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
					BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
					String str = "";
					
					// Run After getting connected to the server
					connected = true;
					System.out.println("Connected to " + connectIp);
					
					//DisplayTools.clearConnecting();
					ClientInfo ci = new ClientInfo();
					
					while(!str.equals("exit"))
					{
						System.out.print("||| ");
						str = br.readLine();
						dout.writeUTF(ci.username + ": " + str);  
					}  
				
					dout.flush();  
					dout.close();  
					s.close(); 
				}catch(Exception e){}
		}
		
		if(!validateIp())
		{
			System.out.println("Not valid ip. Returning to main menu");
			StartMenu.show();
		} 
	}
	
	boolean validateIp()
	{
		String ip = connectIp;
		if (ip == null || ip.isEmpty()) return false;
		ip = ip.trim();
		if ((ip.length() < 6) & (ip.length() > 15)) return false;

		try {
			Pattern pattern = Pattern.compile("^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$");
			Matcher matcher = pattern.matcher(ip);
			return matcher.matches();
		} catch (PatternSyntaxException ex) {
			return false;
		}
	}
}  
