package assignments.sockets;
import java.net.*;
import java.io.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class chatGUIClient extends JFrame implements ActionListener
{
	DataInputStream dis, local;
	PrintStream ps;
	static String clientName;
	Container c;
	JTextArea jta;
	JTextField jtf;
	JButton jbtn;

	public chatGUIClient(String name)
	{
		super("chat Client: "+name);
		clientName=name;
		setSize(500,500);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c=getContentPane();
		c.setLayout(null);
		jta = new JTextArea(20,50);
		jta.setBounds(30,40,440,300);
		c.add(jta);
		jtf=new JTextField();
		jtf.setBounds(30,360,340,70);
		c.add(jtf);
		jbtn=new JButton("SEND");
		jbtn..setBounds(380,360,90,70);
		c.add(jbtn);
		jbtn.addActionListener(this);
		jtf.addActionListener(this);

		try
		{
			Socket server=new Socket("localhost",10000);
			dis=new DataInputStream(server.getInputStream());
			ps=new PrintStream(server.getOutputStream());
			Type2Thread type2 =new Type2Thread();
			type2.start();
		}
		catch(Exception e)
		{
			System.out.println(e);
jta.setEditable(false);
setVisible(true);
		}
		public class Type2Thread extends Thread
		{
			public void run()
			{
				while(true)
				{
					try
					{
						String msg=dis.readLine();
						jta.append("\n "+msg");
						catch(Exception e)
						{
								System.out.println(e);
						}
					}
				}

		};

public void actionPerformed(ActionEvent e)
			{
	String msg=jtf.getText();
	ps.println(clientName+" :"+msg);
	jtf.setText("");
			}
			public static void main(String args[])
			{
				new chatGUIClient(args[0]);
			}
		};

