/**
 * Class that is being used to test our recursive dice roller
 * @author Joshua Domzalski
 * CS215
 * Fall 2022
 */
public class RecDieRollDriver {

	public static void main(String[] args) {
		/**
		 * Creating an instance of the RecDieRoller class
		 */
		RecDieRoller a = new RecDieRoller();
	
		/**
		 * This call to the roll method was before I updated the code to run a thousand trials. When the original roll method 
		 * is edited out, this call will print the results of a single trial.
		 */
		
		//a.roll();
		
		/**
		 * Method call to thousandRolls method that displays the average number of rolls it takes to roll a two
		 */
		a.thousandRolls();
		
		

	}//end main

}//end class
