package util;


public class Factorial {
    public static void main (String[] args) {
	
	int theNum=4, theFact;

	System.out.println("This program computes the factorial " +
			   "of a number.");
	System.out.print("Enter a number: ");
	
	
	theFact = fact(theNum);

	System.out.println(theNum + "! = " + theFact + ".");
    }

    /**
     * Calculate the factorial of n.
     *
     * @param n the number to calculate the factorial of.
     * @return n! - the factorial of n.
     */
    static int fact(int n) {
	
	// Base Case: 
	//    If n <= 1 then n! = 1.
	if (n <= 1) {
	    return 1;
	}
	// Recursive Case:  
	//    If n > 1 then n! = n * (n-1)!
	else {
	    return n * fact(n-1);
	}
    }
}
