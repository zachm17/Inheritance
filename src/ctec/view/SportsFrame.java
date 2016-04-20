package ctec.view;

import javax.swing.JFrame;
import java.awt.*;
import ctec.controller.SportsController;



public class SportsFrame extends JFrame
{
	private SportsController baseController;
	private SportsPanel basePanel;
	
	public SportsFrame(SportsController baseController)
	{
		this.baseController = baseController;
		basePanel = new SportsPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel); //Must be first line of setupFrame! - Installs the panel in the frame.
		this.setSize(800,800);		//Find a good size for the app.	
		this.setTitle("SORT BOYYYY");
		this.setResizable(false);	//Advisable not required.
		this.setVisible(true);		//Must be last line of setupFrame!
	}
	
	public SportsController getBaseController()
	{
		return baseController;
	}
}
