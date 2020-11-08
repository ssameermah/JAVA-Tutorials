package assignments.io;
public class IoDemo3
{
	public static void main(String args[])
	{
		System.out.println("Enter Your Name");
		byte b[]=new byte[50];
			try
			{
				int i = System.in.read(b);    //returns the no of bytes read (i.e length of array +2 for \n and \r
				String s=new String(b,0,i-2);
				System.out.println("Hi"+s);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
	}
};
//run as >   java assignments.io.IDDemo1