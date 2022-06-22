package thread;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class Hashcd {
	public static void main(String arg[])
	{
		String s1="shankar";
		String s2="deshapande";
		String s3="shankar";
		
		String s4=new String("shankar");
		String s5=new String("deshapande");
		String s6=new String("shankar");
		StringBuffer sb1=new StringBuffer("shankar");
		StringBuffer sb2=new StringBuffer(s4);
		System.out.println("sb1.equals(s1)"+sb1.equals(s1));
		System.out.println("sb1.equals(s2)"+sb1.equals(s4));
		System.out.println("sb1.equals(sb2)"+sb1.equals(sb2));
		System.out.println("sb1.hc="+sb1.hashCode());
		System.out.println("s1.hc="+s1.hashCode());
		System.out.println("s2.hc="+s2.hashCode());
		System.out.println("s3.hc="+s3.hashCode());
		System.out.println("s4.hc="+s4.hashCode());
		System.out.println("s5.hc="+s5.hashCode());
		System.out.println("s6.hc="+s6.hashCode());
		Hashtable ht=new Hashtable();
		ht.put(s1, s1);
		ht.put(s2, s2);
		ht.put(s3, s3);
		ht.put(s4, s4);
		ht.put(s5, s5);
		ht.put(s6, s6);
		ht.put(sb1.toString(), sb1.toString());
		 Vector v = new Vector(ht.keySet());
		    Collections.sort(v);
		    
		    
		    // Display (sorted) hashtable.
		    for (Enumeration e = v.elements(); e.hasMoreElements();) {
		      String key = (String)e.nextElement();
		      String val = (String)ht.get(key);
		      System.out.println("Key:-hashcode  " + key +";"+key.hashCode()+"Val:-Hash code= " + val+";"+val.hashCode());
		    }
	  Hashtable ht1=new Hashtable();
	  ht1.put(s4,s4);
	  ht1.put(sb1, sb1);
	  ht1.put(sb1, sb1);
	  System.out.println("s4.get="+ht1.get(s4));
	  System.out.println("sb1.get="+ht1.get(sb1));
	  System.out.println("s4.equalssb1="+s4.equals(sb1));
	  System.out.println("sb1.hc="+sb1.hashCode());
	  System.out.println("s4.hc="+s4.hashCode());
	  String s11 = new String("BB");
      String s12 = new String("Aa");
      System.out.println(s11.hashCode());
      System.out.println(s12.hashCode());

		
	}

}
