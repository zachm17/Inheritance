package ctec.controller;

import java.util.ArrayList;
import ctec.model.Basketball;
import ctec.model.CoolThing;
import ctec.model.Football;
import ctec.model.NissanCar;


public class SportsController
{
	
	public SportsController()
	{
		//build all model components
		makeCoolList();
		//build view
	}
	private String TeamName;
	private String Place;
	private long PointsScored;
	
	private ArrayList<CoolThing> coolThings;
	
	public String showCoolLevels()
	{
		String coolLevels = "";
		for(CoolThing currentCool : coolThings)
		{
			coolLevels.concat("This is a " + currentCool.toString() + " and has a silliness level of " + currentCool.coolnessLevel() + "\n");
		}
		
		return coolLevels;
	}
	
	private void makeCoolList()
	{
		coolThings.add(new Basketball());
		coolThings.add(new Football());
		coolThings.add(new NissanCar());
	}
	
	public void start()
	{
		
	}
}
