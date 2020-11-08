package assignments.threads;
import java.applet.Applet;
import java.awt.*;
//import java.awt.event.*;
public class ThreadDemo7 extends Applet 
{
//		TextField t1;
		Thread th1; 
		int x,y;
		boolean flag=true;
 	public void init()
		{
//					add(t1 = new TextField(10));
					x=0;
					y=size().height/2;
					
					th1 = new Thread(new Runnable()
					{
							public void run()
								{
									while(true)
									{
	//											t1.setText(String.valueOf(y));
												if(x==size().width)
													x=0;
												else
													x++;

												if(y>=(size().height-15))
													flag=false;
												if (y<=(size().height/2))
													flag=true;
												
												if(flag)
													y++;
												else
													y--;
											repaint();
											try
												{
													Thread.sleep(200);
												}
											catch(Exception e)
												{	
												}
									}
							}
					});

			th1.start();
	
		}
		public void paint(Graphics g)
		{
			g.setColor(Color.red);
			g.fillOval(x,y,15,15);
		}

}



/*
<applet code = "assignments.threads.ThreadDemo7.class" width = 400 height = 400>
</applet>
*/