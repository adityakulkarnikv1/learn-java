package com.bt;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class TestBritishNumber {
	
    public static void main(String[] args) { 
	 
    	String word = ""; 
	    String number=" ";
	    try
	      { 
           System.out.print(" Enter the number :");
        /*   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	      
	        number=br.readLine();
	        */
           number="0";
	       Long l=Long.parseLong(number);
	       BritishNumber.validateNumber(l);           
	       word = BritishNumber.convertNumberToWord(l);
           System.out.println();
           System.out.println(number+"="+word.trim()); 
	     	   	 
	       }catch(NumberFormatException nfe)
	            {
	        	System.out.println(" You have not entered number ,you entered= "+number); 
	            }	        
	        catch(Exception e)
	            { 
	            System.out.println("Error: "+e.getMessage()); 
	            } 
	     
	    }
}
