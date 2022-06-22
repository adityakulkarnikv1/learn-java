package com.hp;

public class Finally {
	
	public static void main(String[] args) {   
        System.out.println("Calling go");   
        String st = go();   
        System.out.println("Back from go: " + st);   
    }   
       
    public static String go() {   
        try {   
            throw(new Exception());   
        }   
        catch (Exception ex) {   
            System.out.println("Entered catch");   
            return "ok";   
        }   
        finally {   
            System.out.println("Entered finally");   
            
            return "yes";
        }   
    }   


}
