package crossover;

import population.Chromosome;

/**Tree crossover concrete class - extends CrossOver Abstract class - in both parent one crossover point is selected, parents are divided in that point and exchange part below crossover point to produce new offspring
 * @see CrossOver
 */

public class TreeCrossOver extends CrossOver{
	
	/**TreeCrossOver class constructor
	*/
	public TreeCrossOver()
	{
		//System.out.println("Constructor : TreeCrossOver");
	}
	
	/**Concrete method to implement TreeCrossover - overrides the abstract crossOver method
	 * Note: This method is not implemented since the algorithm is implemented for binary encoding.
	 * @param parent1 for first parent
	 * @param parent2 for second parent
	 * @return child chromosome after crossover
	 * 
	*/
	public Chromosome crossover(Chromosome parent1,Chromosome parent2)
    {
    	System.out.println("Crossover");//Dummy implementation
    	return parent1;
    }
}
