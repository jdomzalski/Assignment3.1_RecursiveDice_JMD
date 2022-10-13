import java.util.*;
/**
 * This is the DieRoller class that contains methods to roll a single dice as well as calculate the average number of rolls needed to 
 * roll a two over a thousand trials.
 * @author Joshua Domzalski
 * CS215
 * Fall 2022
 */
public class RecDieRoller {
	
	/**
	 * Creating a new random variable roll, as well as a new ArrayList instance that will be used when calculating the average over 
	 * a thousand rolls.
	 */
	Random roll = new Random();
	ArrayList<Integer> res = new ArrayList();
	
	/**
	 * Recursive roll method that rolls a random dice, checks if the result is a two, and if it is not, calls itself again until
	 * the result does equal two. All rolls are then printed to the console.
	 * I edited this method out when I updated my code to run the thousand test runs, as I did not want to print out the results of 
	 * a thousand trials
	 */
	
	/*public void roll() {
		int dieFace;
		dieFace = roll.nextInt(6)+1;
		if(dieFace!= 2) {
			System.out.println(dieFace);
			roll();
		}
		else
			System.out.println(dieFace);
	}*/
	
	/**
	 * A method very similar to the above edited out one. The main difference here is that instead of printing the results out,
	 * I am adding them to an ArrayList so I can then use this ArrayList to more easily calculate the average.
	 * @return An ArrayList of roll values
	 */
	public ArrayList<Integer> roll(){
		Integer dieFace;
		dieFace = roll.nextInt(6)+1;
		if(dieFace != 2) {
			res.add(dieFace);
			roll();
		}
		else
			res.add(dieFace);
		return res;
	}
	
	/**
	 * A method that calls the above roll method a thousand times and gets the size of the ArrayList for each trial.
	 * The total of these sizes is then divided by a thousand to get the result of the average, and the answer is printed to the user.
	 * @return A double representing the expected number of rolls needed to roll a 2.
	 */
	public double thousandRolls() {
		double avg = 0;
		for(int i = 1; i<= 1000; i++) {
			roll();
			avg = res.size();
		}
		System.out.println("For a thousand tries, the average number of rolls it took us to roll a two was "+ (avg/1000));
		return avg;
	}
}//end class

