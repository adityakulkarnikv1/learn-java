import java.net.*;
import java.io.*;
public class DatagramClient {
public static void main(String args[])
 { if(args.length == 0)
    {
        System.out.println("Usage : java DatagramClient <server address>");  
	System.exit(0);
    }
String address = args[0]; 
DatagramPacket dgp = null; 
DatagramSocket dgs = null;
byte receive[] = new byte[50]; 
try{
/**contacts the server port 5000 to get the data*/
dgs = new DatagramSocket (6000,InetAddress.getByName(address));
/**receives the data onto the receive array*/
dgp = new DatagramPacket (receive,receive.length);
dgs.receive(dgp); 
System.out.println("data received : " +(new String(receive))); 
dgs.close();} 
catch(Exception err) { 
System.out.println("Exception in client");
}}} 
