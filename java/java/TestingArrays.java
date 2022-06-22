public class TestingArrays
{
public static void main(String arg[])
{
	if(arg.length==0)
	{
	System.out.println("Usage: Enter the count as command line argument");
	System.exit(0);
	}
	
	String scount=arg[0];
	int count=Integer.parseInt(scount.trim());
	UsingArrays ua=new UsingArrays();
	String name[]=ua.getInput(count);
	for(int i=0;i<count;i++)
	{
	System.out.println("Entered Name : "+name[i]);
	}
}
}
