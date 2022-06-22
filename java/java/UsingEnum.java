import java.util.*;
public class UsingEnum {
public static void main(String ar[ ]) {
	Properties pr = new Properties( );
	pr = System.getProperties( );
	Enumeration enum = pr.propertyNames();
	while (enum.hasMoreElements( )) {
		String ele = (String)enum.nextElement( );
		System.out.println("Property : "+ele);
		System.out.println("Value got : "+pr.getProperty(ele));
	} 
System.out.println(Math.rint(23.6));

} }
