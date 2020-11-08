package assignments.applets;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class Applet11 extends Applet
{
	Button b,b1;
	TextField t;
	public void init()
	{
		/*
		anaonymous inner classes
		APLLET11 WILL have 2 anaonymous inner classes
		this will create 3 .clsss files "Apple11.class, Applet11$1.class and Applet11$2.class 
		*/
		add(b = new Button("Click"));
		add(t = new TextField(15));
		add(b1 = new Button("Clear"));
	//below is the code for Anonymous Class which implements Actionlistener
		b.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				t.setText("Hello");
			}

		});
	//below is the code for Anonymous Class which implements Actionlistener ends here

//below is the code for Anonymous Class which implements Actionlistener
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				t.setText("");
			}

		});

	//below is the code for Anonymous Class which implements Actionlistener ends here
	} //init over

};

/*
<applet code = "assignments.applets.Applet11.class" width = 300 height = 300>
</applet>
*/