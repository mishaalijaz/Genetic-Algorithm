/** The crossover contains all implementations of CrossOver
 * */
package crossover;

import population.Chromosome;

/** 
 * Abstract class for Crossover. This class defines the abstract method CrossOver. Crossover selects genes from parent chromosomes and creates new offspring.
 * */
public abstract class CrossOver {
	
	/**CrossOver class constructor
	*/
	public CrossOver()
	{
		//System.out.println("Constructor:CrossOver");
	}

/**Abstract method to be overriden by concrete crossover classes
 * @param p1 for first parent
 * @param p2 for second parent
 * @return child chromosome after crossover */
	public abstract Chromosome crossover(Chromosome p1,Chromosome p2);
	
	
}