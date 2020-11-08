package assignments.guiapps;
import java.awt.*;
import java.awt.event.*;
public class GUIApp1 extends Frame
{
		Button b,b1;
		TextField t;

 	public GUIApp1()
	{
		setLayout(new FlowLayout());   //change layout to flowLayout from default borderLayout
		add(b = new Button("Click"));
		add(t = new TextField(15));
		add(b1 = new Button("Clear"));
		b.addActionListener((e)->t.setText("Hello"));
		b1.addActionListener((e)->t.setText(""));
		
		addWindowListener(new WindowAdapter()   //WindowListener is an interface which have 5 public abstract methods
		{
			@Override
				public void windowClosing(WindowEvent e)
			{
				System.exit(0);     //takes any integer as parameter
										   //if 0 is passed the JVM shuts down in proper way,anything other than 0 
										   // then JVM will close abruptly
			}
		});

		setSize(300,300);
		setVisible(true);
	}

public static void main(String args[])
	{
		new GUIApp1();
	}

};
