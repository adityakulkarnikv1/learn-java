package reflection;
import java.net.InetAddress;
import java.net.Socket;
//import credit.engine.ServiceProvider;
public class Test {
	   public static void main( String[] args ) throws Exception {
		    /*  ServiceProvider sp = new ServiceProvider(new credit.test.ConcreteConfig());
		      System.out.println(sp);
		      sp.releaseResources();*/
		   Socket sock = new Socket("bastion2t.dnb.com",23202);
		   System.out.println("socket"+sock);
		   
	   }
  }
