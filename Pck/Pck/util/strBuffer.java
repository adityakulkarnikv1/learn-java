package util;
import java.util.*;

import file.A;


 public class strBuffer implements i1{
	
	public void m1()
	{
		System.out.println("in m1");
	}
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Shankar");
		System.out.println("Sb-Before reverse="+sb);
		System.out.println("Sb-Before reverse="+sb.toString());
		sb.reverse();
		System.out.println("sb-afrter reverse="+sb);
		System.out.println("sb-afrter reverse="+sb.toString());
		//String str="deshapande";
		String str="abcd";
		//String str="nd";
		char oldstr[]=str.toCharArray();
		 char newstr[]=new char[oldstr.length];
		 System.arraycopy(oldstr, 0, newstr, 0, oldstr.length);
		 for(int i=0;i<oldstr.length;i++)
		 {
			 System.out.println("newstr["+i+"]="+oldstr[(oldstr.length-1)-i]);
			 newstr[i]=oldstr[(oldstr.length-1)-i];
		 }
		 String rev=String.valueOf(newstr);
		 System.out.println("Rev="+rev);
		 int n=oldstr.length-1;
		 System.out.println("n="+n);
		 System.out.println("j=(n-1) >> 1="+((n-1) >> 1));
		 for (int j = (n-1) >> 1; j >= 0; --j) {
			    char temp = oldstr[j];
			    oldstr[j] = oldstr[n - j];
			    oldstr[n - j] = temp;
			}
		 
		 
		 for (int i=0;i<oldstr.length;i++)
			 System.out.println(oldstr[i]);
		 String str1=new String(oldstr);
		 String text=String.valueOf(oldstr);
		 System.out.println("str1="+str1);
		 System.out.println("text="+text);
		System.out.println("old str="+oldstr.toString());//Prints Adddress
		System.out.println("old str="+oldstr);//Prints Adddress of Object
		String str5="ab;cd;ef;gh;ij";
		StringTokenizer st=new StringTokenizer(str5,";");
		while(st.hasMoreElements())
		{
			System.out.println(st.nextElement());
		}
		
		
	/*	public synchronized StringBuffer reverse() {
			if (shared) copy();
			int n = count - 1;
			for (int j = (n-1) >> 1; j >= 0; --j) {
			    char temp = value[j];
			    value[j] = value[n - j];
			    value[n - j] = temp;
			}
			return this;
		    }
		public StringBuffer(int length) {
			value = new char[length];
			shared = false;
		    }
		private final void copy() {
			char newValue[] = new char[value.length];
			System.arraycopy(value, 0, newValue, 0, count);
			value = newValue;
			shared = false;
		    }*/
		strBuffer a=new strBuffer();
		a.m1();
	}
}
