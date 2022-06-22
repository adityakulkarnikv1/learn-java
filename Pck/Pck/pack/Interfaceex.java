package pack;

interface a
{
	 int i=1;
	String s1="s";
}

interface b
{
	int j=2;
	String s2="SHANKAR";
}

interface c extends a,b
{
	int k=3;
	String s3="hi";
	//System.out.println("i="+i);
}
public class Interfaceex implements c 

{
	public static void main(String at[])
	{
		System.out.println("i="+i);
		System.out.println("j="+j);
		System.out.println("k="+k);
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
		System.out.println("s3="+s3);
	}

}
