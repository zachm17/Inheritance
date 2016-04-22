package ctec.model;

import java.util.ArrayList;

import javax.swing.JOptionPane;



public class ChapterBook extends Book

{

private String bookName;

private String mainCharacter;

private int yearWritten;


public ChapterBook()

{

this.setBookName("The Hunger Games");

this.setMainCharacter("Katniss");

this.setYearWritten(2008);

}

public String toString()

{

String description = "This is a " + this.getClass().getName() + " and has a cost of: " + cost();


return description;

}

public double coolnessLevel()

{

return 5;

}



public void coolAction(int numberOfTimes)

{

for(int spot = 0; spot < numberOfTimes; spot++)

{

JOptionPane.showMessageDialog(null, "This is cool!");

}

}



public int cost()

{


return 15;

}



public void EthanBradberry(int numberOfTimes)

{

for(int spot = 0; spot < numberOfTimes; spot++)

{

JOptionPane.showMessageDialog(null, "I'm Ethan Bradberry!");

}

}



@Override
public int compareTo(Object thing)
{
	// TODO Auto-generated method stub
	return 0;
}

}