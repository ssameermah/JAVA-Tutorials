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
	public boolean action(Event e,Object o)
	{
      	t.setText("");
		int i = 0;	
		if(c1.getState())
		{
			i = i+1;
		}
		if(c2.getState())
		{
			i = i+2;
		}
		if(c3.getState())
		{
			i = i+3;
		}
		if(c4.getState())
		{
			i = i+4;
		}
		
		if(i>0)
		{
			String str=String.valueOf(i);	 // converted k of type int to string because return type of settext is void which takes parameter type as string					
			t.setText(str);
		}
		return true;
	}


//		if(e.target.equals(b))
//		{
//		  String s = t1.getText();
//		  String s1= t2.getText();
//		  int i= Integer.parseInt(s);
//		  int j= Integer.parseInt(s1);
//		  int k=i+j;
//		  String str=String.valueOf(k); // converted k of type int to string because return type of settext is void which takes parameter type as string
//		  t3.setText(str);
//		}
//		return true;


}

/* <applet code ="assignments.applets.Applet5.class" width=300 height=300>
</applet>
*/