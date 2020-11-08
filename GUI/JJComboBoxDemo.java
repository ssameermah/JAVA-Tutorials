package assignments.swings;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JJComboBoxDemo extends JFrame
{

	JComboBox continentsCB,countriesCB;
	JTextField capitalTF;
	DefaultComboBoxModel model1,model2;
	
	String continents[]={"Asia","Africa","North America"};
	String countries[][]={{"India","China","Japan"},{"Egypt","Kenya","Nigeria"},{"Canada","Mexico","USA"}};
	String capitals[][]={{"Delhi","Beiging","Tokyyo"},{"cairo","Nairobi","Abuja"},{"Ottawa","MaxicoCity","WashingtonDC"}};
	boolean flag;
	int continentIndex,countryIndex;
	public JJComboBoxDemo(String title)
	{
		super(title);
		setLayout(null);
		setSize(800,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		model1=new DefaultComboBoxModel(continents);
		
		continentsCB=new JComboBox(model1);
		continentsCB.setBounds(10,10,100,30);
		add(continentsCB);
		
		model2=new DefaultComboBoxModel(countries[0]);
		
		countriesCB=new JComboBox(model2);
		countriesCB.setBounds(120,10,100,30);
		add(countriesCB);
		capitalTF = new JTextField();
		capitalTF.setBounds(230,10,100,30);
		add(capitalTF);
		capitalTF.setText(capitals[0][0]);
		
		continentsCB.addItemListener(new ItemListener(){
			
			public void itemStateChanged(ItemEvent ae)
			{
				flag=true;
				continentIndex=continentsCB.getSelectedIndex();
				capitalTF.setText("");
				//countriesCB.removeAllItems();
				model2.removeAllElements();
				for (int i=0;i<countries[continentIndex].length ;i++ )
				{
					model2.addElement(countries[continentIndex][i]);
					//countriesCB.addItem(countries[continentIndex][i]);
				}
				capitalTF.setText(capitals[continentIndex][0]);
				flag=false;
			}
		});
		countriesCB.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent ae)
			{
				if(flag)
					return;

				countryIndex=countriesCB.getSelectedIndex();
				capitalTF.setText(capitals[continentIndex][countryIndex]);
				flag=false;
			}
		});
		setVisible(true);
	}
	public static void main(String arg[])
	{
		new JJComboBoxDemo("JJComboBoxDemo");
	}
};



//run as > java assignments.swings.JJComboBoxDemo.java