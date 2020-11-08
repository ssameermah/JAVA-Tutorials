package assignments.applets;
import java.applet.Applet;
import  java.awt.*;
import java.awt.event.*;
public class Applet9_1 extends Applet //implements ActionListener

// in this example now Applet is not implementing or inheriting from ActionListener so no actionPerformed method in it
//also two different classes A & B are created which inherits from Action Listener

{
	Button b,b1;
	TextField t;
	public void init()
	{
		add (b=new Button ("click"));
		add (t=new TextField(15));
		add (b1=new Button ("clear"));
		b.addActionListener(new B());
		b1.addActionListener(new A());
	}



}; 

class A extends Applet9_1 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			t.setText(" ");
		}
	};

class B extends Applet9_1 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			t.setText("Hello");
		}
	};

/*<applet code="assignments.applets.Applet9_1.class" width=300 height=300>
</applet>*/
