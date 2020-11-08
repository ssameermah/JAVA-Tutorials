package assignments.javabeans;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class JRoundButton extends JComponent
{

	boolean entered,down;
	String text;
	int cx=28,cy=28,radius=25;
	public JRoundButton()
	{
		text=" ";
		init();
	}
	public JRoundButton(String text)
	{
		this.text=text;
		init();
	}
	public void setTet(String text)
	{
		this.text=text;
	}
	public String getText()
	{
		return text;
	}
	public void init()
	{
		setSize(56,56);
		addMouseListener(new MouseAdaptor()
		{
			public void mousePressed(MouseEvent me)
			{
				down=true;
				repaint();
			}
			public void mousereleased(MouseEvent me)
			{
				down=false;
				repaint();
			}
		};
		addMouseMotionListener(new MouseMotionAdaptor()
		{
			public void mouseMoved(MouseEvent me)
			{
				int x=me.getX();
				int y=me.getY();
				int dx=Cx-x;
				int dy=cy-y;
				int dist=(int)Math.sqrt(dx*dx+dy*dy);
				if(dist<=radius)
					entered=true;
				else
					entered=false;
				repaint();
			}
		};
	}
	public void paint(Graphics g)
	{
		if(!entered)
		{
			g.setColor(Color.WHITE);
			g.fillOval(3,3,50,50);
			g.setColor(Color.GRAY);
			g.fillOval(5,5,50,50);
			g.setColor(getBackground());
			g.fillOval(4,4,50,50);
			g.setColor(Color.BLACK);
			g.drawString(text,22,32);
		}
		else
		{
			if(!down)
			{
				g.setColor(Color.WHITE);
				g.fillOval(3,3,50,50);
				g.setColor(Color.GRAY);
				g.fillOval(5,5,50,50);
				g.setColor(getBackground());
				g.fillOval(4,4,50,50);
				g.setColor(Color.WHITE);
				g.drawString(text,22,32);
			}
			if(down)
			{
				g.setColor(Color.GRAY);
				g.fillOval(3,3,50,50);
				g.setColor(Color.WHITE);
				g.fillOval(5,5,50,50);
				g.setColor(Color.RED);
				g.fillOval(4,4,50,50);
				g.setColor(Color.BLACK);
				g.drawString(text,25,35);
			}
		}
	}

};



//run as > java assignments.javabeans.JRoundButton.java