class Interest
{
	double principal;
	double rate;
	double time;
}

public class InterestDemo
{
	public static void main(String arg[])
	{
		Interest i=new Interest();
		i.principal=1000.0;
		i.rate=5.0;
		i.time=4;
		System.out.println("The Simple Interest is " + (i.principal*i.rate*i.time)/100);
	}
}

 	