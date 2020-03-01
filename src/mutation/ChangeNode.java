package mutation;

import population.Chromosome;

/**
 * Concrete class ChangeNode which extends class Mutation.This class defines the abstract method
 * mutation, changing nodes for Tree encoding of Chromosome.
 * @see Mutation
 */
public class ChangeNode extends Mutation{
	
	/**ChangeNode class constructor*/
	public ChangeNode()
	{
		//System.out.println("Constructor : ChangeNode");
	}
	
	/**
	 * The method mutation implements the mutation type change nodes for Tree encoding Chromosomes.
	 * Note: This method is not implemented since the algorithm is implemented for binary encoding
	 * @param child chromosome   
	 * @return mutated chromosome
	 */
    public Chromosome mutation(Chromosome child)
    {
    	System.out.println("Mutation");
    	return child;//Dummy
    }
}
