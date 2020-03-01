package crossover;

import java.util.*;
import population.Chromosome;

/** 
 * Single point crossover concrete class - extends Abstract class Crossover
 *- one crossover point is selected, binary string from beginning of chromosome to the crossover point is copied from one parent, the rest is copied from the second parent 
 * @see CrossOver
 */
public class SinglePointCrossOver extends CrossOver{
	
	/**SinglePoint class constructor
	*/
	public SinglePointCrossOver()
	{
		//System.out.println("Constructor : SinglePointCrossOver");
	}
	
	/**Concrete method to implement Single Point Crossover - overrides the abstract crossOver method
	 * @param parent1 for first parent
	 * @param parent2 for second parent
	 * @return child chromosome after crossover
	 */
    public Chromosome crossover(Chromosome parent1,Chromosome parent2)
    {
    	Random randomNumber = new Random();
    	int numGenes=parent1.getNumGenes();
    	List<Integer> genes1,genes2;
    	List<Integer> childGenes = new ArrayList<Integer>(numGenes);
    	    	
    	
    	/*Select a random cross over point*/
    	int point = randomNumber.nextInt(numGenes);
    	
    	genes1=parent1.getGenes();
    	genes2=parent2.getGenes();
    
    	/*Copy till point from parent1*/
    	for(int i=0;i<point;i++) {
    		childGenes.add(i,genes1.get(i));
    	}
    	/*Copy rest from parent2*/
    	for(int i=point;i<numGenes;i++) {
    		childGenes.add(i,genes2.get(i));
    	}
    	
    	Chromosome<Integer> child = new Chromosome<Integer>(childGenes,numGenes);
    	return child;
    }
}
