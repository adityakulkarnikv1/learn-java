public class Factorial
{
	public static void main(String arg[])
	{
		if(arg.length==0)
		{
			System.out.println("Enter the number");
			System.exit(0);
		}

		int num=Integer.parseInt(arg[0]);
		int fact=1;

		for(int i=num;i>0;i--)
		{
			fact=fact*num;
			num-=1;
		}			

		System.out.println("The factorial of the number " + arg[0] + " is " + fact);
	}
}
		
		