package assignments.threads;
import java.applet.Applet;
import java.awt.*;
//import java.awt.event.*;
public class ThreadDemo5 extends Applet 
{
		TextField t1,t2;
		Thread th1,th2;
		int i,j;
 	public void init()
		{
					add(t1 = new TextField(10));
					add(t2 = new TextField(10));
					th1 = new Thread(new Runnable()
					{
							public void run()
								{
									while(true)
									{
												t1.setText(String.valueOf(i));
												if(i==5000)
													i=0;
												else
													i++;
											try
												{
													Thread.sleep(50);
												}
											catch(Exception e)
												{	
												}
									}
							}
					});

					th2 = new Thread(new Runnable()
					{
							public void run()
								{
									while(true)
									{
												t2.setText(String.valueOf(j));
												if(j==5000)
													j=0;
												else
													j++;
											try
												{
													Thread.sleep(50);
												}
											catch(Exception e)
												{	
												}
									}
							}
					});

			th1.start();
			th2.start();
		}

}



/*
<applet code = "assignments.threads.ThreadDemo5.class" width = 300 height = 300>
</applet>
*/