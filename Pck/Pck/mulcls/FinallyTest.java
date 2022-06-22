package mulcls;

public class FinallyTest {

	
	public static void m1() throws ArithmeticException
	{
		System.out.println("in m1");
		throw new ArithmeticException();
	}
	
	public static void main(String arg[])
	{
		System.out.println("Before try");
		try{
			System.out.println("in try catch");
		//int i=2/0;
		  //m1();
		//	System.exit(0) ;
			System.out.println("in try- after exit(0)");
			return;
		//	System.out.println("in try- after return");
			
		}catch (Exception ex)
		{     //Log the exception 
			System.out.println("in Exception");
		}
		finally { 
			System.out.println("in finally before exit(1)");
			System.exit(1) ;
			System.out.println("in finally after exit(1)");
				} 
		}
			
		}

