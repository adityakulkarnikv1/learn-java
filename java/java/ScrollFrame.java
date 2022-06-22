import java.awt.*;

public class ScrollFrame extends Frame
{
	Scrollbar sb;
	
	public ScrollFrame()
	{
		sb=new Scrollbar(Scrollbar.HORIZONTAL);
		add(sb);
		setVisible(true);
		setSize(100,100);
	}

	public static void main(String arg[])
	{
		ScrollFrame sf=new ScrollFrame();
	}
}