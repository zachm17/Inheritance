package ctec.model;

import javax.swing.JOptionPane;

public class Football extends Sports
{
	private String TeamName;
	private String Place;
	private Long PointsScored;

	public Football()
	{
		super();
		
		this.setTeamName("Seahawks");
		this.setPointsScored(27);
		this.setPlace("CenturyLink Field");
		
	}

	public String toString()

	{

	String description = "This is a " + this.getClass().getName() + " and has a cost of: " + cost();


	return description;

	}
	
	public double coolnessLevel()
	{
		
		return 20;
	}

	
	public void coolAction(int numberOfTimes)
	{
		for(int spot = 0; spot < numberOfTimes; spot++)
		{
			JOptionPane.showMessageDialog(null, "This sport is fun." );
		}
		
	}

	
	public int cost()
	{
		return 500;
	}

	
	public void EthanBradberry(int numberOfTimes)
	{
		for(int spot = 0; spot < numberOfTimes; spot++)
		{
			
			JOptionPane.showMessageDialog(null, "IM ETHAN BRADBERRY");
		}
		
	}
	
	
}


