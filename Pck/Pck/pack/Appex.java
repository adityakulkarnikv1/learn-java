package pack;

public class Appex  {
	
	public static void main(String a[]){
	classC cC;
	  

	    System.out.println(
	      "\nIn the applet instantiate: classC(arg1, arg2)"); 
	    cC = new classC(1,10);
	    System.out.println("\nb= " + cC.b);



	    System.out.println(
	      "\nIn the applet instantiate: classC(arg1)"); 
	    cC = new classC(1);
	    System.out.println("\nb= " + cC.b); 



	    System.out.println(
	      "\nIn the applet instantiate: classC()"); 
	    cC = new classC();
	    System.out.println("\nb= " + cC.b); 

	 } 
	} 

	class classC extends classB { 

	   classC(int arg1, int arg2){ 
	     this(arg1); 
	     System.out.println("In classC(int arg1, int arg2)"); 
	   } 
	   classC(int arg1){ 
	     super(arg1); 
	     System.out.println("In classC(int arg1)"); 
	   } 
	   classC(){ 
	     System.out.println("In classC()"); 
	   } 
	} 

	class classB extends classA { 
	   int b; 
	   classB(int arg1){ 
	     super(arg1); 
	     b = 2*a; // a has been initialized in classA
	     System.out.println("In classB(int arg1)"); 
	   } 
	   classB(){
	     System.out.println("In classB()"); 
	   } 
	} 

	class classA { 
	   int a; 
	   classA(int arg1){ 
	     a=arg1; 
	     System.out.println("In classA(int arg1)"); 
	    } 
	   classA(){ 
	     System.out.println("In classA()"); 
	    } 
	} 


