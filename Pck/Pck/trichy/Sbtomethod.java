package trichy;

public class Sbtomethod {

	//static StringBuffer sb=new StringBuffer();
	public  static void process(StringBuffer sb ,int i)
	{
		sb.append("Shankar");
		i++;
		System.out.println("in method="+i);
		i++;
		System.out.println("in method="+i);
	}
	
	
	public static void main(String arg[])
	{
		StringBuffer sb=new StringBuffer("Hello!");
		
 int i=10;
		process(sb,i);
		
		System.out.println(sb.toString()+","+i);
		
		System.out.println(sb+","+i);
		
		String s1="Shankar";
		String s2=new String("Shankar");
		StringBuffer  sb1=new StringBuffer("Shankar");
		System.out.println(s1.equals(sb1));
		System.out.println("sb1.hc="+sb1.hashCode());
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
		
		String s3=s1+s2;
		System.out.println("s3="+s3);
		
		System.out.println("s1=hc="+s1.hashCode());
		
		System.out.println("s2=hc="+s2.hashCode());
		System.out.println("s3=hc="+s3.hashCode());
		
		
		
		
		
	}
}
