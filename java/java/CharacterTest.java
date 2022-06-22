public class CharacterTest {
public static void main(String ar[ ]) {
	try	{
	char ch =(char)System.in.read();
	if(Character.isJavaIdentifierPart(ch))
		System.out.println("Is Java Identifier Part");
	if(Character.isJavaIdentifierStart(ch))
		System.out.println("Is Java Identifier Start");
	}catch(Exception er) 	{	
	System.out.println("Exception error");



	}
System.out.println("round " +Math.rint(23.4999999)); } }
