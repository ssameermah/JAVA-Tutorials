package assignments.arrays;
import java.awt.*;
import java.awt.event.*;
public class ArrayDemo2 extends Frame implements ActionListener
{
		Button b[][];

 	public ArrayDemo2()
	{
		setLayout(new GridLayout(3,3));
		b=new Button[3][3];
		for (int i=0;i<b.length;i++)
		{
			for (int j=0;j<b[i].length;j++)
			{
				if (Math.random()<0.5)
					add(b[i][j]=new Button("X"));
				else
					add(b[i][j]=new Button("O"));

				b[i][j].addActionListener(this);
			}
		}

		addWindowListener(new WindowAdapter()   //WindowListener is an interface which have 5 public abstract methods
																			//hence we are using Adapter classes like WindowAdapter in this case
																			//Adapter classes actually give blank body to all the abstract methods of a interface
		{
			@Override
				public void windowClosing(WindowEvent e)
			{
				System.exit(0);     //takes any integer as parameter
										   //if 0 is passed the JVM suts down in proper way,anything other than 0 
										   // then JVM will close abruptly
			}
		});

		setSize(600,600);
		setVisible(true);	
	}

public void actionPerformed(ActionEvent e)
	{
		Object o = e.getSource();
		if(o instanceof Button)
		{
			String s = ((Button)o).getLabel();
			if  (s.equals("X"))
				((Button)o).setLabel("O");
			else
				((Button)o).setLabel("X");
		}
	}


public static void main(String args[])
	{
		new ArrayDemo2();
	}
};

// this program is to have 9 buttons using two dimentional arrays
//each button should by default have label "X" or "O" randomly
//once clicked if label is "X" then it should change to "O" and Vice a Versa

