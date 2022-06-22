import java.rmi.*;
import java.rmi.registry.*;

class arithclient 
{
	public static void main(String arg[]) throws Exception
	{
		arith obj=(arith)Naming.lookup("rmi://localhost/add");
		int sum=obj.sum(3,5);
		System.out.println("The sum of two numbers is"+sum);
	}
}