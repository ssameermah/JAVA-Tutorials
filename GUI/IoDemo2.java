package assignments.io;
public class IoDemo2
{
	public static void main(String args[])
	{
		System.out.println("Keep typing");
		System.out.println("q to quit");
		while (true)
		{

			try
			{
				char c = (char)System.in.read();
				System.out.print(c);
				if(c=='q')
					break;

			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
};
//run as >   java assignments.io.IDDemo1