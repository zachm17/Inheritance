package ctec.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;

import ctec.controller.SportsController;
import ctec.model.CoolThing;




public class SportsPanel extends JPanel
{

	private SportsController baseController;
	private JTextArea textArea;
	private JButton sortButton;
	private SpringLayout baseLayout;
	
	public SportsPanel(SportsController baseController)
	{
		this.baseController = baseController;
		sortButton = new JButton("Sort stuff");
		textArea = new JTextArea(10,20);
		baseLayout = new SpringLayout();
		
		
		
		
		
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupSportsPane()
	{
		
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.BLUE);
		this.add(sortButton);
		this.add(textArea);
		textArea.setEnabled(false);
		this.setPreferredSize(new Dimension(525, 540));
		
		
		
		
		
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, textArea, 78, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, textArea, -41, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, sortButton, 70, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, sortButton, -149, SpringLayout.SOUTH, this);
	}
	
	private void setupListeners()
	{
		sortButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				baseController.insertionSort();
				
				String temp = "The sorted contents are \n";
				for(CoolThing current : baseController.getCoolThings())
				{
					temp += current.toString() + "\n";
				}
				textArea.setText(baseController.showCoolLevels());
				textArea.setText(temp);
			}
		});
	}
	

}
