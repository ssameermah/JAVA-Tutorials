package assignments.applets;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class Applet9 extends Applet
{
	Button b,b1;
	TextField t;
	public void init()
	{
		/*
		INNER CLASSES
		OUTER CLASS DOES NOT IMPLEMENT ActionListener
		INNNER CLASSES WILL IMPLEMENT THE ActionListener
		*/
		add(b = new Button("Click"));
		add(t = new TextField(15));
		add(b1 = new Button("Clear"));
		A a=new A();
		B b3=new B();
		b.addActionListener(a);
		b1.addActionListener(b3);
	}
	
	public class A  implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			t.setText("Hello");
		}
	};
	public class B implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			t.setText("");
		}
	};
}
//<applet code="assignments.applets.Applet9.class" width="500" height="500"></applet>