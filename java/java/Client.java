import java.io.*;
import java.net.*;

public class Client 
{
	
	
	private Socket socket=null;
	private BufferedOutputStream send=null;
	

	public Client()
	{
	
		try
		{
			socket=new Socket(InetAddress.getByName("mdccorp4"),3000);
			System.out.println("Socket created");
			send=new BufferedOutputStream(socket.getOutputStream());
			String s="Hello from client";
			byte b[]=s.getBytes();
			send.write(b,0,b.length);
			send.flush();
			//send.close();
			
			
			

		}
		catch(Exception err)
		{
			System.out.println("Socket creation failed");
		}
		
	
	}

	public static void main(String arg[])
	{
		new Client();
	}
}
			