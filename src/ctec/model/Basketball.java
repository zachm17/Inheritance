package ctec.model;

import ctec.controller.SportsController;



public class Basketball extends Sports
{
	private String TeamName;
	private String Place;
	private Long PointsScored;

	
	
	public Basketball()
	{
		this.setTeamName("Utah Jazz");
		this.setPointsScored(111);
		this.setPlace("Vivint Arena");
	}
	
	public Basketball(SportsController baseController)
	{
		
	}
}
