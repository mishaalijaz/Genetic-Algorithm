package crossover;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import population.Chromosome;

/** Two point crossover concrete class - extends CrossOver Abstract class - two crossover point are selected, binary string from beginning of chromosome to the first crossover point is copied from one parent, the part from the first to the second crossover point is copied from the second parent and the rest is copied from the first parent
 * @see CrossOver
 */
public class TwoPointCrossOver extends CrossOver{
	
	/**TwoPoint Crossover class constructor
	*/
	public TwoPointCrossOver()
	{
		//System.out.println("Constructor : TwoPointCrossOver");
	}
	
	/**Concrete method to implement single point crossover - overrides the abstract crossOver method
	 * @param parent1 for first parent
	 * @param parent2 for second parent
	 * @return child chromosome after crossover */
    public Chromosome crossover(Chromosome parent1,Chromosome parent2)
    {
    	System.out.println("Crossover");
    	Random randomNumber = new Random();
    	int numGenes=parent1.getNumGenes();
    	List<Integer> genes1,genes2;
    	List<Integer> childGenes = new ArrayList<Integer>(numGenes);
    	
    	/*Select a random cross over point*/
    	int point = randomNumber.nextInt(numGenes);
    	int point1 = randomNumber.nextInt(numGenes);
    	genes1=parent1.getGenes();
    	genes2=parent2.getGenes();
    
    	/*Copy till point from parent1*/
    	for(int i=0;i<point;i++) {
    		childGenes.add(i,genes1.get(i));
    	}
    	/*Copy rest from parent2*/
    	for(int i=point;i<point1;i++) {
    		childGenes.add(i,genes2.get(i));
    	}
    	for(int i=point1;i<numGenes;i++) {
    		childGenes.add(i,genes1.get(i));
    	}
    	
    	Chromosome<Integer> child = new Chromosome<Integer>(childGenes,numGenes);
    	return child;
    }
}
