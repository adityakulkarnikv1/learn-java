package pack;

public class Methodexcep {
	
		int i=2,j=1,k;
		
		public int met()throws Exception
		{
		
		try{
			System.out.println("before exce");
			
			k=i/j;
			 return  k;
			//System.out.println("after exce");
			
		   }//catch(ArithmeticException ae)
		   //{
			 //  System.out.println("in method ae");			
			
		  // }
		  // catch(Exception e)
		  /// {
			 //  System.out.println("in method  exce");
		// }
		   finally{
			   System.out.println("in method finally");
			   return j;
		   }
		}
		 
	
		
		   public static void main(String arg[])
			{
			   Methodexcep a=new Methodexcep();
			   try{
				   
				 int y= a.met();
			      System.out.println("In main y="+y);
			      }catch(Exception e){
			    	  System.out.println("In main exception");
			      }
			      finally{
					   System.out.println("in main  finally");
				   }
//			      System.out.println("In main y="+y);
			}

}
