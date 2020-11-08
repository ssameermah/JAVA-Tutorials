package assignments.threads;
class X
{
		public /*synchronized*/ void m1(String s)  //this will synchronize all the code
	{
			//for synchronization of limited code
			synchronized(this){	
			System.out.println("{");
			System.out.println(s);
					try
					{
							Thread.sleep(200);
					}
					catch(Exception e)
					{	
					}	
			System.out.println("}");		
			}
	}
};

class MyThread extends Thread
{
	X x;
	String s;
	public MyThread(X x,String s)
	{
		this.x=x;
		this.s=s;
		start();
	}
	public void run()
	{
		x.m1(s);
	}
}; 

public class SynchDemo
{
	public static void main(String args[])
	{
		X x=new X();
		new MyThread(x,"Hello");
		new MyThread(x,"World");
	}
};


//run as >   java assignments.threads.SynchDemo