import java.util.*;

public class UsingProperties {
public static void main(String ar[ ]) {
	Properties pr = new Properties();
	pr = System.getProperties();
	String str = pr.getProperty("java.version");
	System.out.println("Property got : "+str);
}}
