package assignments.applets;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class Applet10 extends Applet
{
	Button b,b1;
	TextField t;
	public void init()
	{
		/*
		OUTER CLASSES
		APLLET10 WILL NOT IMPLEMENT ACTIONLISTENER
		OTHER OUTER CLASSES WILL IMPLEMENT ACTIONLISTENER
		THEY CANNOT ACCESS TEXTFIELD, ONE WAY TO ACCESS IS PASS APPLET10 TO OUTER CLASS
		HENCE THEY HAVE PARAMETERISED CONSTRUCTOR THAT CAN TAKE APPLET10
		WHILE CALLING THE CONSTRUCTOR ARGUMENT THIS WILL BE PASSED
		*/
		add(b = new Button("Click"));
		add(t = new TextField(15));
		add(b1 = new Button("Clear"));
		b.addActionListener(new A(this));
		b1.addActionListener(new B(this));
	}
}
class A implements ActionListener
{
	Applet10 a10;					//instance variable -can be used anywhere in Class A
	
	public A(Applet10 a10)     //this a10 is local variable and can not be used elsewhere
											//hence we need to pass value of this to instance variable so that 
											//same can be used anywhere in class A
	{
		this.a10=a10;
	}
	public void actionPerformed(ActionEvent e)
	{
		a10.t.setText("Hello");
	}
};


class B implements ActionListener
{
	Applet10 a10;
	public B(Applet10 a10)
	{
		this.a10=a10;
	}
	public void actionPerformed(ActionEvent e)
	{
		a10.t.setText("");
	}
};
/*
<applet code = "assignments.applets.Applet10.class" width = 300 height = 300>
</applet>
*/