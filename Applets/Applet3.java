package assignments.applets;
import java.awt.*;
import java.applet.Applet;
public class Applet3 extends Applet
{
	Button b,b1;
	TextField t;

	public void init()
	{
		add(b = new Button("Click"));
		add(t = new TextField(15));
		add(b1 = new Button("Clear"));
	}

	public boolean action (Event e ,Object o)
	{
		if(e.target.equals(b))
		t.setText("Hello");
		if(e.target.equals(b1))
		t.setText("");
		return true;
	}

}

/*
<applet code = "assignments.applets.Applet3.class" width = 300 height = 300>
</applet>
*/