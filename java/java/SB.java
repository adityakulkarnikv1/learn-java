public class SB
{
	public static void main(String arg[])
	{
		
		StringBuffer sb = new StringBuffer("Hello ");
		StringBuffer output = sb.append(" World");
	
		System.out.println("Result of append : " +output);
		output = sb.insert(0,5);
		System.out.println("Result of insert : "+output);
	}
}