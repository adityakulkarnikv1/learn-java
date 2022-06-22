import java.rmi.*;

interface arith extends Remote
{
	public int sum(int x,int y) throws RemoteException;
}