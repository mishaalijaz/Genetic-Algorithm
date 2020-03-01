package mutation;

import java.util.List;
import java.util.Random;

import population.Chromosome;

/**
 * Concrete class AddOrSubtract which extends class Mutation.This class defines the abstract method
 * mutation, add or subtract a number for Value encoding of Chromosome.
 * @see Mutation
*/
public class AddOrSubtract extends Mutation{
	
	/**AddOrSubtract class constructor*/
	public AddOrSubtract()
	{
		System.out.println("Constructor : AddOrSubtract");
	}
	
	/**
	 *  The method mutation implements the mutation type change order of numbers for Value Encoding.
	 * @param child chromosome  
	 * @return mutated choromosome
	 * 
	*/
	
    public Chromosome mutation(Chromosome child)
    {
    	Random randomNumber = new Random();
    	int numGenes=child.getNumGenes();
    	List<Integer> genes=child.getGenes();
    	
    	int index1 = randomNumber.nextInt(numGenes);
    	int index2= randomNumber.nextInt(numGenes);
    	//System.out.println("before mutation" + genes[index]);
    	genes.set(index1,genes.get(index1)|1);
    	genes.set(index2,genes.get(index2)|1);
    	return child;    	
    }
}
