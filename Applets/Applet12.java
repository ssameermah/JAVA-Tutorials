package assignments.applets;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class Applet12 extends Applet
{
	Button b,b1;
	TextField t;
	public void init()
	{
		/*
		Lamba expressions ---writing in short codes
		*/
		add(b = new Button("Click"));
		add(t = new TextField(15));
		add(b1 = new Button("Clear"));
	//below is the code for Anonymous Class which implements Actionlistener
	//	b.addActionListener(new ActionListener()
	//	{
	//		public void actionPerformed(ActionEvent e)
	//		{
	//			t.setText("Hello");
	//		}

	//	});
	//below is the code for Anonymous Class which implements Actionlistener ends here
	
	//instead of all the above code we can write one line as shown below

//	b.addActionListener((ActionEvent e)->{t.setText("Hello");});
//	b.addActionListener((e)->{t.setText("Hello");});
	b.addActionListener((e)->t.setText("Hello"));
	
	b1.addActionListener((e)->t.setText(""));


	} //init over

};

/*
<applet code = "assignments.applets.Applet12.class" width = 300 height = 300>
</applet>
*/