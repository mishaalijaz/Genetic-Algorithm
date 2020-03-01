package selection;

import java.util.Iterator;
import java.util.List;

import population.Chromosome;
import population.Population;
/**
 * This concrete class extends Selection. It sorts population according to fitness value and ranks them.
 * @see Selection
*/
public class RankSelection extends Selection{
    /**
     * Constructor for the RankSelection class
     */
    public RankSelection()
	{
		System.out.println("Constructor : RankSelection");
	}
    /**
     * A select method which is inherited from the abstract class selection
     * and implemented in the concrete class RankSelection class.
     * The method accepts population and selects parents based on the Rank
     * Selection which ranks the population based on fitness value.
     * Note: This method is not implemented since the algorithm is implemented for binary encoding
     * @param population the population in which the rank selection will be performed on.
     * @return Chromosome
     */
    public Chromosome select(Population population)
    {
    	System.out.println("Select the Fittest using Rank selection");
        /*Dummy implementation*/
    	List<Chromosome<Integer>> chromosome =population.getChromosomes();
    	Iterator<Chromosome<Integer>> iterator = chromosome.iterator();
    	return iterator.next();
    }
}
