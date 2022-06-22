import java.rmi.*;
import java.rmi.server.*;
interface RMIServer extends Remote {
	public void sendData(String data,String data1) 		throws RemoteException;
	public String receiveData() 
		throws RemoteException;
}
