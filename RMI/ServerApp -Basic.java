package assignments.sockets;
import java.net.*;
import java.io.*;

public class ServerApp
{

	public static void main(String args[])
	{
			System.out.println("Starting Server Application");
			System.out.println("Instantiating Server Socket");
			try
			{
					ServerSocket  server=new ServerSocket(11000);
					System.out.println("Server is up");
					System.out.println("Waiting for client connection");
					Socket client= server.accept();
					System.out.println("client established connection");
					DataInputStream dis=new DataInputStream(client.getInputStream());
					PrintStream ps= new PrintStream(client.getOutputStream());
					String s=dis.readLine();
					System.out.println("client : " + s);
					ps.println("Hello Client");
					Thread.sleep(200);
			}
			catch(Exception e)
			{
					System.out.println(e);
			}

	}

};


//run as > java assignments.sockets.ServerApp.java