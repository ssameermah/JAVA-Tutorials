package assignments.applets;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class Applet13 extends Applet
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

	//below is the code for Anonymous Class which implements FocusListener
		b.addFocusListener(new FocusListener()
		{
			public void focusGained(FocusEvent e)
			{
				t.setText("Hello");
			}

			public void focusLost(FocusEvent e) 
			{
			}

		});
		 
	 //even though we have nothing to do when focus
	//is lost still we need to over write this method other wise 
	//compiler will ask to save class as Abstract 
	//since there are 2 Public Abstarct methods in FocusListener
	//below is the code for Anonymous Class which implements FocusListener ends here

	//below is the code for Anonymous Class which implements FocusListener
	//FocusAdapter is a class which implements FocusListener and has already given blank body to both methods
		b1.addFocusListener(new FocusAdapter()  //{}  );  //done for checking that FocusAdapter is an abstract classs and do not have any abstract methods
		{
			@Override
			public void focusGained(FocusEvent e)
			{
				t.setText("");
			}
	//		public void focusLost(FocusEvent e)
	//		{
	//		}
	
		}); 
	//below is the code for Anonymous Class which implements FocusListener ends here

	} //init over

};

/*
<applet code = "assignments.applets.Applet13.class" width = 300 height = 300>
</applet>
*/