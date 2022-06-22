import java.rmi.*;
import java.rmi.server.*;
import java.io.*;
public class RMIImpl extends UnicastRemoteObject implements RMIServer 
	{
	private RandomAccessFile raf = null;
	public RMIImpl(String name) throws RemoteException  {
	super();
	try {
		Naming.rebind(name,this);
	} catch(Exception err) {
		System.out.println("Unable to bind");
	}
	}

		public String receiveData(){
		//code to be added
		return null;	}
	public void sendData(String data,String data1) 	{
		try {
		raf=new RandomAccessFile("c:\\abc.txt","rw");
		raf.seek(raf.length( ));
		byte b[ ]=new byte[(int)raf.length()];
		raf.write(b,0,b.length);
		}catch(Exception err) {
			err.printStackTrace();
			}   }   }
