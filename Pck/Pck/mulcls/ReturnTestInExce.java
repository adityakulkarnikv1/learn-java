package mulcls;

public class ReturnTestInExce {
	
	public static void main(String arg[])
	
	{
		int i=ReturnTestInExce.getMethod();
	}
	
       static int getMethod()
       {
    	   try{
    		   int x=10/0;
    		  // return 2;
    	   }catch(Exception e)
    	   {
    		   System.out.println(" in Exception");
    		   
    		   return 2;
    	   }finally{
    		   System.out.println(" in finally");
    		   
    		   return 3;
    	   }
    	   
    	   
       }
}
