/*
 Class to validate input number and devide bigger number to small elemts like digits interms millions, thousands..

*/

import java.text.DecimalFormat;
public class BritishNumber extends BritishNumberGenerator
 {

    public static void validateNumber(long number) throws Exception
	 {
	 if(number < 0) 
	       { 
	            throw new Exception("Negative numbers not supported"); 
	       } 
	 String snumber = Long.toString(number); 
         if(snumber.length() >= 10) 
              { 
            throw new Exception("Numbers greater than 999 million are not supported"); 
              }
       
	 
	 }
	
     public static String convertNumberToWord(long number) throws Exception
	 {
	        
	 if (number == 0) 
              { 
	         return "zero"; 
	      }

         String snumber = Long.toString(number); 
         
         //pad with "0" 
         String mask = "000000000"; 
         
	 //DecimalFormat converts 50 to 000000050 based on the given mask 
         DecimalFormat df = new DecimalFormat(mask); 
	 snumber = df.format(number);
	 StringBuilder result = new StringBuilder();
         //XXXnnnnnn
         int millions = Integer.parseInt(snumber.substring(0, 3)); 
	 //nnnXXXnnn
	 int hundredThousands = Integer.parseInt(snumber.substring(3, 6)); 
	 //nnnnnnXXX 
	 int hundred = Integer.parseInt(snumber.substring(6, 9)); 
         BritishNumberGenerator bng=new BritishNumberGenerator();
         String millionWord=bng.getMillionWord(millions);
         String thousandWord=bng.getThousandWord(hundredThousands);
         String hundredWord=bng.getHundredWord(hundred);
         if(millionWord!="") 
              {
                millionWord=millionWord.replace("and", "");
              }
         result.append(millionWord);
         result.append(thousandWord);
         int x=Integer.parseInt(snumber.substring(3, 7));  
         int y=Integer.parseInt(snumber.substring(6, 7));
         int z=Integer.parseInt(snumber.substring(0, 6)); 
           
         if(((x==0||y==0) && (z!=0))&&(hundred!=0))
            {
        	result.append(" and ");
            }
         if((Integer.parseInt(snumber.substring(7, 9))==0)&&(hundred!=0)&&(hundredWord.indexOf("and")!=-1))
            {  
         	hundredWord=hundredWord.substring(0, hundredWord.indexOf("and"));   
             	
            }
         result.append(hundredWord);
             
         return result.toString(); 
             
       }

}
