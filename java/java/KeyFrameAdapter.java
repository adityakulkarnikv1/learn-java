import java.awt.*;
import java.awt.event.*;

public class TextFrame extends Frame implements TextListener
{
	Label l;
	TextField tf;

	public TextFrame()
	{
		l=new Label("Hi");
		tf=new TextField(20);

		setLayout(new FlowLayout());

		tf.addTextListener(this);		

		add(press);
		add(tf);
		
		setVisible(true);
		setSize(200,200);		
	}

	public void textValueChanged(TextEvent e)
	{
		if(e.getSource()==tf)
		{
			l.setText("Text is changing");
		}
		else
			l.setText("hi");
	}

	
	public static void main(String arg[])
	{
		TextFrame f=new TextFrame();
	}
}