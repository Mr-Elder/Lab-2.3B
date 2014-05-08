/**
 * @(#)Lab2_3B.java
 *
 *
 * @author 
 * @version 1.00 2013/10/17
 */

import java.text.DecimalFormat;

public class Lab2_3B {

	public static void main(String[] args)
	{
		//Declaring finals
		final int COVERAGE = 350;
		final int door = 20;
		final int window = 15;
		
		//Decimal format with no sig. 0's
		DecimalFormat dFormat = new DecimalFormat("0.###");
		
		//Other initial declarations
		double height;
		double width;
		double length;
		double totalSurfaceArea;
		
		int doorCount;
		int windowCount;
		
		//Asking for input for length and height and doors and windows
		height=GetInfo.getDouble("Enter the height of the room");
		width =GetInfo.getDouble("Enter the width of the room.");
		length=GetInfo.getDouble("Enter the length of the room.");
		
		doorCount = GetInfo.getInt("How many doors do you have?");
		windowCount = GetInfo.getInt("How many windows do you have?");
		
		//Calculating the areas of the walls
		totalSurfaceArea=(length*height*2) + (width*height*2) - windowCount*window - doorCount*door;
		
		//Final output
		GetInfo.showMessage("Your room is " + dFormat.format(totalSurfaceArea) + " square feet\n" + "Gallon(s) of paint needed: " + dFormat.format(Math.ceil(totalSurfaceArea/COVERAGE)) + "\nLength: " + length + "\nWidth: " + width + "\nHeight: " + height );
		
			
	}
    
    
}