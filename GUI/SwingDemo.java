package assignments.swings;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingDemo extends JFrame
{
	JButton jbtn1,jbtn2,jbtn3;
	JTextField jtf;
	public SwingDemo()
	{
		super("MyFrame");
		setLayout(null);
		setSize(430,300);
		setLocation(100,100);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jbtn1 = new JButton("CLICK");
		jbtn1.setBounds(20,50,100,50);
		add(jbtn1);
		jtf = new JTextField();
		jtf.setBounds(150,50,100,50);
		add(jtf);
		jbtn2 = new JButton("CLEAR");
		jbtn2.setBounds(300,50,100,50);
		add(jbtn2);
		jbtn3 = new JButton(new ImageIcon("red.jpg"));
		jbtn3.setBounds(150,150,150,50);
		add(jbtn3);
		jbtn1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				jbtn3.setEnabled(false);
				jtf.setText("Hello");
			}
		});
		jbtn2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				jbtn3.setEnabled(true);
				jtf.setText("");
			}
		});
		jbtn1.setMnemonic('k');
		jbtn2.setMnemonic('r');
		jbtn1.setToolTipText("Click Button");
		jbtn2.setToolTipText("Clear Button");
		jbtn3.setRolloverIcon(new ImageIcon("blue.jpg"));
	    jbtn3.setPressedIcon(new ImageIcon("green.jpg"));
		jbtn3.setDisabledIcon(new ImageIcon("gray.jpg"));
		jbtn3.setToolTipText("Iconized Button");
		setVisible(true);
	}
	public static void main(String args[])
	{
		try
		{
//			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");	//default		
//			UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
//			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
//			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		new SwingDemo();
	}

};


//run as >   java assignments.swings.SwingDemo