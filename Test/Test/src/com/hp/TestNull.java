package com.hp;

public class TestNull {
	
	public static void test(int i)
	{
		System.out.println(" in i");
	}
	public static void test(String s)
	{
		System.out.println(" in s");
	}
	void print(Object o)
	{      
		System.out.println("void print(Object o)");  
	}    
	void print(String s)
	{       
		System.out.println("void print(String s)");    
		}
	public static void main(String arg[]){
		System.out.println("test");
		test("tes");
		test(9);
		test(null);
		test(9);
		test("");
		test(" ");
		new TestNull().print(null);
	}

}
/*
 * The print() method is overloaded to take either Object or String types as an argument. We call the print method with a "null" literal as the parameter in the main function. Which print method will be invoked with such call? In this situation, Java invokes the "most-specific" method, as detailed in section 15.12.2.2 of the Java Language Specification. In general, one method is considered more specific than another if its argument types are subtypes of the other method's respective argument types.
Any kinds of Java object reference can be null, the special null reference can be passed as the argument for both Object and String argument methods (a null reference can be converted to any type of object). Therefore, calling print(null) could potentially invoke either print(String s) or print(Object o). The type of the null argument is only used to determine the applicable methods. In general, a method declaration is "more specific" than another if its respective arguments could be converted (via method invocation conversion) to those of the other method.
Recall that any classes in Java are direct or indirect subclasses of Object. So String is a subtype of Object, the method overloaded to accept a String is more specific than the method overloaded to accept an Object. A String can be converted (upcast) to Object, but an Object cannot be converted (downcast or upcast) to String, so the method taking the String argument is more specific. Therefore, print(String s) will be invoked by the call print(null).

*/
