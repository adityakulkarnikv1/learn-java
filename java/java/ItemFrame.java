import java.awt.*;
import java.awt.event.*;

public class ItemFrame extends Frame implements ItemListener
{
	Choice c;
	TextField tf;
	public ItemFrame()
	{
		tf=new TextField(20);
		c=new Choice();
		c.addItem("vanilla");
		c.addItem("Strawberry");
		c.addItemListener(this);
		add("North",c);
		add("South",tf);
		
		setVisible(true);
		setSize(200,200);		
	}

	public void itemStateChanged(ItemEvent e)
	{
		if(e.getSource()==c)
		{
			tf.setText("hello world");
		}
	}

	public static void main(String arg[])
	{
		ItemFrame f=new ItemFrame();
	}
}