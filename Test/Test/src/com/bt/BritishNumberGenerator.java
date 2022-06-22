package com.bt;



 public   class BritishNumberGenerator extends BritishNumberBuilder {
	
	public  String getMillionWord(int number) throws Exception
	{  
		String wordMillions;
		switch (number) { 
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
		System.out.println("getThousandWord=number= "+number);
		switch (number) {		 
		  case 0:  System.out.println("hundredThousands-case0");
                   wordHundredThousands = " "; 
	               break; 
	        case 1: System.out.println("hundredThousands-case1");
                   wordHundredThousands = "  one thousand "; 
	               break; 
	        default: System.out.println("hundredThousands-default");
                    wordHundredThousands = NumberToWordImpl.getSingleton().convertLessThanOneThousand(number) + " thousand"; 
		 
		}
		System.out.println("getThousandWord=wordHundredThousands="+wordHundredThousands);
		return wordHundredThousands;
	}
	
	public String getHundredWord(int number) throws Exception
	{
		String wordHundred;
		wordHundred=NumberToWordImpl.getSingleton().convertLessThanOneThousand(number);
		return wordHundred;
		//return "";
	}
	
}
