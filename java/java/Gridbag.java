import java.awt.*;

/*<applet code=Gridbag width=300 height=300></applet>*/
public class Gridbag extends java.applet.Applet
{
	public void init()
	{
		GridBagLayout gb=new GridBagLayout();	
		GridBagConstraints gbc=new GridBagConstraints();
		Button b;

		setLayout(gb);

		gbc.anchor=GridBagConstraints.NORTHWEST;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.gridx=0;
		gbc.gridy=0;

		b=new Button("First");
		gb.setConstraints(b,gbc);
		add(b);

		b=new Button("Second");
		gbc.gridx=1;
		gbc.gridwidth=4;		
		gb.setConstraints(b,gbc);
		add(b);

		b=new Button("Third");
		gbc.gridx=1;
		gbc.gridy=1;
		gbc.gridwidth=GridBagConstraints.REMAINDER;		
		gb.setConstraints(b,gbc);
		add(b);
				
	}
}		