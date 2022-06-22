import java.net.*; 
import java.io.*; 
public class URLExample 
{
public static void main(String args[]) 
{ 
try {

	URL url = new URL("http://localhost/default.htm");
	URLConnection connection = 	url.openConnection();
	InputStream input = connection.getInputStream();
	byte store[] = new byte[input.available()]; 
	BufferedInputStream instream = new BufferedInputStream(input); 
	instream.read(store,0,store.length);
	System.out.println("Data : "+(new String(store)));
    }
 
    catch(Exception err)
    {
       System.out.println("Error"); 
    } 
}
}
