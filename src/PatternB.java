/**
 * Homework3 - 5.4: Displays a pattern
 * 
 * CIS2571-001
 * @author Darryl Karney
 * @version 18Jun2018
 */

public class PatternB {

	public static void main(String[] args) {
		//Display pattern
		for(int i = 1; i <= 4; i++) {
			int amount = 6;
			int displayNum = 1;
			while(amount > 0) {
				System.out.print(displayNum);
				displayNum++;
				amount--;
			}
			System.out.println("");
		}
	}

}
