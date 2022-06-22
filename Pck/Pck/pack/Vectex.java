package pack;
import java.util.Vector;

public class Vectex {
	
	public static void main(String arg[])
	{
		final int i=5;
		// i=4;
		
		 Vector v=new Vector(2);
		v.addElement("ab");
		v.addElement("ab");
		v.addElement("ab");
		v.addElement("ab");
		v.addElement("ab");
		v.addElement("ab");
		System.out.println("v.size()="+v.size());
		for (int j=0;j<v.size();j++)
		System.out.println("v("+j+")="+v.get(j));
		
		final Vector b=new Vector();
		b.addElement("xy");
		System.out.println("b(0)="+b.get(0));
		
		
	}

}
