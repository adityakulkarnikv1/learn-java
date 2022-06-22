package mulcls;

public class NoExption {
	
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
		m1();
		}	
	/*	catch(ArithmeticException ae)
		{
			System.out.println(" in AE");
		}
		*/
		catch(Exception e)
		{System.out.println("in Exception");
			e.printStackTrace();
			StackTraceElement stack[] = e.getStackTrace();
		    
	        // stack[0] contains the method that created the exception.
	        // stack[stack.length-1] contains the oldest method call.
	        // Enumerate each stack element.
	        for (int i=0; i<stack.length; i++) {
	            String filename = stack[i].getFileName();
	            if (filename == null) {
	                // The source filename is not available
	            }
	            String className = stack[i].getClassName();
	            String methodName = stack[i].getMethodName();
	            boolean isNativeMethod = stack[i].isNativeMethod();
	            int line = stack[i].getLineNumber();
	            System.out.println("className="+className+"=methodName="+methodName+"=line="+line);
	        }

		}catch(Throwable t)
		{
			System.out.println("In Throwable");
		}
		
		
		finally{
			System.out.println("In  finally-Before m1");
			try{
			m1();
			}catch(ArithmeticException ex)
			{
				//ex.printStackTrace();
				System.out.println("in finaly Exception");
				StackTraceElement stack[] = ex.getStackTrace();
			    
		        // stack[0] contains the method that created the exception.
		        // stack[stack.length-1] contains the oldest method call.
		        // Enumerate each stack element.
		        for (int i=0; i<stack.length; i++) {
		            String filename = stack[i].getFileName();
		            if (filename == null) {
		                // The source filename is not available
		            }
		            String className = stack[i].getClassName();
		            String methodName = stack[i].getMethodName();
		            boolean isNativeMethod = stack[i].isNativeMethod();
		            int line = stack[i].getLineNumber();
		            System.out.println("className="+className+"=methodName="+methodName+"=line="+line);
		        }
			}
			System.out.println("In  finally-after m1");
		}
		
		//try{
			//m1();
		
	}
}
