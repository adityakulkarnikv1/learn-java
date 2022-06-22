import java.awt.*;
import java.awt.event.*;

public class KeyFrame extends Frame implements KeyListener
{
	Button press,release,typed; 
	TextField tf;

	public KeyFrame()
	{
		press=new Button("Press and Release");
		tf=new TextField(20);

		setLayout(new FlowLayout());

		press.addKeyListener(this);		
		

		add(press);
		add(tf);
		
				
		setVisible(true);
		setSize(200,200);		
	}

	public void keyPressed(KeyEvent e)
	{
		if(e.getSource()==press)
		{
			tf.setText("key pressed");
		}
	}

	public void keyReleased(KeyEvent e)
	{
		if(e.getSource()==press)
		{
			tf.setText("key released");
		}
	}



	public void keyTyped(KeyEvent e)
	{
		
	}
	public static void main(String arg[])
	{
		KeyFrame f=new KeyFrame();
	}
}