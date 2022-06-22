package compare;
import java.util.List;
public class CaseInsensitiveComparator implements java.util.Comparator {
 public int compare(Object o1, Object o2) {
   String s1 = o1.toString().toUpperCase();
   String s2 = o2.toString().toUpperCase();
   System.out.println("s1="+s1+" s2="+s2 +"s1.compareTo(s2)"+s1.compareTo(s2));
   return s1.compareTo(s2);
 }
 
 final void m1()
 {
	 System.out.println("im m1-final");
 }
 
 
 
 public static void main(String args[])
 {
	 
	 Person p1=new Person("Shankar","Rao");
	  Person p2=new Person("Rajini","deshp");
	 
	  Person p3=new Person("Shankar","Rao");
	  Person p4=new Person("Shankar","Rao");
	  System.out.println("p1.hc="+p1.hashCode());
	  System.out.println("p2.hc="+p2.hashCode());
	  System.out.println("p3.hc="+p3.hashCode());
	  System.out.println("p4.hc="+p4.hashCode());
	  
	  //System.out.println("p3==p4="+p3==p4);
	  System.out.println("p1.equals(p2)=="+p1.equals(p2));
	  System.out.println("p1.equals(p1)=="+p1.equals(p1));
	  System.out.println("p3.equals(p4)=="+p3.equals(p4));
	//  System.out.println("this="+this);
	  //System.out.println("obj.getClass()=="+obj.getClass());
	//System.out.println("this.getClass()=="+this.getClass());
		
	  
	 //Object[] data = {"Aubergine","banana","aubergine","Banana"};
	  Object[] data = {p1,p2};
	   List list = java.util.Arrays.asList(data);
	   java.util.Collections.sort(list, new CaseInsensitiveComparator());
	   System.out.println(list);
	   
	   StringBuffer sb=new StringBuffer("shankar");
	   StringBuffer sb1=new StringBuffer("shankar");
	   String s=new String("shankar");
	   String s1=new String("shankar");
	   String s2="shankar";
	   String s3="shankar";
	   System.out.println("sb.equals(sb1)=="+sb.equals(sb1));
	  System.out.println("sb.equals(sb)=="+sb.equals(sb));
	  System.out.println("sb1.equals(sb1)=="+sb1.equals(sb1));
	  System.out.println("sb1.equals(s)=="+sb1.equals(s));
	  System.out.println("s1.equals(s)=="+s1.equals(s));
	  System.out.println("(s1==s)=="+(s1==s));
	  System.out.println("(s1==s2)=="+(s1==s2));
	  System.out.println("(s2==s3)=="+(s2==s3));
	  System.out.println("s2.equals(s3))=="+s2.equals(s3));
	  System.out.println("sb.hc="+sb.hashCode());
	  System.out.println("sb1.hc="+sb1.hashCode());
	  System.out.println("s.hc="+s.hashCode());
	  System.out.println("s1.hc="+s1.hashCode());
	  System.out.println("s2.hc="+s2.hashCode());
	  System.out.println("s3.hc="+s3.hashCode());
	  int i=0;
	  int j=1;
	  System.out.println(i);
	  System.out.println(j);
	  
	  for(int x=3;x<=8;x++)
	  {
		  int k=i+j;
		  i=j;
		  j=k;
		  System.out.println(k);
		  
	  }
	

	   

 }
}

