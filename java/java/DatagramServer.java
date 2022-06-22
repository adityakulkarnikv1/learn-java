import java.net.*;
import java.io.*; 
public class DatagramServer { 
public static void main(String args[]) {
DatagramPacket dgp = null; 
DatagramSocket dgs = null;
String message = "Hello from Server"; 
byte send[ ] = new byte[message.length()]; send = message.getBytes(); 
try { 
/**socket at the server*/
dgs = new DatagramSocket();

/**datagram packet to send the data to its port 5000*/
dgp = new DatagramPacket(send,send.length, InetAddress.getLocalHost( ),5000); 
dgs.send(dgp); 
System.out.println("data sent"); 
dgs.close( );
} 
catch(Exception err) 
{
err.printStackTrace(); 
System.out.println("Exception in server "); 
}
}
}
