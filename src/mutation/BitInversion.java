package mutation;


import java.util.List;
import java.util.Random;

import population.Chromosome;

/**
 * Concrete class BitInversion which extends class Mutation.This class defines the abstract method
 * mutation, bit inversion for binary encoding of Chromosome.
 * @see Mutation
 */
public class BitInversion extends Mutation{
	
	/**
	 * BitInversion class constructor	 
	*/
	public BitInversion()
	{
		//System.out.println("Constructor : BitInversion");
	}
	
	/**
	 * The method mutation implements the mutation type bitinversion for binary encoding Chromosomes.
	 * @param child chromosome 
	 * @return mutated chromosome
	 */
	
    public Chromosome mutation(Chromosome child)
    {
    	Random randomNumber = new Random();
    	int numGenes=child.getNumGenes();
    	List<Integer> genes=child.getGenes();
    	
    	int index1 = randomNumber.nextInt(numGenes);
    	int index2= randomNumber.nextInt(numGenes);
    	
    	genes.set(index1,genes.get(index1)^1);
    	genes.set(index2,genes.get(index2)^1);
    	return child;    	
    	
    }
}
