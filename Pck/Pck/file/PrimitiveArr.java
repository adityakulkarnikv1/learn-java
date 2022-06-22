package file;

public class PrimitiveArr  {
	

	public static void main(String args[])
	{
		int arr[]={1,7,5,4,2};
		
		/*String arr[]=new String[3];
		arr[0]="sh";
		arr[1]="an";
		arr[2]="ska";*/
		java.util.Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		A a=new A();
		A a1=new A();
		System.out.println("a.hc="+a.hashCode());
		System.out.println("a1.hc="+a1.hashCode());
		System.out.println(a.equals(a1));
	}
}
