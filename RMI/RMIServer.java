package assignments.rmi;
import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;

public class RMIServer extends UnicastRemoteObject implements MyInterface
{
	String identity="mikado";
//Default port is1099 so that only one is enough. If we need to change the port other than 1099, give full url
//rmi:/localhost:2000/mikado


//create Constructor
public RMIServer() throws RemoteException
	{
	System.out.println("Starting Server Application");
	System.out.println("Starting RMI  Registry");
	try
		{
		LocateRegistry.createRegistry(1099);//1099 is Default RMI
		System.out.println("Registry Started");
		System.out.println("Binding Stub");
		Naming.rebind(identity,this);
		System.out.println("Stub Bound");
		System.out.println("Waiting for Client Calls");
		}
			catch(Exception e)
						{
							System.out.println(e);
						}
	}
						public String getMessage()
		{
							return "Hello Client";
		}
		public static void main(String args[])
		{
			try
			{
				new RMIServer();
			}
		catch(Exception e)
						{
							System.out.println(e);
						}
		}
}
