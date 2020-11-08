package assignments.applets;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class Applet7 extends Applet implements ActionListener
{
	Button b,b1;
	TextField t;
	/*
		SAME CLASS IMPLEMENTS ActionListener
		HENCE WHILE REGISTERING PROVIDE this
		AND THEN CHECK WHICH BUTTON WAS CLICKED USING getSource()
	*/
	public void init()
	{
		add(b = new Button("Click"));
		add(t = new TextField(15));
		add(b1 = new Button("Clear"));
		b.addActionListener(this);
		b1.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		Object o=e.getSource();
		if(o.equals(b))
			t.setText("Hello");
		if(o.equals(b1))
			t.setText("");
	}
}
/*
<applet code = "assignments.applets.Applet7.class" width = 300 height = 300>
</applet>
*/