package assignments.applets;
import java.awt.*;
import java.applet.Applet;
public class Applet5 extends Applet
{
 Checkbox c1,c2,c3,c4;
 TextField t;

	public void init()
	{
	 setLayout(new GridLayout(5,1));
	 add (c1=new Checkbox("1"));
	 add (c2=new Checkbox("2"));
	 add (c3=new Checkbox("3"));
	 add (c4=new Checkbox("4"));
	 add (t=new TextField(10));
	}
//	boolean b= c1.getState();
//	if(b==true)
//	{
//		setLayout(
}

/* <applet code ="assignments.applets.Applet5.class" width=300 height=300>
</applet>
*/