import java.awt.*;
import java.applet.*;
import java.net.*;

/*
<applet code="ACDemo" width=100 height=100></applet>
*/

public class ACDemo extends Applet
{
	

	public void start()
	{
		AppletContext ac=getAppletContext();
		URL url=getCodeBase();
		

		try
		{
			ac.showDocument(new URL(url+"Test.htm"));
		}
		catch(Exception e)
		{
			showStatus("URL not found");
		}
	}
}
	