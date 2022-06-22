import java.rmi.*;
import java.rmi.registry.*;
public class Server1 {
	public static void main(String args[ ]) {
		try {
		System.setSecurityManager(new RMISecurityManager());
		RMIImpl connect = new RMIImpl("Connect");
		System.out.println("Server started");
		}catch(Exception err) 	{
			System.out.println("Error in Server");
			err.printStackTrace();
		}
	} }
