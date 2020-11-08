package assignments.applets;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class Applet8 extends Applet implements ActionListener
{
	Button b,b1;
	TextField t;
	A a=new A();
	/*
		INNER CLASS WILL ALSO IMPLEMENT ACTION LISTENER
		ONE BUTTON WILL BE REGISTERED WITH OUTER CLASS
		ONE WILL BE WITH INNER CLASS
	*/
	public void init()
	{
		add(b = new Button("Click"));
		add(t = new TextField(15));
		add(b1 = new Button("Clear"));
		b.addActionListener(this);
		//A a=new A();
		//b1.addActionListener(new A());
		b1.addActionListener(a);
	}
	
	public void actionPerformed(ActionEvent e)
	{
			t.setText("Hello");
	}
	public class A  implements ActionListener
	{
		/*
		public A()
		{
			b1.addActionListener(this);
		}
		*/
		public void actionPerformed(ActionEvent e)
		{
			t.setText("");
		}
	};
}
//<applet code="assignments.applets.Applet8.class" width="500" height="500"></applet>