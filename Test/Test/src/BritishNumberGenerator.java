/*
 Class that extends abstract class which impliments methods for individual task

*/

 public   class BritishNumberGenerator extends BritishNumberBuilder {
	
	public  String getMillionWord(int number) throws Exception
	{  
		String wordMillions;
		
                switch (number)
                { 
	        case 0:  
	               wordMillions = " "; 
	               break; 
	        case 1:
                       wordMillions = NumberToWordImpl.getSingleton().convertLessThanOneThousand(number) + " million"; 
	               break; 
	        default: 
                       wordMillions = NumberToWordImpl.getSingleton().convertLessThanOneThousand(number) + " million"; 
	        }
	       
	   return wordMillions;
	 }

       public String getThousandWord(int number) throws Exception
       {
		String wordHundredThousands;
		
		switch (number) 
                {		 
		case 0:  
                       wordHundredThousands = " "; 
	               break; 
	        case 1: 
                       wordHundredThousands = "  one thousand "; 
	               break; 
	        default: 
                       wordHundredThousands = NumberToWordImpl.getSingleton().convertLessThanOneThousand(number) + " thousand"; 
		 
		}
		return wordHundredThousands;
	}
	
	public String getHundredWord(int number) throws Exception
	{
		String wordHundred;
		wordHundred=NumberToWordImpl.getSingleton().convertLessThanOneThousand(number);
		return wordHundred;
		
	}
	
}
