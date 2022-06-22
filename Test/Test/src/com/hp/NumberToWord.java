package com.hp;
import java.text.DecimalFormat;

public class NumberToWord {

    private static final String[] tensWords = { "", " ten", " twenty", 
            " thirty", " forty", " fifty", " sixty", " seventy", " eighty", 
            " ninety" };

    private static final String[] words = { "", " one", " two", " three", 
            " four", " five", " six", " seven", " eight", " nine", " ten", 
            " eleven", " twelve", " thirteen", " fourteen", " fifteen", 
            " sixteen", " seventeen", " eighteen", " nineteen" };

    // Convert Number to word which is less than one thousand    
    private static String convertLessThanOneThousand(int number) { 
        String thousandWord;
   System.out.println(" convertLessThanOneThousand=number % 100="+number % 100);
        if (number % 100 < 20) { 
            thousandWord = words[number % 100]; 
            
            number /= 100; 
            System.out.println(" convertLessThanOneThousand=number % 100="+number % 100+" thousandWord="+thousandWord+"number");
            
        } else { 
            thousandWord = words[number % 10]; 
            number /= 10;
            System.out.println(" convertLessThanOneThousand=1==number % 100="+number % 100+" thousandWord="+thousandWord+"number");
            
            thousandWord = tensWords[number % 10] + thousandWord; 
            
            number /= 10; 
            
            System.out.println(" convertLessThanOneThousand=2==number % 100="+number % 100+" thousandWord="+thousandWord+"number");
            
        } 
        
        if (number == 0) 
            return thousandWord; 
        
        return words[number] + " hundred" + thousandWord; 
    }

    
    //Converts any number to word between 0 to 999 999 999 999 billions millions 
    public static String convertNumberToWord(long number) throws Exception{

        if(number < 0) 
        { 
            throw new Exception("Negative numbers not supported"); 
        } 
        
        if (number == 0) { 
            return "zero"; 
        }

        String snumber = Long.toString(number); 
        if(snumber.length() > 12) 
        { 
            throw new Exception("Numbers greater than 999 billion are not supported"); 
        }

        // pad with "0" 
        String mask = "000000000"; 
        
        // DecimalFormat converts 50 to 000000000050 based on the given mask 
        DecimalFormat df = new DecimalFormat(mask); 
        
        snumber = df.format(number);
        System.out.println("mask="+mask+" snumber="+snumber);

        StringBuilder result = new StringBuilder();

        // XXXnnnnnnnnn 
        int billions = Integer.parseInt(snumber.substring(0, 3)); 
        // nnnXXXnnnnnn 
        int millions = Integer.parseInt(snumber.substring(3, 6)); 
        // nnnnnnXXXnnn 
        int hundredThousands = Integer.parseInt(snumber.substring(6, 9)); 
        // nnnnnnnnnXXX 
        int thousands = Integer.parseInt(snumber.substring(9, 12));
    System.out.println("billions="+billions+"millions="+millions+" hundredThousands="+hundredThousands+" thousands="+thousands);
        String wordBillions; 
        switch (billions) { 
        case 0: 
            wordBillions = ""; 
            break; 
        case 1: 
            wordBillions = convertLessThanOneThousand(billions) + " billion"; 
            break; 
        default: 
            wordBillions = convertLessThanOneThousand(billions) + " billion"; 
        }

        result.append(wordBillions);

        String wordMillions; 
        switch (millions) { 
        case 0: 
            wordMillions = ""; 
            break; 
        case 1: 
            wordMillions = convertLessThanOneThousand(millions) + " million"; 
            break; 
        default: 
            wordMillions = convertLessThanOneThousand(millions) + " million"; 
        }

        result.append(wordMillions);

        String wordHundredThousands; 
        switch (hundredThousands) { 
        case 0: 
            wordHundredThousands = ""; 
            break; 
        case 1: 
            wordHundredThousands = "one thousand "; 
            break; 
        default: 
            wordHundredThousands = convertLessThanOneThousand(hundredThousands)+ " thousand"; 
        }

        result.append(wordHundredThousands);

        result.append(convertLessThanOneThousand(thousands));

        return result.toString(); 
    }

    public static void main(String[] args) { 
        
        String word = ""; 
        try { 
           // word = NumberToWord.convertNumberToWord(999999999999L); 
        	System.out.println("============================");
        	 word = NumberToWord.convertNumberToWord(908L);
        	 System.out.println(word); 
        	 System.out.println("============================");
        	 word = NumberToWord.convertNumberToWord(102010208L);
        	 System.out.println(word); 
        	 System.out.println("============================");
        	 word = NumberToWord.convertNumberToWord(456829190123L);
        	 System.out.println(word); 
        	 System.out.println("============================");
        	 
        } catch (Exception e) { 
            System.out.println("error: "+e.getMessage()); 
        } 
     //   System.out.println(word); 
    }

} 

