import java.awt.*;
import java.applet.*;

public class ParamDemo extends Applet
{
	String fn,fs;

	public void start()
	{
		fn=getParameter("fontName");
		fs=getParameter("fontSize");
	}

	public void paint(Graphics g)
	{
		g.drawString("Font Name" + fn,0,10);
		g.drawString("Font Size" + fs,0,20);
	}
}