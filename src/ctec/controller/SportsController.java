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
	
	private void swap(int firstLocation, int secondLocation)
	{
		CoolThing temp = coolThings.get(firstLocation);
		coolThings.set(firstLocation, coolThings.get(secondLocation));
		coolThings.set(secondLocation, temp);
	}
	
	public void insertionSort()
	{
		for(int outerLoop = 1; outerLoop < coolThings.size(); outerLoop++)
		{
			int innerLoop = outerLoop;
			while(innerLoop > 0 && (coolThings.get(innerLoop-1).compareTo(coolThings.get(innerLoop))) > 0)
			{
				swap(innerLoop, innerLoop-1);
				innerLoop--;
			}
		}
	}
	
}
