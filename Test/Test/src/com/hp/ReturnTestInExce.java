package com.hp;

public class ReturnTestInExce {
	
	public static void main(String arg[])
	
	{
		//int i=ReturnTestInExce.getMethod();
		
		System.out.println(ReturnTestInExce.getMethod());
	}
	
       static int getMethod()
       {
    	   try{
    		   int x=10;
    		 int y=5/0;
    		   
    		   return 1;
    		 //  System.exit(1);
    		 //  System.out.println(" in try");
    	   }catch(Exception e)
    	   {
    		   System.out.println(" in Exception");
    		 //  System.exit(1);
    		   
    		   return 2;
    		  // System.out.println(" in Exception");
    		   
    		  // System.exit(1);
    	   }finally{
    		   System.out.println(" in finally");
    		   
    		   return 3;
    	   }
    	   
    	   
       }
}
