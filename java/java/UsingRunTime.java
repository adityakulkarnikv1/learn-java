public class UsingRuntime {
public static void main(String ar[ ]) {
	try 	{
		Runtime rt = Runtime.getRuntime();
		rt.exec("notepad.exe");
	}catch(Exception er) 	{
		System.out.println("error");
	}
} }
