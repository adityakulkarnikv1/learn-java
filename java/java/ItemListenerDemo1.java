import java.awt.*;
import java.awt.event.*;
public class ItemListenerDemo1 extends Frame implements ItemListener
{
	List lst;
	TextField tf;
	String colorSelected="";
	String fullMess="Colors are:";
	
	public ItemListenerDemo1()
	{
		setSize(400,400);
		setVisible(true);		
		lst=new List();
		tf=new TextField(30);
		lst.add("Green");
		lst.add("Red");
		lst.add("Blue");
		Panel npan=new Panel();
		npan.add(lst);
		add("Center",npan);
		Panel span=new Panel();
		span.add(tf);
		add("South",span);
		lst.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		colorSelected=(String)lst.getSelectedItem();
		fullMess=fullMess+colorSelected;
		tf.setText(fullMess+"  ");		
		
	}

	public static void main(String args[])
	{
		ItemListenerDemo1 ild=new ItemListenerDemo1(); 
		
	}
	
}
		
			
		
		
	