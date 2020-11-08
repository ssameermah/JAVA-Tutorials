package assignments.rmi;
import java.rmi.*;

public class RMIClient
{
	public static void main(String args[])
	{
		System.out.println("Starting Client Application");
	System.out.println("Looking for Server Stub");
	try
		{
		MyInterface mi=(MyInterface)Naming.lookup("rmi://localhost:1099/mikado");
	System.out.println("Got the Stub");
	System.out.println("Calling Remote Method");
	System.out.println(mi.getMessage());
		}
		catch(Exception e)
						{
							System.out.println(e);
						}
}
}
