package replacement;

import java.util.*;

import population.Chromosome;
import population.Population;
/**
 * This concrete class extends from Replacement abstract class. It is responsible for replacing the offspring with one chromosome in the population.
 * a chromosome or individual will be replaced by an offspring when it is deemed 
 * to be the least fittest depending on the fitness calculation. 
 * @see Replacement
 */
public class ReplacementLeastFittest  extends Replacement {
	/**
         * ReplacementLeastFittest class constructor
         */
	public ReplacementLeastFittest() {
		//System.out.println("Constructor:ReplacementRandom");
	}
       /**
        * The replace method accepts Population and Chromosome type parameters 
        * and replaces the least fittest individual with the new child(offspring).
        * This method is inherited from the superclass replacement and customized
        * inside the ReplacementLeastFittest class.
        * Population is where the new child will be inserted and the least fittest
        * chromosome(individual) removed and replaced by the new offspring.
        * @param population the population in which Replacement of the leastFittest will be performed on.
        * @param child the child chromosome which will replace the list fittest from the population.
        * 
        */
    public void replace(Population population,Chromosome child) {
    	/*Get the index of the least fittest chromosome*/
    	int index= population.getLeastFittest();
    	
    	List<Chromosome<Integer>> ch = population.getChromosomes();
    	/*Calculate the fitness of the child chromosome*/
    	population.calculateFitness(child);
    	/*If the fitness of child is greater than the least fittest then replace the least fittest with the child*/
    	if(ch.get(index).getFitness() < child.getFitness()) {
    		System.out.println("The least fittest replaced chromosome is at index: "+index );
    	    ch.set(index, child);
    	}
    }
}
