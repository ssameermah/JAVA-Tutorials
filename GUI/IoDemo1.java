package assignments.io;
public class IoDemo1
{
	public static void main(String args[])
	{
		System.out.println("Enter Your Name");
		try
		{
			int i = System.in.read();	//this return the Ascii number for each character or byte it reads
			char c = (char)i;
			System.out.println("H"+ c);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
};
//run as >   java assignments.io.IDDemo1