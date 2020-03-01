package selection;

import java.util.*;
import java.util.Random;

import population.Chromosome;
import population.Population;
/**
    * This concrete class extends from Selection. In RWSelection, Parents are selected according to their fitness. The better the chromosomes are, the more chances to be selected they have.
    * @see Selection
    */
public class RWSelection extends Selection{
    /**
     * constructor for the RWSelection class
     */
    public RWSelection()
	{
		//System.out.println("Constructor : RWSelection");
	}
	
/**
 * A select method which is inherited from the abstract class selection
 * and implemented in the RWSelection.
 * The method accepts population and selects parents based on the Roulette
 * Wheel Selection.
 * @param population - the population which the selection will be done from.
 * @return Chromosome 
 */
    public Chromosome select(Population population)
    {
    	
    	int sum=0;
    	Random random = new Random();
    	List<Chromosome<Integer>> chromosome =population.getChromosomes();
    	Iterator<Chromosome<Integer>> iterator = chromosome.iterator();
    	Chromosome temp = null;
    	
    	   	
    	/*get the total fitness of the population*/
    	sum = population.getTotalFitness();
    	   	
    	int randomNumber = random.nextInt(sum+1);
    	int newsum=0;
    	int index=0;
    	
    	while (iterator.hasNext()) {
			temp = iterator.next();
			newsum+=temp.getFitness();
			if(newsum>randomNumber) {
    		 	break;
    		}
		}
    	
    	return temp;
    	
        	
    }
}
