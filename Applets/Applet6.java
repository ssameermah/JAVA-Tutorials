package assignments.applets;
import java.awt.*;
import java.applet.Applet;
public class Applet6 extends Applet
{
 	
	Panel1 p1;
	Panel2 p2;
	
	
	public void init()
	{
	 	setLayout(new GridLayout(1,2));
	 	add (p1=new Panel1());
	 	add (p2=new Panel2());
		p2.c1.setState(true);
		p2.c2.setState(true);
		p2.c3.setState(false);
		p2.t.setText("2000");
		p2.t.setEditable(false);
	}

	public boolean action(Event e,Object o)
	{
			if (p1.c1.getState())
			{
				p2.c1.setState(true);
				p2.c2.setState(true);
				p2.c3.setState(false);
				p2.t.setText("2000");	
			}		
			if (p1.c2.getState())
			{
				p2.c1.setState(true);
				p2.c2.setState(false);
				p2.c3.setState(true);
				p2.t.setText("4000");	
			}	
			if (p1.c3.getState())
			{
				p2.c1.setState(false);
				p2.c2.setState(true);
				p2.c3.setState(true);
				p2.t.setText("5000");	
			}			
		return true;
	}


}

class Panel1 extends Panel
{
		Checkbox c1,c2,c3;
//		TextField t;
		CheckboxGroup group;

		public Panel1()
		{
			group = new CheckboxGroup();
			setLayout(new GridLayout(3,1));
			add (c1=new Checkbox("Tour1",group,true));
			add (c2=new Checkbox("Tour2",group,false));
			add (c3=new Checkbox("Tour2",group,false));
		}
}

class Panel2 extends Panel
{
		Checkbox c1,c2,c3;
		TextField t;

		public Panel2()
		{
			setLayout(new GridLayout(4,1));
			add (c1=new Checkbox("Shimla"));
			add (c2=new Checkbox("Manali"));
			add (c3=new Checkbox("Dalhousie"));
	 	    add (t=new TextField(10));
		}
}




	
	
	
	
//	public boolean action(Event e,Object o)
//	{
//     	t.setText("");
//		int i = 0;	
//		if(c1.getState())
//		{
//			i = i+1;
//		 }
//		if(c2.getState())
//		{
//			i = i+2;
//		}
//		if(c3.getState())
//		{
//			i = i+3;
//		}
//		if(c4.getState())
//		{
//			i = i+4;
//		}
//		
//		if(i>0)
//		{
//			String str=String.valueOf(i);	 // converted k of type int to string because return type of settext is void which takes parameter type as string					
//			t.setText(str);
//		}
//		return true;
//	}


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


//}

/* <applet code ="assignments.applets.Applet6.class" width=300 height=300>
</applet>
*/