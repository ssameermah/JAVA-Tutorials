package assignments.arrays;
import java.awt.*;
import java.awt.event.*;
public class ArrayDemo1 extends Frame
{
		int x[],y[];

 	public ArrayDemo1()
	{
		x=new int[10];
		y=new int[10];
		for (int i=0;i<x.length;i++)
		{
			x[i]=(int)(200*Math.random());
			y[i]=(int)(200*Math.random());
		}

		addWindowListener(new WindowAdapter()   //WindowListener is an interface which have 5 public abstract methods
		{
			@Override
				public void windowClosing(WindowEvent e)
			{
				System.exit(0);     //takes any integer as parameter
										   //if 0 is passed the JVM suts down in proper way,anything other than 0 
										   // then JVM will close abruptly
			}
		});

		setSize(600,600);
		setVisible(true);		
	}

public void paint(Graphics g)
	{
//		g.setColor(Color.RED);
		g.drawPolygon(x,y,8);
//		g.fillPolygon(x,y,3);
	}
public static void main(String args[])
	{
		new ArrayDemo1();
	}
};

		

