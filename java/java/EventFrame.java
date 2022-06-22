import java.awt.*;
import java.awt.event.*;

public class EventFrame extends Frame 
{
	TextField tf;
	Button b;
	Button b1;
	public EventFrame()
	{
		
		tf=new TextField(20);
		b=new Button("Click here to add text");
		b1=new Button("Click here to remove text");

		setLayout(new FlowLayout());

			
		add(tf);
		add(b);
		add(b1);
	
		setVisible(true);
		setSize(200,200);		
	}

	public boolean action(Event evt,Object obj)
	{
		if(evt.target==b)
		{
			tf.setText("hello world");
		}

		if(evt.target==b1)
		{
			tf.setText("");
		}		
		return true;
	}

	
	
	public static void main(String arg[])
	{
		EventFrame f=new EventFrame();
	}
}