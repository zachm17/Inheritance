package ctec.model;

public abstract class Sports implements CoolThing, Comparable
{
	//Three data members
	private String teamName;
	private String place;
	private long pointsScored;
	/**
	 * @return the place
	 */
	public String getPlace()
	{
		return place;
	}
	/**
	 * @param place the place to set
	 */
	public void setPlace(String place)
	{
		this.place = place;
	}
	/**
	 * @return the teamName
	 */
	public String getTeamName()
	{
		return teamName;
	}
	/**
	 * @return the pointsScored
	 */
	public long getPointsScored()
	{
		return pointsScored;
	}
	/**
	 * @param teamName the teamName to set
	 */
	public void setTeamName(String teamName)
	{
		this.teamName = teamName;
	}
	/**
	 * @param pointsScored the pointsScored to set
	 */
	public void setPointsScored(long pointsScored)
	{
		this.pointsScored = pointsScored;
	}
	
	public String toString()
	{
		String description = "This is a " + this.getClass().getName() + " and has a cost of: ";
		
		return description;
		
	}
	
	/**
	 * If the supplied variable compared comes bee the calling variable
	 * return 1.
	 * If the supplied variable is after the calling variable return -1.
	 * Else if they are the same, return 0.
	 */
	
	public int compareTo(Object compared)
	{
		int comparedValue = Integer.MIN_VALUE;
		
		if( compared instanceof CoolThing)
		{
			if(this.coolnessLevel() > ((CoolThing)compared).coolnessLevel())
			{
				comparedValue = 1;
			}
			else if(this.coolnessLevel() > ((CoolThing)compared).coolnessLevel())
			{
				comparedValue = -1;
			}
			else
			{
				comparedValue = 0;
			}
		}
		
		return comparedValue;
		
	}
}
