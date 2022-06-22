/*
  Class that implements core busness methods
*/

import java.util.ArrayList;

public class NumberToWordImpl implements NumberToWord
 {
	
	private static final ArrayList<String> tensWords=new ArrayList<String>();
	private  static final ArrayList<String> words=new ArrayList<String>();
	public static boolean haveOne=false;
	 public NumberToWordImpl() 
	 {
		if(!haveOne){
		tensWords.add("");
		tensWords.add("ten");
		tensWords.add("twenty");
		tensWords.add("thirty");
		tensWords.add("forty");
		tensWords.add("fifty");
		tensWords.add("sixty");
		tensWords.add("seventy");
		tensWords.add("eighty");
		tensWords.add("ninety");
		
		words.add(" ");
		words.add(" one ");
		words.add(" two ");
		words.add(" three ");
		words.add(" four");
		words.add(" five");
		words.add(" six");
		words.add(" seven");
		words.add(" eight");
		words.add(" nine");
		words.add(" ten");
		words.add(" eleven");
		words.add(" twelve");
		words.add(" thirteen");
		words.add(" fourteen");
		words.add(" fifteen");
		words.add(" sixteen");
		words.add(" seventeen");
		words.add(" eighteen");
		words.add( " nineteen");
		haveOne=true;
		}
				
	 }
	 static class SingletonHolder
	    {
		  static final NumberToWordImpl SINGLETON = new NumberToWordImpl();
	    }

	 
	 public static NumberToWordImpl getSingleton() throws Exception
            {
	        return SingletonHolder.SINGLETON;
	    }
	 
	//Converts any number to word between 0 to 999 999 999  millions 
	public  String convertLessThanOneThousand(int number) throws Exception
	    {
	        String thousandWord;
                int num=number;
	        if (number % 100 < 20)
                   { 
                    thousandWord = words.get(number % 100); 
                    number /= 100; 
                   } 
               else
                   { 
                   thousandWord = words.get(number % 10); 
                   number /= 10;
                   thousandWord = tensWords.get(number % 10) + thousandWord; 
                   number /= 10; 
                   } 
 
               if(number == 0) 
                   { 
                  return  thousandWord; 
                   }
               if(num%100==0) 
                   {
        	return words.get(number)+" hundred "+thousandWord;
                   }
 
         return words.get(number)+" hundred and "+thousandWord;
      }

   }


