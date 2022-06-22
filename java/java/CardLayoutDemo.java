import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/* <applet code=CardLayoutDemo width=300 height=300></applet>*/
public class CardLayoutDemo extends Applet implements ActionListener
{
	Checkbox a,b,c,d;
	Button b1,b2;
	CardLayout cl;
	Panel p1,p2,p3;
	Label l1,l2;

	public void init()
	{
		try
		{
		

		b1=new Button("Windows");
		b2=new Button("Other");
			
		add(b1);
		add(b2);		
		
		cl=new CardLayout();
		p1=new Panel();
		p1.setLayout(cl);

		a=new Checkbox("win98");		
		b=new Checkbox("winnt");
		c=new Checkbox("Solaris");
		d=new Checkbox("Others");
		

		p2=new Panel();
		p2.add(a);
		p2.add(b);

		p3=new Panel();
		p3.add(c);
		p3.add(d);
		
		p1.add(p2,"Windows");			
		p1.add(p3,"Other");

		add(p1);

		b1.addActionListener(this);	
		b2.addActionListener(this);	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
			cl.show(p1,"Windows");
		else
			cl.show(p1,"Other");
	}
}