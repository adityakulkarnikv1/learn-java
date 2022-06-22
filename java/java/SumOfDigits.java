public class SumOfDigits
{
	public static void main(String arg[])
	{
		if(arg.length==0)
		{
			System.out.println("Enter the number");
			System.exit(0);
		}

		int num=Integer.parseInt(arg[0]);
		int sum=0;
		int n=0;

		while(num!=0)
		{
			n=num%10;
			sum=sum+n;
			num/=10;
		}

		System.out.println("The sum of the digits in the number " + arg[0] + " is " + sum);
	}
}
		
		