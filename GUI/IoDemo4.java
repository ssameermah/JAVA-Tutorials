package assignments.io;
import java.io.*;
public class IoDemo4
{
	public static void main(String args[])
	{
		System.out.println("Enter Your Name");
		DataInputStream dis=new DataInputStream(System.in);
			try
			{
				String s = dis.readLine();
				System.out.println("Hi"+s);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
	}
};
//run as >   java assignments.io.IDDemo1