package assignments.javabeans;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
public class JRoundButton extends JComponent
{   //ActionListener a;
	Vector v;
	boolean entered,down;
	String text;
	int cx=28,cy=28,radius=25;
	public JRoundButton()
	{
		text="";
		init();
	}
	public JRoundButton(String text)
	{
		this.text=text;
		init();
	}
	public void setText(String text)
	{
		this.text=text;
		repaint();
	}
	public String getText()
	{
		return text;
	}
	public void addActionListener(ActionListener a)
	{
		//this.a=a;
		v.add(a);
	}
	public void removeActionListener(ActionListener a)
	{
		//this.a=null;
	   v.remove(a);
	}
	public void init()
	{   v=new Vector();
		setSize(56,56);
		addMouseListener(new MouseAdapter()
		{
			public void mousePressed(MouseEvent me)
			{
				down=true;
				repaint();
				/*if(a!=null)
				{
					a.actionPerformed(new ActionEvent(JRoundButton.this,ActionEvent.ACTION_PERFORMED,text));
				}*/
				Enumeration en=v.elements();
				while(en.hasMoreElements())
				{
					ActionListener a=(ActionListener)en.nextElement();
					a.actionPerformed(new ActionEvent(JRoundButton.this,ActionEvent.ACTION_PERFORMED,text));
				}
			}
			public void mouseReleased(MouseEvent me)
			{
				down=false;
				repaint();
			}
		});
		addMouseMotionListener(new MouseMotionAdapter()
		{
			public void mouseMoved(MouseEvent me)                                                              
			{
				int x=me.getX();
				int y=me.getY();
				int dx=cx-x;
				int dy=cy-y;
				int dist=(int)Math.sqrt(dx*dx+dy*dy);
				if(dist<=radius)
					entered=true;
				else
					entered=false;
				repaint();
			}
		});
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
			{ g.setColor(Color.WHITE);
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