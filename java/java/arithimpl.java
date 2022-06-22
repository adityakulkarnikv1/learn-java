import java.rmi.*;
import java.rmi.server.*;


public class arithimpl extends UnicastRemoteObject implements arith
{
	public arithimpl(String name) throws RemoteException
	{
		super();
		try
		{
			Naming.rebind(name,this);
		}
		catch(Exception err)
		{
			System.out.println("Unable to bind");
		}
	}

	public int sum(int x,int y) throws RemoteException
	{
		return x+y;
	}
}	
		
	