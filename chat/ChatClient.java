package assignments.sockets;
import java.net.*;
import java.io.*;
import java.util.*;

public class chatClient
{
	DataInputStream dis, local;
	PrintStream ps;
	String clientName;

	public chatClient(String name)
	{
		clientName=name;
		try
		{
			Socket server =new Socket("localhost",10000);
			dis=new DataInputStream(server.getInputStream());
			ps=new PrintStream(server.getOutputStream());
			local = new DataInputStream(System.in);
			Thread type1 =new Thread(new Runnable()
			{
				public void run()
				{
					while(true)
					{
						try
						{
							String msg=local.readLine();
							ps.println(clientName+ " : "+msg);
						}

							catch(Exception e)
							{
								System.out.println(e);
							}
						}
					}
				});

				Thread type2=new Thread(new Runnable()
				{
					public void run()
					{
						while(true)
						{
							try
							{
								String msg=dis.readLine();
								System.out.println(msg);
							}
							catch(Exception e)
							{
								System.out.println(e);
							}
						}
					}
				});


				type1.start();
				type2.start();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}

		public static void main(String args[])
		{
			new chatClient(args[0]);
		}
	};

