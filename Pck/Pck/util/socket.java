package util;
import java.net.InetAddress;
import java.net.Socket;
public class socket {
    public static void main( String[] args ) throws Exception {
  
    //	session_ = new Session( Session.MESSAGEID, "dunslink2.dnb.com", 23202); 
    //	Socket	sock = new Socket("159.137.146.233",23202);
   InetAddress addr_ = InetAddress.getByName("lxomd59e.dev.qintra.com"); // set Host object.
   System.out.println("addr_.getHostAddress()"+addr_.getHostAddress());
 
   Socket	sock = new Socket(addr_.getHostAddress(),12080);
    	System.out.println("session"+sock);
    }
  }
