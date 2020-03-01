package selection;

import java.util.Iterator;
import java.util.List;

import population.Chromosome;
import population.Population;
/**
 * This concrete class extends from Selection. It is used to do a StudystateSelection. 
 * The class implements the selection method from the Selection class.
 * @see Selection
 */
public class StudystateSelection extends Selection{
    /**
     * Constructor for the StudystateSelection class.
     */
    public StudystateSelection()
	{
		System.out.println("Constructor : StudystateSelection");
	}
    /**
     *  A select method which is inherited from the abstract class selection
     * and implemented in the RankSelection class.
     * The method accepts population and selects parents based on the study state
     * Selection which ranks the population based on fitness value.
     * Note: This method is not implemented since the algorithm is implemented for binary encoding
     * @param population the population in which the study state selection will be performed on.
     * @return Chromosome   
     *
     */
    public Chromosome select(Population population)
    {
    	/*Dummy implementation*/
    	List<Chromosome<Integer>> chromosome =population.getChromosomes();
    	Iterator<Chromosome<Integer>> iterator = chromosome.iterator();
    	return iterator.next();
    }
}