package assignments.javabeans;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class JRoundButtonDemo extends JFrame implements ActionListener
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
		j1.addActionListener(this);
		j1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("Hello");
			}
		});
		add(j1);
		t=new JTextField();
		t.setBounds(80,10,80,20);
		add(t);
		j2=new JRoundButton("Clear");
		j2.addActionListener(this);
		j2.setBounds(176,10,56,56);
		add(j2);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		Object o=e.getSource();
		if(o.equals(j1))
			t.setText("Hello");
		if(o.equals(j2))
			t.setText("");
	}
	public static void main(String args[])
	{
		new JRoundButtonDemo();
	}
};