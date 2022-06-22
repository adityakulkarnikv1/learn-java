import java.awt.*;
import java.awt.event.*;

public class TextFrame extends Frame implements TextListener,ActionListener
{
	Label l;
	TextField tf;
	Button b;
	public TextFrame()
	{
		l=new Label("text listener example");
		tf=new TextField(20);
		b=new Button("Reset");

		setLayout(new FlowLayout());

		tf.addTextListener(this);		
		b.addActionListener(this);
	
		add(tf);
		add(l);
		add(b);
	
		setVisible(true);
		setSize(200,200);		
	}

	public void textValueChanged(TextEvent e)
	{
		if(e.getSource()==tf)
		{
			l.setText("Text is changing");
		}
		
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
		{
			tf.setText("");
			repaint();
			
		}
			
	}
		
	public void paint(Graphics g)
	{
		l.setText("text listener example");
	}
			
	
	
	public static void main(String arg[])
	{
		TextFrame f=new TextFrame();
	}
}