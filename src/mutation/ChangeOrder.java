package mutation;

import java.util.List;
import java.util.Random;

import population.Chromosome;

/**
 * Concrete class ChangeOrder which extends class Mutation.This class defines the abstract method
 * mutation, changing nodes for Tree encoding of Chromosome.
 * @see Mutation
 */
public class ChangeOrder extends Mutation{
	/**ChangeOrder class constructor*/
	public ChangeOrder()
	{
		System.out.println("Constructor : ChangeOrder");
	}
	
	/**
	 * The method mutation implements the mutation type change order of numbers for Permutation Encoding.
	 * Note: This method is not implemented since the algorithm is implemented for binary encoding
	 * @param child chromosome  
	 * @return mutated chromosome  
	 */
    public Chromosome mutation(Chromosome child)
    {
    	Random randomNumber = new Random();
    	int numGenes=child.getNumGenes();
    	List<Integer> genes=child.getGenes();
    	int index1 = randomNumber.nextInt(numGenes);
    	int index2 = randomNumber.nextInt(numGenes);
    	int temp;
    	
    	temp = genes.get(index1);
    	genes.set(index1, genes.get(index2));
    	genes.set(index2,temp);
    	return child; 
    }
}
