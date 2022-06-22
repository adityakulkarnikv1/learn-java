package util;
//import java.lang.Object
public class Hashcodeequlas {

	private int num;
	private String data;

	/*public boolean equals(Object obj)
	{System.out.println("in equals -obj.getClass()="+obj.getClass());
	System.out.println("in equals -this.getClass()="+this.getClass());
		if(this == obj)
			return true;
		
		if((obj == null) || (obj.getClass() != this.getClass()))
			return false;
		// object must be Test at this point
		Hashcodeequlas test = (Hashcodeequlas)obj;
        System.out.println("test.num="+test.num);     
        System.out.println("test.data="+test.data);
        System.out.println("data.equals(test.data)="+data.equals(test.data));
		return num == test.num &&
		(data == test.data || (data != null && data.equals(test.data)));
	}
*/
	public int hashCode()
	{
		int hash = 7;
		hash = 31 * hash + num;
		 System.out.println("in hashcode="+hash);
		hash = 31 * hash + (null == data ? 0 : data.hashCode());
		return 2;
	}
	public static void main(String[] args) {
		String s1="abc";
		String s2="abcd";
		int h1=s1.hashCode();
		boolean b=s1.equals(s2);
     	int h11=s1.hashCode();
     	int h2=s2.hashCode();
     	System.out.println("h1="+h1);
     	System.out.println("h11="+h11);
     	System.out.println("h2="+h2);
		System.out.println(b);
		
		Hashcodeequlas hc1=new Hashcodeequlas();
		Hashcodeequlas hc2=new Hashcodeequlas();
		System.out.println("hc1="+hc1.hashCode());
		System.out.println("hc2="+hc2.hashCode());
		System.out.println("equals="+hc1.equals(hc2));
		
		
		
		
		
		

	}
}
