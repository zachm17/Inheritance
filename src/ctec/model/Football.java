package ctec.model;

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
	
	
}


