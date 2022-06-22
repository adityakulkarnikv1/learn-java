import java.rmi.*;
import java.rmi.registry.*;

public class arithserver
{
	public static void main(String arg[]) throws Exception
	{
		System.setSecurityManager(new RMISecurityManager());
		arithimpl obj=new arithimpl("add");
		System.out.println("Server started");
	}
}