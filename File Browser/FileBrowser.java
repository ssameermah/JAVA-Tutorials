package assignments.guiapps;
import java.awt.*;
import java.awt.event.*;
public class FileBrowser extends Frame
{
		Panel1 p1;
		Panel2 p2;
		Panel3 p3;
		Panel4 p4;
 	public FileBrowser()
	{
		super("File Browser");
		p1= new Panel1();
		p2= new Panel2();
		p3= new Panel3();
		p4= new Panel4();
		add(p1,BorderLayout.NORTH);  //new add which takes two parameters 
														   //component and string which defines location
		add(p2,BorderLayout.CENTER);
		add(p3,BorderLayout.EAST);
		add(p4,BorderLayout.SOUTH);
		addWindowListener(new WindowAdapter()   //WindowListener is an interface which have 5 public abstract methods
		{
			@Override
				public void windowClosing(WindowEvent e)
			{
				System.exit(0);     //takes any integer as parameter
										   //if 0 is passed the JVM suts down in proper way,anything other than 0 
										   // then JVM will close abruptly
			}
		});

		setSize(600,600);
		setVisible(true);		
	}
public static void main(String args[])
	{
		new FileBrowser();
	}
};

class Panel1 extends Panel
{
		Button b;
		TextField t;
		public Panel1()
	{
		add(t = new TextField(15));
		add(b = new Button("Submit"));
	}
};

class Panel2 extends Panel
{
		TextArea ta;
		public Panel2()
	{
		add(ta = new TextArea(25,50));
	}
};

class Panel3 extends Panel
{
		List l;
		public Panel3()
	{
		add(l = new List(25));
	}
};

class Panel4 extends Panel
{
		TextField t1;
		public Panel4()
	{
		add(t1 = new TextField(20));
	}
};
		

