package util;

public class Floatarr {
	public static void main(String arg[])
	{
		float far[]=new float[5];
		for(int i=0;i<5;i++)
		{
			far[i]=(float)Math.random();
			System.out.println("Float arr="+far[i]);
		}
		
		double dar[]=new double[5];
		for(int i=0;i<5;i++)
		{
			dar[i]=(double)Math.random();
			System.out.println("Double arr="+dar[i]);
		}
	}

}
