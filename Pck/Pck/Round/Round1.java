package Round;

public class Round1 {
	public static double round(double val, int places)
	{
	boolean isNegative = false;
	double output = val;
	if (val < 0)
	{
	isNegative = true;
	val = Math.abs(val);
	}

	long factor = (long)Math.pow(10,places);
 System.out.println("factor=Math.pow="+factor);
	// Shift the decimal the correct number of places
	// to the right.
	val = val * factor;

	// Round to the nearest integer.
	long tmp = Math.round(val);

	// Shift the decimal the correct number of places
	// back to the left.
	output = ((double)tmp) / factor;

	if (isNegative)
	{
	output = output * -1;
	}

	return output;
	}

	public static void main(String[] args) {
		double rounded = 187.72999909;
		double x=round(rounded,2);
		System.out.println("X="+x);
		
		double y=Math.round(18772.99);
		System.out.println("Y="+y);
		
		/*System.out.println("%f%n", rounded);
		System.out.println("%.8f%n", rounded);
		System.out.println("%.2f%n",  rounded);*/
		
		 double d = (double) 100 / 3;
		 System.out.println("d="+d);
		 System.out.println("round--1=="+round(d,1));
		 System.out.println("round--2=="+round(d,2));
		 System.out.println("round--3=="+round(d,3));
	
		 double d2 = (double) 200 / 3;
		 System.out.println("d="+d2);
		 System.out.println("round--1=="+round(d2,1));
		 System.out.println("round--1=="+round(d2,2));
		 double z=Math.round(d2*100.0) / 100.0;
		 
		 System.out.println("Z="+z);
		 System.out.println("round--1=="+round(d2,3));
		 
		 double z1=Math.round((47.5*0.15)*100.0) / 100.0;
		 System.out.println("Z1="+z1);
		 double z2=Math.round((z1)*10.0) / 10.0;
		 System.out.println("Z2="+z2);
		 double arr[]={13.343,9.312,2.613,4.545,4.597};
		 
		 double arn[]=new double[5];
		 for (int i=0;i<arr.length;i++)
		 {
			 //double j=arr[i]*100.0;
			 arn[i]=Math.round(arr[i]*100.00)/100.00;
			 
		 }
		 for (int i=0;i<arn.length;i++)
		 {
			 System.out.println("arn="+arn[i]);
			 
		 }
		}

}
