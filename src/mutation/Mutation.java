package mutation;

import population.Chromosome;

/**
 * Abstract class Mutation. This class defines the abstract method mutation. The subclasses
 * implements 
 * the method 'mutation' specific different mutation types
 */
public abstract class Mutation {
	
	/**Mutation class constructor*/
	public Mutation()
	{
		//System.out.println("Constructor:Mutation");
	}

	/**
	 * Abstract method to do mutation.The subclasses will implement the method based on different
	 * types of mutation.
	 * @param child chromosome
	 * @return mutated child chromosome
	 */
	public abstract Chromosome mutation(Chromosome child);
	
	
}