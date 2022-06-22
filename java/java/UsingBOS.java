import java.io.*;

public class UsingBOS
{
	public static void main(String arg[])
	{
	try
{
	BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("output.txt"));
	String s="he";
	byte b[]=s.getBytes();
	bos.write(b,0,b.length);
	bos.flush();
	}
catch(Exception err)
{
}
}
}

