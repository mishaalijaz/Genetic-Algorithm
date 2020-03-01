package replacement;

import java.util.List;
import java.util.Random;

import population.Chromosome;
import population.Population;
   /**
    * The ReplacementRandom concrete class extends from Replacement abstract class. It is responsible for random replacement of chromosomes from the
    * population by the child chromosome.
    * @see Replacement
    */

public class ReplacementRandom extends Replacement{
    /**
     * Constructor for ReplacementRandom class
     */
	public ReplacementRandom() {
		//System.out.println("Constructor:ReplacementRandom");
	}
        
        /**
         * This method randomly replaces chromosome(individual) from the population
         * randomly with out no bias and introduces the new offspring(child) into
         * the population.
         * Population is where the new child will be inserted and the randomly
         * selected chromosome or individual will be removed and replaced by the 
         * new offspring. This method is inherited from the superclass replacement
         * and customized inside the ReplacementRandom class.
         * @param population the population in which RandoomReplacement will be performed on.
         * @param child the child chromosome which will replace the randomly selected chromosome from the population.
         */
	public void replace(Population population,Chromosome child) {
		Random rn=new Random();
		/*Get a random index*/
		int index= rn.nextInt(population.getPopulationSize());
    	
		List<Chromosome<Integer>> ch = population.getChromosomes();
    	/*Calculate the fitness of the child chromosome*/
    	population.calculateFitness(child);
    	/*If the fitness of child is greater than the random chromosome then replace with the child*/
    	if(ch.get(index).getFitness() < child.getFitness()) {
    		System.out.println("The least fittest replaced chromosome is at index: "+index );
    	    ch.set(index, child);
    	}
    }
}
