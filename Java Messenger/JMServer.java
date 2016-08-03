import java.io.*;  
import java.net.*;

class JMServer {
	void runServer(){
		try{
			ServerSocket ss=new ServerSocket(6666);
			Socket s=ss.accept();//establishes connection
			DataInputStream dis=new DataInputStream(s.getInputStream());
			String  str="";

			while(!str.equals("exit"))
			{
				str=(String)dis.readUTF();
				System.out.println(str);
			}
			ss.close();
		}catch(Exception e){System.out.println(e);}
	}
}
