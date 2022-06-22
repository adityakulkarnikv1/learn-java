package com.hp;

public class Test {
public Test(Object o) { System.out.println("Object argument passed"); }   
    
    public Test(A a) { System.out.println("A argument passed"); }   
    
    public Test(B b) { System.out.println("B argument passed"); }   
   public Test(C c) {   
    	System.out.println("C argument passed");    
    	}  

    int x;
    public static void main(String [] args)    
    {   
        new Test(null);   
        new Test("");  
    }   
}   
    
class A    
{   
    public A() {}   
}   
    
class B extends A   
{   
    public B() {}   
}  
 
// WORKS CORRECTLY AND C CONSTRUCTOR WILL BE CALLED
class C extends B{   
	public C() {}   
	} 
	

/*// Gives compilation error
class C extends A{   
	public C() {}   
	} 
	*/
