package com.bt;
import java.text.DecimalFormat;
public class BritishNumber extends BritishNumberGenerator {
	
	
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
             
	        // pad with "0" 
	        String mask = "000000000"; 
         
	        // DecimalFormat converts 50 to 000000050 based on the given mask 
	        DecimalFormat df = new DecimalFormat(mask); 
	        snumber = df.format(number);
	        StringBuilder result = new StringBuilder();

	        // XXXnnnnnn
	        int millions = Integer.parseInt(snumber.substring(0, 3)); 
	        // nnnXXXnnn
	        int hundredThousands = Integer.parseInt(snumber.substring(3, 6)); 
	        // nnnnnnXXX 
	        int hundred = Integer.parseInt(snumber.substring(6, 9)); 
            int x=Integer.parseInt(snumber.substring(3, 7));  
            int y=Integer.parseInt(snumber.substring(6, 7));
            int z=Integer.parseInt(snumber.substring(0, 6)); 
            BritishNumberBuilder bnb=new BritishNumberGenerator();
            String millionWord=bnb.getMillionWord(millions);
            String thousandWord=bnb.getThousandWord(hundredThousands);
            String hundredWord=bnb.getHundredWord(hundred);
            millionWord=millionWord.replace("and", "");
            result.append(millionWord);
            result.append(thousandWord);
           
            if(((x==0||y==0) && (z!=0))&&hundred!=0){
              System.out.println("test2");	
               	result.append(" and ");
            }
            System.out.println("Integer.parseInt(snumber.substring(7, 9)="+Integer.parseInt(snumber.substring(7, 9)));
            System.out.println("Integer.parseInt(snumber.substring(6, 9)="+Integer.parseInt(snumber.substring(6, 9)));
            if((Integer.parseInt(snumber.substring(7, 9))==0)&&hundred!=0) {
            	System.out.println("test");
            	hundredWord.indexOf("and");
            	hundredWord=hundredWord.substring(0, hundredWord.indexOf("and"));            	
            }
            System.out.println("hundredWord="+hundredWord);
             result.append(hundredWord);
             
         System.out.println("millionWord="+millionWord+" thousandWord="+thousandWord+" hundredWord="+hundredWord);
             return result.toString(); 
             

	  
		 
	 }

}
