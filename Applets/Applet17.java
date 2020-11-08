package assignments.applets;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class Applet17 extends Applet implements ItemListener
{
		Checkbox ch1,ch2;
		Choice c1,c2;
		String fontName;
		int fontType,fontSize;

 	public void init()
	{
		add(c1 = new Choice());
		add(ch1 = new Checkbox("Bold"));
		add(ch2 = new Checkbox("Italic"));
		add(c2 = new Choice());
		c1.add("Times New Roman");
		c1.add("Arial");
		c1.add("Verdana");
		c2.add("20");
		c2.add("25");
		c2.add("30");
		fontName= "Times New Roman";
		fontType=0;
		fontSize=20;

	c1.addItemListener(new ItemListener()
		{
				public void itemStateChanged(ItemEvent e)
			{
					fontName=c1.getSelectedItem();
					repaint();
			}
		});
	c2.addItemListener(new ItemListener()
		{
				public void itemStateChanged(ItemEvent e)
			{
					fontSize=Integer.parseInt(c2.getSelectedItem());
					repaint();
			}
		});
		ch1.addItemListener(this);
		ch2.addItemListener(this);

	}


	
public void paint(Graphics g)
		{
			g.setColor(Color.RED);
			g.setFont(new Font(fontName,fontType,fontSize));
			g.drawString("Mikado Solutions",100,100);
		}

public void itemStateChanged(ItemEvent e)
	{
		boolean b = ch1.getState();
		boolean i = ch2.getState();
		if(b && i)
			fontType = 3;
		if(!b && i)
			fontType = 2;
		if(b && !i)
			fontType = 1;
		if(!b && !i)
			fontType = 0;
		repaint();
	}


}

/*
<applet code = "assignments.applets.Applet17.class" width = 300 height = 300>
</applet>
*/