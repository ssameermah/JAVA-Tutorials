package assignments.threads;
import java.applet.Applet;
import java.awt.*;
//import java.awt.event.*;
public class ThreadDemo4 extends Applet 
{
		TextField t1,t2;
		Thread th1;A a;
		
 	public void init()
		{
			add(t1 = new TextField(10));
			add(t2 = new TextField(10));
			th1 = new Thread(new B(this));
			a=new A(this);
			th1.start();
			a.start();
		}

}

class B implements Runnable
{
	int i;
	ThreadDemo4 td4;
	public B(ThreadDemo4 td4)
	{
		this.td4 = td4;
	}

	public void run()
	{
			while(true)
			{
						td4.t1.setText(String.valueOf(i));
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

};
	
	class A extends Thread
	{
			int j;
			ThreadDemo4 td4;
			public A(ThreadDemo4 td4)
			{
				this.td4 = td4;
			}
		public void run()
		{
						while ((true))
						{
								td4.t2.setText(String.valueOf(j));
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
	};




/*
<applet code = "assignments.threads.ThreadDemo4.class" width = 300 height = 300>
</applet>
*/