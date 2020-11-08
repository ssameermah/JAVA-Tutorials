package assignments.applets;
import java.applet.Applet;
import java.awt.*;
//import java.awt.event.*;
public class Applet14 extends Applet
{


public void paint(Graphics g)
	{
	  g.drawLine(10,10,100,100);
	  g.drawRect(10,10,15,20);
	  g.setColor(new Color(200,100,150));
	  g.fillRect(30,30,15,80);
	  g.drawOval(50,50,15,20);
	  g.setColor(Color.RED);
	  g.fillOval(90,90,15,20);
	  g.drawArc(90,200,100,100,15,70);
	  g.setColor(Color.GREEN);
	  g.fillArc(90,200,50,100,15,20);
	  g.setColor(Color.YELLOW);
	  g.setFont(new Font("Arial",3,20));
	  g.drawString("Mikado Solutions",50,300);
	}

};

/*
<applet code = "assignments.applets.Applet14.class" width = 300 height = 300>
</applet>
*/