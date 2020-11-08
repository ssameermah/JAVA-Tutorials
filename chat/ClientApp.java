package assignments.sockets;
import java.net.*;
import java.io.*;

public class ClientApp
{
	public static void main(String args[])
	{
		System.out.println("Starting Client App");
		System.out.println("Attempting Connection");
		try
		{
			Socket server =new Socket("localhost",13000);
			System.out.println("Connection Established");
			DataInputStream dis=new DataInputStream(server.getInputStream());
				PrintStream ps=new PrintStream(server.getOutputStream());
				ps.println("Hello Server");
				String s =dis.readLine();
				System.out.println("Server Said" +s);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

};

