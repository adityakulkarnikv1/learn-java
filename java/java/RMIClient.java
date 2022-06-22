import java.awt.*;
import java.awt.event.*;
import java.rmi.*;
import java.rmi.registry.*;
class RMIClient extends Frame implements ActionListener  {
	Label l_fname, l_address;
	TextField tf_fname;
	TextArea ta_address;
	Button b_submit;
	
	
public RMIClient( ) {
		setTitle("Send Data");
		l_fname = new Label("File Name",Label.LEFT );
		l_address = new Label("Data ",Label.LEFT );
		tf_fname = new TextField(20);
		ta_address = new TextArea(4,30);
		b_submit = new Button("Submit");
		b_submit.addActionListener(this);
		addWindowListener(new FrameCloser());
		setLayout(new GridLayout(3,2));
		add(l_fname);
		add(tf_fname);
		add(l_address);
		add(ta_address);
		add(b_submit);		
		setSize(200,200);
		setVisible(true);
			}
public void actionPerformed(ActionEvent evt) {
	try {
	RMIServer server = (RMIServer)Naming.lookup("rmi://localhost/Connect");
	String name = tf_fname.getText();
	String address = ta_address.getText();
	server.sendData(name,address);
	System.out.println("Data stored in file");
	}catch(Exception err) {
		System.out.println("Unable to contact server");
		}
	}
	class FrameCloser extends WindowAdapter {
		public void windowClosing(WindowEvent e) 	{
			System.exit(0);
		} 	}

	public static void main(String args[ ]) {
		try {
		RMIClient r = new RMIClient();
		}catch(Exception err) 	{
			err.printStackTrace();
		}
	} }
