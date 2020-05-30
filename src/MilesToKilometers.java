/**
 * Homework3 - 5.4: Displays a table with conversions from miles to kilometers for 1 through  10
 * 
 * CIS2571-001
 * @author Darryl Karney
 * @version 18Jun2018
 */

public class MilesToKilometers {

	public static void main(String[] args) {
		//Create variables
		double kilometers = 1.609;
		
		//Display table
		System.out.println("Miles    Kilometers");
		for(int i = 1; i <= 10; i++) {
			String spacing;
			
			if (i < 10) {
				spacing = "        ";
			} else {
				spacing = "       ";
			}
			
			System.out.println(i + spacing + (i * kilometers));
		}
	}

}
