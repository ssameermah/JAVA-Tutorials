package assignments.javabeans;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class JRoundButtonDemo extends JFrame
{

	JRoundButton j1,j2;
	JTextField t;

	public JRoundButtonDemo()
	{
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(null);
		j1=new JRoundButton("Click");
		j1.setBounds(10,10,56,56);
		add(j1);
		t=new JTextField();
		t.setBounds(80,10,80,20);
		add(t);
		j2=new JRoundButton("Clear");
		j1.setBounds(176,10,56,56);
		add(j2);
		setVisible(true);
	}
	public static void main(String args[])
	{
		new JRoundButtonDemo();
	}

};



//run as > java assignments.javabeans.JRoundButtonDemo.java