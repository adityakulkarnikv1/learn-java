package com.hp;
import java.util.*;

public class BasicTest {
	
	
	public static void main(String str[])
	{
		int i,j,k,l;
		i=j=k=l=3;
		int n=2*++i;
		int m=2*j++;
		++k;
		l++;
		
		System.out.println("i="+i+"j="+j+"n="+n+" m="+m+"k="+k+"  l="+l);
		
		String s="bicycle";
		System.out.println(s.substring(1,3));
		System.out.println(s);
		
		String s1="example";
		System.out.println(s1.substring(2,4));
		System.out.println(s1);
		
		ArrayList al=new ArrayList();
		al.add("test");
		String st="123asdhdk";
		HashMap hm=new HashMap();
		for(int x=0;i<st.length();x++)
		{
			char c=st.charAt(x);
			if(hm.containsKey(c))
			{
				int y=hm.get(c);
				
			}
			else {
				 hm.put(c, 1);
				
				
			}
		}
		
		
		
	}

}
