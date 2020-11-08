package assignments.io;
import java.io.*;
public class IoDemo5
{
	public static void main(String args[])
	{
	
		try
		{
			FileInputStream fis=new FileInputStream("D:\\Students\\Pramod\\P.java");     // you can use double backslash or one forword slash for giving file path 
			DataInputStream dis=new DataInputStream(fis);
			String s = "";
			while((s=dis.readLine())!=null)
			{	
				System.out.println(s);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
};
//run as >   java assignments.io.IDDemo1